/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import com.biierg.cocc.common.bean.WechatApiResponse;
import com.biierg.cocc.common.bean.WeiboApiResponse;
import com.biierg.cocc.common.json.JacksonHelper;
import com.biierg.cocc.common.util.StringUtil;
import org.apache.http.HttpException;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class HttpProtocolHandler {

    private static String DEFAULT_CHARSET = "UTF-8";

    private static HttpProtocolHandler httpProtocolHandler = new HttpProtocolHandler();

    private Logger logger = LoggerFactory.getLogger(HttpProtocolHandler.class);
    private JacksonHelper jackson = JacksonHelper.newInstance();

    /**
     * 工厂方法
     *
     * @return
     */
    public static HttpProtocolHandler getInstance() {
        return httpProtocolHandler;
    }

    /**
     * 私有的构造方法
     */
    private HttpProtocolHandler() {
    }

    /**
     * TODO 执行Http请求( 微信 )
     *
     * @param request         请求数据
     * @param strParaFileName 文件类型的参数名
     * @param strFilePath     文件路径
     * @return
     * @throws HttpException , IOException
     */
    public WechatApiResponse execute(HttpRequest request, String strParaFileName, String strFilePath)
            throws HttpException, IOException {
        CloseableHttpClient httpclient = createHttpClient();

        String charset = request.getCharset();
        charset = charset == null ? DEFAULT_CHARSET : charset;

        logger.info(request.getUrl());

        HttpRequestBase httpMethod = null;

        // get模式且不带上传文件
        if (request.getMethod().equals(HttpRequest.METHOD_GET)) {
            httpMethod = new HttpGet(request.getUrl());
        }

        // post模式且不带上传文件
        else if (StringUtil.isNull(strParaFileName) && StringUtil.isNull(strFilePath)) {
            httpMethod = new HttpPost(request.getUrl());

            ((HttpPost) httpMethod).addHeader("Content-Type", "text/xml; charset=utf-8");

            StringEntity entity = new StringEntity(
                    jackson.toJson(request.getComplexParameters()), charset);

            ((HttpPost) httpMethod).setEntity(entity);
        }

        // post模式且带上传文件
        else {
            httpMethod = new HttpPost(request.getUrl());

            MultipartEntityBuilder multiPartBuilder = MultipartEntityBuilder.create();
            multiPartBuilder.addBinaryBody(strParaFileName, new File(strFilePath));

            Map<String, Object> params = request.getComplexParameters();
            if (params != null) {
                Set<String> keyset = params.keySet();

                for (String key : keyset) {

                    if (params.containsKey(key) && params.get(key) != null) {
                        multiPartBuilder.addTextBody(key, params.get(key).toString());
                    }
                }
            }

            ((HttpPost) httpMethod).setEntity(multiPartBuilder.build());
        }

        try {

            return new WechatApiResponse(httpclient.execute(httpMethod));

        } catch (Throwable e) {
            logger.error(e.getMessage(), e);
        } finally {

            if (httpMethod != null) {
                httpMethod.releaseConnection();
            }

            if (httpclient != null) {
                httpclient.close();
            }
        }

        return null;
    }

    /**
     * TODO 执行Http请求(微博)
     *
     * @param request         请求数据
     * @param strParaFileName 文件类型的参数名
     * @param strFilePath     文件路径
     * @return
     * @throws HttpException , IOException
     */
    public WeiboApiResponse executeWeibo(HttpRequest request, String strParaFileName, String strFilePath)
            throws HttpException, IOException {
        CloseableHttpClient httpclient = createHttpClient();

        String charset = request.getCharset();
        charset = charset == null ? DEFAULT_CHARSET : charset;

        logger.info(request.getUrl());

        HttpRequestBase httpMethod = null;

        // get模式且不带上传文件
        if (request.getMethod().equals(HttpRequest.METHOD_GET)) {
            httpMethod = new HttpGet(request.getUrl());
        }

        // post模式且不带上传文件
        else if (StringUtil.isNull(strParaFileName) && StringUtil.isNull(strFilePath)) {
            httpMethod = new HttpPost(request.getUrl());

            ((HttpPost) httpMethod).addHeader("Content-Type", "text/xml; charset=utf-8");

            StringEntity entity = new StringEntity(
                    jackson.toJson(request.getComplexParameters()), charset);

            ((HttpPost) httpMethod).setEntity(entity);
        }

        // post模式且带上传文件
        else {
            httpMethod = new HttpPost(request.getUrl());

            MultipartEntityBuilder multiPartBuilder = MultipartEntityBuilder.create();
            multiPartBuilder.addBinaryBody(strParaFileName, new File(strFilePath));

            Map<String, Object> params = request.getComplexParameters();
            if (params != null) {
                Set<String> keyset = params.keySet();

                for (String key : keyset) {

                    if (params.containsKey(key) && params.get(key) != null) {
                        multiPartBuilder.addTextBody(key, params.get(key).toString());
                    }
                }
            }

            ((HttpPost) httpMethod).setEntity(multiPartBuilder.build());
        }

        try {

            return new WeiboApiResponse(httpclient.execute(httpMethod));

        } catch (Throwable e) {
            logger.error(e.getMessage(), e);
        } finally {

            if (httpMethod != null) {
                httpMethod.releaseConnection();
            }

            if (httpclient != null) {
                httpclient.close();
            }
        }

        return null;
    }

    private CloseableHttpClient createHttpClient() {

        HttpClientBuilder clientBuilder = HttpClientBuilder.create();
        clientBuilder.setUserAgent("GridOnline_Net/1.0");
        return clientBuilder.build();
    }

    /**
     * 将NameValuePairs数组转变为字符串
     *
     * @param nameValues
     * @return
     */
    protected String toString(NameValuePair[] nameValues) {
        if (nameValues == null || nameValues.length == 0) {
            return "null";
        }

        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < nameValues.length; i++) {
            NameValuePair nameValue = nameValues[i];

            if (i == 0) {
                buffer.append(nameValue.getName() + "=" + nameValue.getValue());
            } else {
                buffer.append("&" + nameValue.getName() + "=" + nameValue.getValue());
            }
        }

        return buffer.toString();
    }
}

