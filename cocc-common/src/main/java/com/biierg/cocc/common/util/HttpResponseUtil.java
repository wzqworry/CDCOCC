/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.http.HttpServletResponse;

import com.biierg.cocc.common.json.JacksonHelper;
import com.biierg.cocc.common.support.XML;

/**
 * @author Lei
 */
public class HttpResponseUtil {
	private static JacksonHelper jsonHelper = JacksonHelper.newInstance();

	/**
	 * 向Response中回写结果
	 * 
	 * @param response
	 * @param value
	 * @throws IOException
	 */
	public static void echo(HttpServletResponse response, Object value)
			throws IOException {
		
		if (value != null) {

			if (String.class.isInstance(value) || Integer.class.isInstance(value)
					|| Long.class.isInstance(value) || Float.class.isInstance(value)
					|| Double.class.isInstance(value) || BigDecimal.class.isInstance(value)) {

				echo(response, value.toString(), "text/plain; charset=UTF-8");
			}

			else if (XML.Node.class.isInstance(value)) {

				echo(response, value.toString(), "text/xml; charset=UTF-8");
			}

			else {
				echo(response, jsonHelper.toJson(value), "application/json; charset=UTF-8");
			}
		}

		echo(response, "", "text/plain; charset=UTF-8");
	}
	
	/**
	 * 向Response中回写结果
	 * 
	 * @param response
	 * @param value
	 * @throws IOException
	 */
	public static void echo(HttpServletResponse response, String value, String contentType)
			throws IOException {
		response.setContentType(contentType);

		PrintWriter writer = null;
		try {

			if (value != null) {
				
				writer = response.getWriter();
				writer.print(value);
			}
		} finally {

			if (writer != null) {
				writer.flush();
			}
		}
	}
}
