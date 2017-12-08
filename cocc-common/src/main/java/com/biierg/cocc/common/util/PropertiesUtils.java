package com.biierg.cocc.common.util;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by wzq on 2017/1/11.
 */
public class PropertiesUtils {
    //private static Properties property;
    private static Logger logger = LoggerFactory.getLogger(PropertiesUtils.class);
    private static Map<String,String> tableNameMap = new HashMap<>();
    //加载 那些 文件的正则表达式
    /*public static void loadProperty(){
        property =  new Properties();
        InputStream is = null;
        try {
            is = PropertiesUtils.class.getClassLoader().getResourceAsStream("timeGrade.properties");
            property.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static String getName(String key){
        if(tableNameMap.size()<=0){
            loadMap();
        }
        return tableNameMap.get(key);
    }

    private static void loadMap(){
        InputStream is = PropertiesUtils.class.getClassLoader().getResourceAsStream("profile.properties");
        Properties properties = new Properties();
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (!properties.isEmpty()){
            logger.info("读取表名配置 {} 条记录", properties.size());
            for(String key : properties.stringPropertyNames()){
                String tableName = properties.getProperty(key);
                logger.info("{} = {}", key, tableName);
                tableNameMap.put(key,tableName);
            }
            logger.info("表名配置读取完毕");
        }
    }
}
