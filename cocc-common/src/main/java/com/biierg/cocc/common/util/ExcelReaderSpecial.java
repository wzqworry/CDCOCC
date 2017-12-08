/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

/**
 * Created by wzq on 2017/4/28.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.biierg.cocc.common.bean.GenMailList;

public class ExcelReaderSpecial {
    private static final String EXTENSION_XLS = "xls";
    private static final String EXTENSION_XLSX = "xlsx";
    private Workbook workbook = null;
    private Sheet sheet = null;//表
    private int sheetNum; // 第sheetnum个工作表
    private static int coloumNum;
    private static int rowNum;

    public void setWorkbook(Workbook workbook) {
        this.workbook = workbook;
    }

    public Workbook getWorkbook() {
        return workbook;
    }

    public void setSheet(Sheet sheet) {
        this.sheet = sheet;
    }

    public void setSheetNum(int sheetNum) {
        this.sheetNum = sheetNum;
    }

    public ExcelReaderSpecial() {
    }

    public ExcelReaderSpecial(InputStream inputStream,String fileName) throws IOException {
        if (fileName.endsWith(EXTENSION_XLS)) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (fileName.endsWith(EXTENSION_XLSX)) {
            workbook = new XSSFWorkbook(inputStream);
        }
         sheet = workbook.getSheetAt(0); // 获得第三个工作薄(2008工作薄)
		//获得总列数
		 coloumNum=sheet.getRow(0).getPhysicalNumberOfCells();
		 rowNum=sheet.getLastRowNum();//获得总行数
    }

    /**
     * 指定工作表、行、列下的内容
     *
     * @param sheetNum
     * @param rowNum
     * @param cellNum
     * @return String
     */
    public String getCellValue(int rowNum, int colNum) {
        if (sheetNum < 0 || rowNum < 0){
            return "";
        }
        String strExcelCell = "";
        try {
            sheet = this.workbook.getSheetAt(sheetNum);
            //判断是否是合并单元格，如果是，就将行、列索引改为合并单元格的索引
            for(int numMR = 0; numMR < this.sheet.getNumMergedRegions(); numMR++){
                //获取合并单元格
                CellRangeAddress cellRangeAddress = this.sheet.getMergedRegion(numMR);
                int firstColumnInd = cellRangeAddress.getFirstColumn();
                int lastColumnInd = cellRangeAddress.getLastColumn();
                int firstRowInd = cellRangeAddress.getFirstRow();
                int lastRowInd = cellRangeAddress.getLastRow();
                //如果当前单元格在这个合并单元格里
                if(rowNum >= firstRowInd && rowNum <= lastRowInd && colNum >= firstColumnInd && colNum <= lastColumnInd){
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
                        double d = row.getCell((short) colNum).getNumericCellValue();
                        //长数字也作为字符串处理
                        DecimalFormat df = new DecimalFormat("#");
                        strExcelCell = df.format(d);
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
    public static void main(String[] args) throws Exception {
    	/**
    	 * 导入表之前需先将Excel表格取消合并单元格 并删除后面没数据的行
    	 */
    	List<GenMailList>  list = new ArrayList<GenMailList>();
		File file = new File("D:\\jj\\通讯录改.xlsx");
		InputStream inputStream = new FileInputStream(file);
		ExcelReaderSpecial eu = new ExcelReaderSpecial(inputStream, "D:\\jj\\通讯录改.xlsx");
		int m=rowNum,n=coloumNum;
		String orgId="";
		for(int i=0;i<m;i++){
			String phoneNumber = "";
			GenMailList genMailList = new GenMailList();
			for(int j=0;j<n;j++){
				String s = eu.getCellValue(i, j);
				if(j==2){
					if(s==""||s==null){
						s = eu.getCellValue(i, 1);
					}
					if(s==""||s==null){
						s = eu.getCellValue(i, 0);
					}
					if(s==""||s==null){
						s = orgId;
					}
					orgId = s;
					genMailList.setOrgID(s);
				}else if(j==3){
					genMailList.setPostID(s);
				}else if(j==4){
					genMailList.setUserName(s);
				}else if(j==5||j==6||j==7){
					phoneNumber += s+",";
				}else if(j==8){
					genMailList.setUserMark(s);
				}
				if(j==7){
					genMailList.setPhoneNumber(phoneNumber);
				}
				System.out.print(s+" ");
			}
			System.out.println();
			list.add(genMailList);
		}
		list = list;
		
	}
}