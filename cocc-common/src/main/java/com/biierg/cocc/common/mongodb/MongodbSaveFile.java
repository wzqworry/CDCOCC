package com.biierg.cocc.common.mongodb;

import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;


/**
 * Created by oyqh on 2015/11/12 0012.
 * 使用方式
 *  mongodbSaveFile.saveFile("photo",file);
 *
 * 	<bean id="mongodbSaveFile" class="com.cocc.common.mongodb.MongodbSaveFile" init-method="init">
 * 	 <property name="host" value="${mongodb.host}"/>
 * 	 <property name="port" value="${mongodb.port}"/>
 * 	 <property name="dbName" value="${mongodb.dbname}"/>
 * 	</bean>
 *
 */
public class MongodbSaveFile {

    private static Logger logger = LoggerFactory.getLogger(MongodbSaveFile.class);
    //ip
    private String host;
    //port
    private Integer port;
    private String dbName;

    private DB db;

    public void init() {
        // 连接服务器
        MongoClient mongoClient = new MongoClient(host, port);
        // 连接数据库
        db = mongoClient.getDB(dbName);
    }


    /**
     * 保存文件到mongodb中
     *
     * @param saveType 保持的类型
     * @param file     类型
     */
    public String saveFile(String saveType, File file) {
        logger.info("save file type :{}", saveType);
        String fileNames = null;

        try {   // 文件操作是在DB的基础上实现的，与表和文档没有关系
            GridFS gridFS = new GridFS(db, saveType);

            String fileName = file.getName();
            if (StringUtils.isNotEmpty(fileName)) {
                GridFSInputFile mongofile = gridFS.createFile(file);
                String simpleName = UUID.randomUUID().toString().replace("-", "");
                fileNames = simpleName + "." + fileName.split("\\.")[1];
                mongofile.setFilename(fileNames);
                mongofile.put("simpleName", simpleName);
                // 保存
                mongofile.save();
            }
        } catch (IOException e) {
            logger.error("保存文件到mongodb中异常", e.getMessage(), e);
        }
        return fileNames;

    }

    /**
     * 从mongodb中获取需要的文件
     *
     * @param saveType
     * @param fileName
     * @return
     */
    public InputStream queryFile(String saveType, String fileName) {
        logger.info("save file type :{}", saveType);
        GridFS gridFS = new GridFS(db, saveType);
        DBObject query = new BasicDBObject();
        query.put("simpleName", fileName);
        // 查询的结果：
        GridFSDBFile gridDBFile = gridFS.findOne(query);
        return gridDBFile.getInputStream();
    }


    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
