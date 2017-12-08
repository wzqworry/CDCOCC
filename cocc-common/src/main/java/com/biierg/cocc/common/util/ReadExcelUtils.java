/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 读取Excel
 *
 * @author wen.ding
 * @date 2017/7/17 15:43
 * @email dingwenbj@foxmail.com
 */
public class ReadExcelUtils {
    private Logger logger = LoggerFactory.getLogger(ReadExcelUtils.class);
    private Workbook workbook;
    private Sheet sheet;
    private Row row;
    private int maxCelNum = 0;

    private int sheetNum = 0; // 第sheetnum个工作表


    public ReadExcelUtils(String filepath) {
        if (filepath == null) {
            return;
        }
        String ext = filepath.substring(filepath.lastIndexOf("."));
        try {
            InputStream is = new FileInputStream(filepath);
            if (".xls".equals(ext)) {
                workbook = new HSSFWorkbook(is);
            } else if (".xlsx".equals(ext)) {
                workbook = new XSSFWorkbook(is);
            } else {
                workbook = null;
            }
        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException", e);
        } catch (IOException e) {
            logger.error("IOException", e);
        }
    }


    /**
     * 流
     *
     * @param is
     * @param fileName
     */
    public ReadExcelUtils(InputStream is, String fileName) {
        if (is == null || StringUtil.isNull(fileName)) {
            return;
        }
        String ext = fileName.substring(fileName.lastIndexOf("."));
        try {
            if (".xls".equals(ext)) {
                workbook = new HSSFWorkbook(is);
            } else if (".xlsx".equals(ext)) {
                workbook = new XSSFWorkbook(is);
            } else {
                workbook = null;
            }
        } catch (FileNotFoundException e) {
            logger.error("FileNotFoundException", e);
        } catch (IOException e) {
            logger.error("IOException", e);
        }
    }

    /**
     * 读取Excel表格表头的内容
     *
     * @return String 表头内容的数组
     * @author zengwendong
     */
    public String[] readExcelTitle() throws Exception {
        if (workbook == null) {
            throw new Exception("Workbook对象为空！");
        }
        sheet = workbook.getSheetAt(0);
        row = sheet.getRow(0);
        // 标题总列数
        int colNum = row.getPhysicalNumberOfCells();
        System.out.println("colNum:" + colNum);
        String[] title = new String[colNum];
        for (int i = 0; i < colNum; i++) {
            // title[i] = getStringCellValue(row.getCell((short) i));
            title[i] = row.getCell(i).getCellFormula();
        }
        return title;
    }

