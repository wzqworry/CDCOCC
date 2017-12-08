/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wzq on 2017/6/5.
 * 本工具的作用是创建一个excel 读取 map里面的值，创建表头 和表尾
 *
 */
public class ExcelUtil {
    /**
     *  根据传入的 book 写title，info，head 返回book
     */
    public Workbook setHead(Workbook book,Map<String, Object> params,String[] column){
        Sheet sheet = book.createSheet();
        CellStyle cellStyle = book.createCellStyle();
        cellStyle.setAlignment(HorizontalAlignment.CENTER); // 居中
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);//垂直
        if (sheet != null) {
            //设置title
            Row titleRow = sheet.createRow(0);
            Cell titleCell = titleRow.createCell(0);
            titleCell.setCellValue((String) params.get("title"));
            titleCell.setCellStyle(cellStyle);

            //设置info
            Row infoRow = sheet.createRow(1);
            Cell infoCell_1 = infoRow.createCell(0);
            Cell infoCell_2 = infoRow.createCell(1);
            Cell infoCell_3 = infoRow.createCell(2);
            Cell infoCell_4 = infoRow.createCell(3);
            infoCell_1.setCellValue("运营日期:"+ params.get("startDate")+"-"+params.get("endDate"));
            infoCell_2.setCellValue("时间间隔:"+ params.get("timeGrade"));
            if(params.get("startTime")!=null){
            infoCell_3.setCellValue("查询时段:"+ params.get("startTime")+"-"+ params.get("endTime"));
            }
            infoCell_4.setCellValue("制表时间:"+ params.get("currentTime"));

            //设置head
            Row headRow = sheet.createRow(2);

            CellStyle bgStyle = book.createCellStyle();
            bgStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
            bgStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            for(int i=0;i<column.length;i++){
                Cell headCell = headRow.createCell(i);
                headCell.setCellValue(column[i]);
                headCell.setCellStyle(bgStyle);
                //设置列宽
                sheet.setColumnWidth(i,8*2*256);
            }

            //合并title的单元格
            CellRangeAddress ca = new CellRangeAddress(0,0,0,column.length-1);
            sheet.addMergedRegion(ca);
        }
        return book;
    }
    public Workbook setFoot(Workbook book,int row,int column){
        Sheet sheet = book.getSheetAt(0);

        Row footRow = sheet.createRow(row);
        Cell footCell_1 = footRow.createCell(0);
        footCell_1.setCellValue("制表人：综合监控");
        Cell footCell_2 = footRow.createCell(column-1);
        footCell_2.setCellValue("复核:");
        return book;
    }

    /**
     * 查找包含某字符所有的列对象。（可能无法读取单元格里面的内容)
     * 解决方法，先读取sheet中所有的合并的单元格，循环在获取到row和cloumn的时候判断是否落在合并的单元格里面
     * @param params     【文本集合】
     * @param book       【Excel对象】
     * @return
     */
    public void replaceText(Workbook book, Map<String, Object> params) {
        Sheet sheet = book.getSheetAt(0);
        if (sheet != null) {
            int minRow = sheet.getFirstRowNum();
            int maxRow = sheet.getLastRowNum();
            if (maxRow > minRow) {
                for (int i = minRow; i < maxRow; i++) {
                    Row row = sheet.getRow(i);
                    short minColIx = row.getFirstCellNum();
                    short maxColIx = row.getLastCellNum();
                    for (short colIx = minColIx; colIx < maxColIx; colIx++) {
                        Cell cell = row.getCell(colIx);
                        if (cell == null) {
                            continue;
                        }
                        //查看匹配 匹配上了,就替换掉
                        if(this.matcher(cell.getStringCellValue()).find()){
                            String str = cell.getStringCellValue();

                            for (String key : params.keySet()) {
                                if (str.indexOf(key) >= 0) {
                                    cell.setCellValue((String) params.get(key));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    /**
     * 正则匹配字符串
     *
     * @param str
     * @return
     */
    private Matcher matcher(String str) {
        Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        return matcher;
    }

    /**
     * 关闭输入流
     *
     * @param is
     */
    public void close(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭输出流
     *
     * @param os
     */
    public void close(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 用于将excel表格中列索引转成列号字母，从A对应1开始
     *
     * @param index
     *            列索引
     * @return 列号
     */
    public static String indexToColumn(int index) {
        if (index <= 0) {
            try {
                throw new Exception("Invalid parameter");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String column = "";
        do {
            if (column.length() > 0) {
                index--;
            }
            column = ((char) (index % 26 + (int) 'A')) + column;
            index = (int) ((index - index % 26) / 26);
        } while (index > 0);
        return column;
    }
}
