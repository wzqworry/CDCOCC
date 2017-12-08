package com.biierg.cocc.common.util;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import com.biierg.cocc.common.bean.HisKylLine;
import com.biierg.cocc.common.bean.IGeneticBean;
import com.biierg.cocc.common.bean.RealJczLine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wzq on 2017/2/7.
 */
/*
* 计算图标需要的list 工具，需要解析的bean实现 IGeneticBean 接口，取出需要的值
* */
public class DataAnalyseUtil {
    /*
    * 根据x轴和查询结果计算出相应的返回list  目前使用到的有jzl、czl、hcl
    * @param list 实现了IGeneticBean接口的list
    * @param xAxis string类型的时间作为x轴
    * @return list  拼接好的数据
    * */
    private static Logger logger = LoggerFactory.getLogger(DataAnalyseUtil.class);
    private static SimpleDateFormat sdfHour = new SimpleDateFormat("HH:mm");
    public static List getAnalyseList(List<IGeneticBean> list, List<String> xAxis){
        List chartSeries = new ArrayList();
        Map lineSeries = new HashMap();
        //String data[] = new String[xAxis.size()];
        //没有数据补0
        logger.info("DataAnalyseUtil  根据x轴坐标创建一个大小相同的数组,初始化全部为0");
        int data[] = new int[xAxis.size()];
        String lineName = "";
        //遍历这个list 根据名字来组装数据
        for(IGeneticBean iGeneticBean:list){
            if(lineName.equals("")){
                lineName = iGeneticBean.getLineName();
            }
            if(!iGeneticBean.getLineName().isEmpty() && !lineName.equals(iGeneticBean.getLineName())){
                lineSeries.put("lineName",lineName);
                lineSeries.put("data",data);
                chartSeries.add(lineSeries);
                lineName = iGeneticBean.getLineName();
                //data = new String[xAxis.size()];
                //没有数据补0
                data = new int[xAxis.size()];
                lineSeries = new HashMap();
            }
            if(iGeneticBean.getStartTime() != null){
                String hclTime = sdfHour.format(iGeneticBean.getStartTime());
                for(int i=0;i<xAxis.size();i++){
                    if(xAxis.get(i).equals(hclTime)){
                        //data[i] = String.valueOf(iGeneticBean.getHcl());
                        //没有数据补0
                        data[i] = iGeneticBean.getValue();
                        break;
                    }
                }
            }
        }
        lineSeries.put("lineName",lineName);
        lineSeries.put("data",data);
        chartSeries.add(lineSeries);
        return chartSeries;
    }

    public static List getAnalyseList(List<RealJczLine> list, List<String> xAxis,String type){
        List chartSeries = new ArrayList();
        Map lineSeries = new HashMap();
        //String data[] = new String[xAxis.size()];
        //没有数据补0
        logger.info("DataAnalyseUtil  根据x轴坐标创建一个大小相同的数组,初始化全部为0");
        int data[] = new int[xAxis.size()];
        String lineName = "";
        //遍历这个list 根据名字来组装数据
        for(RealJczLine realJczLine:list){
            if(lineName.equals("")){
                lineName = realJczLine.getLineName();
            }
            if(!realJczLine.getLineName().isEmpty() && !lineName.equals(realJczLine.getLineName())){
                lineSeries.put("lineName",lineName);
                lineSeries.put("data",data);
                chartSeries.add(lineSeries);
                lineName = realJczLine.getLineName();
                //data = new String[xAxis.size()];
                //没有数据补0
                data = new int[xAxis.size()];
                lineSeries = new HashMap();
            }
            if(realJczLine.getStartTime() != null){
                String hclTime = sdfHour.format(realJczLine.getStartTime());
                for(int i=0;i<xAxis.size();i++){
                    if(xAxis.get(i).equals(hclTime)){
                        //data[i] = String.valueOf(realJczLine.getHcl());
                        //没有数据补0
                        if(type.equals("jzl")){
                            data[i] = realJczLine.getJzl();
                        }else{
                            data[i] = realJczLine.getCzl();
                        }

                        break;
                    }
                }
            }
        }
        lineSeries.put("lineName",lineName);
        lineSeries.put("data",data);
        chartSeries.add(lineSeries);
        return chartSeries;
    }

    public static List getKylList(List<HisKylLine> list, List<String> xAxis){
        List chartSeries = new ArrayList();
        Map lineSeries = new HashMap();
        //String data[] = new String[xAxis.size()];
        //没有数据补0
        logger.info("DataAnalyseUtil  根据x轴坐标创建一个大小相同的数组,初始化全部为0");
        long data[] = new long[xAxis.size()];
        String lineName = "";
        //遍历这个list 根据名字来组装数据
        for(HisKylLine kylLine:list){
            if(lineName.equals("")){
                lineName = kylLine.getLineName();
            }
            if(!kylLine.getLineName().isEmpty() && !lineName.equals(kylLine.getLineName())){
                lineSeries.put("lineName",lineName);
                lineSeries.put("data",data);
                lineSeries.put("timeDate", kylLine.getTimeDate());
                chartSeries.add(lineSeries);
                lineName = kylLine.getLineName();
                //data = new String[xAxis.size()];
                //没有数据补0
                data = new long[xAxis.size()];
                lineSeries = new HashMap();
            }
            if(kylLine.getStartTime() != null){
                String hclTime = sdfHour.format(kylLine.getStartTime());
                for(int i=0;i<xAxis.size();i++){
                    if(xAxis.get(i).equals(hclTime)){
                        //data[i] = String.valueOf(iGeneticBean.getHcl());
                        //没有数据补0
                        data[i] = Math.toIntExact(kylLine.getKyl());
                        break;
                    }
                }
            }
        }
        lineSeries.put("lineName",lineName);
        lineSeries.put("data",data);
        chartSeries.add(lineSeries);
        return chartSeries;
    }

}
