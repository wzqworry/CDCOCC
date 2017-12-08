/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import com.biierg.cocc.common.json.JacksonHelper;
import com.biierg.cocc.common.util.StringUtil;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;

/**
 * 处理微信平台消息响应
 * 
 * @author lei
 */
public class WeiboApiResponse implements Serializable {
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(WeiboApiResponse.class);

	private static final JacksonHelper jackson = JacksonHelper.newInstance();

	private CloseableHttpResponse response;
	private StatusLine statusLine;

	private String responseText;

	public WeiboApiResponse(CloseableHttpResponse response) {
		this.response = response;

		this.statusLine = response.getStatusLine();

		// 获取响应内容
		ByteArrayOutputStream buffer = null;
		try {
			buffer = new ByteArrayOutputStream();

			response.getEntity().writeTo(buffer);

			String encoding = "UTF-8";
			if (response != null && response.getEntity() != null
					&& response.getEntity().getContentEncoding() != null) {
				encoding = response.getEntity().getContentEncoding().getValue();
			}

			responseText = buffer.toString(StringUtil.isNull(encoding) ? "UTF-8" : encoding);
		} catch (IOException ioex) {
			logger.warn(ioex.getMessage(), ioex);
			
			responseText = null;
		} finally {

			try {
				if (buffer != null) {
					buffer.close();
				}
			} catch (IOException ioex) {
			}
		}
	}

	/**
	 * 测试返回状态是否OK
	 * 
	 * @return
	 */
	public boolean isOk() {

		if (statusLine != null) {
			return 200 == statusLine.getStatusCode();
		}

		return false;
	}

	public String getResponseText() {
		return responseText;
	}

	public <T> T getResponseEntity(Class<T> entityType) {

		try {
			if (!StringUtil.isNull(responseText)) {
				return jackson.getObject(responseText, entityType);
			}
		} catch (Throwable e) {
			logger.warn(e.getMessage(), e);
		}

		return null;
	}
	
	public void close() {

		try {
			response.close();
		} catch (IOException e) {
			logger.warn(e.getMessage(), e);
		}
	}
}