    /**
     * 读取Excel数据内容
     *
     * @return Map 包含单元格数据内容的Map对象
     * @author zengwendong
     */
    public Map<Integer, Map<Integer, Map<Integer, Object>>> readExcelContent() throws Exception {
        if (workbook == null) {
            throw new Exception("Workbook对象为空！");
        }
        Map<Integer, Map<Integer, Map<Integer, Object>>> sheetContent = new HashMap<>();
        Map<Integer, Map<Integer, Object>> rowContent = new HashMap<>();
        Map<Integer, Object> celContent = new HashMap<>();
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) { //获取每个Sheet表
//            sheet = workbook.getSheetAt(i);
            for (int j = 0; j < workbook.getSheetAt(i).getPhysicalNumberOfRows(); j++) {//获取每行
                row = workbook.getSheetAt(i).getRow(j);
                if (row == null || row.getPhysicalNumberOfCells() < maxCelNum) {
                    continue;
                } else {
                    maxCelNum = row.getPhysicalNumberOfCells();
                    for (int k = 0; k < row.getPhysicalNumberOfCells(); k++) {//获取每个单元格
//                    Object obj = getCellFormatValue(row.getCell(k));
                        celContent.put(k, getCellValue(j, k));
                    }
                    rowContent.put(j, celContent);
                    celContent = new HashMap<>();
                }
            }
            sheetContent.put(i, rowContent);
            rowContent = new HashMap<>();
        }
        return sheetContent;
    }

    /**
     * 根据Cell类型设置数据 TODO 无人使用 待删除
     *
     * @param cell
     * @return
     */
    private Object getCellFormatValue(Cell cell) {
        Object cellvalue = "";
        if (cell != null) {
            // 判断当前Cell的Type
            switch (cell.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC:// 如果当前Cell的Type为NUMERIC
                case Cell.CELL_TYPE_FORMULA: {
                    // 判断当前的cell是否为Date
                    if (DateUtil.isCellDateFormatted(cell)) {
                        // 如果是Date类型则，转化为Data格式
                        // data格式是带时分秒的：2013-7-10 0:00:00
                        // cellvalue = cell.getDateCellValue().toLocaleString();
                        // data格式是不带带时分秒的：2013-7-10
                        Date date = cell.getDateCellValue();
                        cellvalue = date;
                    } else {// 如果是纯数字

                        // 取得当前Cell的数值
                        cellvalue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                case Cell.CELL_TYPE_STRING:// 如果当前Cell的Type为STRING
                    // 取得当前的Cell字符串
                    cellvalue = cell.getRichStringCellValue().getString();
                    break;
                default:// 默认的Cell值
                    cellvalue = "";
            }
        } else {
            cellvalue = "";
        }
        return cellvalue;
    }

//    public static void main(String[] args) {
//        try {
//            String filepath = "D://xx.xlsx";
//            ReadExcelUtils excelReader = new ReadExcelUtils(filepath);
//            // 对读取Excel表格标题测试
////			String[] title = excelReader.readExcelTitle();
////			System.out.println("获得Excel表格的标题:");
////			for (String s : title) {
////				System.out.print(s + " ");
////			}
//
//            // 对读取Excel表格内容测试
//            Map<Integer, Map<Integer, Object>> map = excelReader.readExcelContent();
//            System.out.println("获得Excel表格的内容:");
//            for (int i = 1; i <= map.size(); i++) {
//                System.out.println(map.get(i));
//                for (int j = 0; j < map.get(i).size(); j++) {
//                    System.out.print(map.get(i).get(j));
//                }
//                System.out.println("/t");
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("未找到指定路径的文件!");
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 指定工作表、行、列下的内容
     *
     * @param rowNum
     * @param colNum
     * @return String
     */
    public String getCellValue(int rowNum, int colNum) {
        if (sheetNum < 0 || rowNum < 0) {
            return "";
        }
        String strExcelCell = "";
        try {
            sheet = this.workbook.getSheetAt(sheetNum);
            //判断是否是合并单元格，如果是，就将行、列索引改为合并单元格的索引
            for (int numMR = 0; numMR < this.sheet.getNumMergedRegions(); numMR++) {
                //获取合并单元格
                CellRangeAddress cellRangeAddress = this.sheet.getMergedRegion(numMR);
                int firstColumnInd = cellRangeAddress.getFirstColumn();
                int lastColumnInd = cellRangeAddress.getLastColumn();
                int firstRowInd = cellRangeAddress.getFirstRow();
                int lastRowInd = cellRangeAddress.getLastRow();
                //如果当前单元格在这个合并单元格里
                if (rowNum >= firstRowInd && rowNum <= lastRowInd && colNum >= firstColumnInd && colNum <= lastColumnInd) {
                    rowNum = firstRowInd;
                    colNum = firstColumnInd;
                    break;
                }
            }
            Row row = sheet.getRow(rowNum);
            if (row.getCell((short) colNum) != null) {
                switch (row.getCell((short) colNum).getCellType()) {
                    case Cell.CELL_TYPE_FORMULA:
                        strExcelCell = "FORMULA ";
                        break;
                    case Cell.CELL_TYPE_NUMERIC: {
                        strExcelCell = String.valueOf(row.getCell((short) colNum).getNumericCellValue());
                    }
                    break;
                    case Cell.CELL_TYPE_STRING:
                        strExcelCell = row.getCell((short) colNum).getStringCellValue();
                        break;
                    case Cell.CELL_TYPE_BLANK:
                        strExcelCell = "";
                        break;
                    default:
                        strExcelCell = "";
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strExcelCell;
    }

    /**
     * sheetNum下的记录行数
     *
     * @return int
     */
    public int getRowCount() {
        Sheet sheet = workbook.getSheetAt(this.sheetNum);
        int rowCount = -1;
        rowCount = sheet.getLastRowNum();
        return rowCount;
    }
}