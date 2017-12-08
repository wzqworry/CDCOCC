/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import java.io.*;
import java.net.URLEncoder;
import java.util.*;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by wzq on 2017/3/27.
 * csv 生成工具类
 */
public class CSVUtils {
    /**
     * 生成为CVS文件
     * @param exportData
     *       源数据List
     * @param map
     *       csv文件的列表头map
     * @param outPutPath
     *       文件路径
     * @param fileName
     *       文件名称
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static File createCSVFile(List exportData, LinkedHashMap map, String outPutPath,String fileName) {
        File csvFile = null;
        BufferedWriter csvFileOutputStream = null;
        try {
            File file = new File(outPutPath);
            if (!file.exists()) {
                file.mkdir();
            }
            //定义文件名格式并创建
            csvFile = File.createTempFile(fileName, ".csv", new File(outPutPath));
            System.out.println("csvFile：" + csvFile);
            // UTF-8使正确读取分隔符","
            csvFileOutputStream = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(
                    csvFile), "UTF-8"), 1024);
            System.out.println("csvFileOutputStream：" + csvFileOutputStream);
            // 写入文件头部
            for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator.hasNext();) {
                java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
                csvFileOutputStream
                        .write("" + (String) propertyEntry.getValue() != null ? (String) propertyEntry
                                .getValue() : "" + "");
                if (propertyIterator.hasNext()) {
                    csvFileOutputStream.write(",");
                }
            }
            csvFileOutputStream.newLine();
            // 写入文件内容
            for (Iterator iterator = exportData.iterator(); iterator.hasNext();) {
                Object row = (Object) iterator.next();
                for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator
                        .hasNext();) {
                    java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator
                            .next();
                    csvFileOutputStream.write((String) BeanUtils.getProperty(row,
                            (String) propertyEntry.getKey()));
                    if (propertyIterator.hasNext()) {
                        csvFileOutputStream.write(",");
                    }
                }
                if (iterator.hasNext()) {
                    csvFileOutputStream.newLine();
                }
            }
            csvFileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                csvFileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return csvFile;
    }

    /*
    *List exportData = new ArrayList<Map>();
        Map row1 = new LinkedHashMap<String, String>();
        row1 = new LinkedHashMap<String, String>();
        row1.put("1", "11");
        row1.put("2", "12");
        row1.put("3", "13");
        row1.put("4", "14");
        exportData.add(row1);
        row1.put("1", "11");
        row1.put("2", "12");
        row1.put("3", "13");
        row1.put("4", "14");
        exportData.add(row1);
        LinkedHashMap map = new LinkedHashMap();
        map.put("1", "第一列");
        map.put("2", "第二列");
        map.put("3", "第三列");
        map.put("4", "第四列");
    * */
    public static void download(HttpServletResponse response,List exportData, LinkedHashMap map, String fileName) throws IOException{
        response.setContentType("application/csv");
        response.setCharacterEncoding("GB2312");
        response.setHeader("Content-Disposition",
                "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
        PrintWriter writer = response.getWriter();


        try {
            //文件头
            for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator.hasNext();) {
                java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
                writer.write("" + (String) propertyEntry.getValue() != null ? (String) propertyEntry
                        .getValue() : "" + "");
                if (propertyIterator.hasNext()) {
                    writer.write(",");
                }
            }
            writer.println();
            // 写入文件内容
            for (Iterator iterator = exportData.iterator(); iterator.hasNext();) {
                Object row = (Object) iterator.next();
                for (Iterator propertyIterator = map.entrySet().iterator(); propertyIterator.hasNext();) {
                    java.util.Map.Entry propertyEntry = (java.util.Map.Entry) propertyIterator.next();
                    writer.write(BeanUtils.getProperty(row,(String)propertyEntry.getKey() != null?(String)propertyEntry.getKey():""));
                    //writer.write((String) BeanUtils.getProperty(row,(String) ((propertyEntry.getKey()== null)?"":propertyEntry.getKey())));
                    if (propertyIterator.hasNext()) {
                        writer.write(",");
                    }
                }
                if (iterator.hasNext()) {
                    writer.println();
                }
            }
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
