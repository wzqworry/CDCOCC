package com.biierg.cocc.common.mvc;

import java.beans.PropertyEditorSupport;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.biierg.cocc.common.util.StringUtil;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

public class SMVCWebBindingInitializer implements WebBindingInitializer {

	private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static SimpleDateFormat dateTimeFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

	static {
		dateTimeFormat.setLenient(false);
		dateTimeFormat2.setLenient(false);
		dateFormat.setLenient(false);
		timeFormat.setLenient(false);
	}

	public void initBinder(WebDataBinder binder, WebRequest request) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(true));
		binder.registerCustomEditor(Timestamp.class, new CustomTimestampEditor(true));
	}
	
	/**
	 * 日期类型转换器
	 * 
	 * @author lei
	 */
	public class CustomDateEditor extends PropertyEditorSupport {
		private final boolean allowEmpty;

		public CustomDateEditor(boolean allowEmpty) {
			this.allowEmpty = allowEmpty;
		}

		public void setAsText(String text) throws IllegalArgumentException {

			if ((this.allowEmpty) && (StringUtil.isEmpty(text))) {
				setValue(null);
			} else if (StringUtil.isNumber(text)) {
				try {
					setValue(new Timestamp(Long.parseLong(text)));
				} catch (Throwable ex) {
					throw new IllegalArgumentException("Could not parse date: " + text, ex);
				}
			} else {

				switch (StringUtil.isDateTime(text)) {

				case 0:

					try {
						setValue(dateTimeFormat.parse(text));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse date: " + text, ex);
					}

					break;
				case 1:

					try {
						setValue(dateFormat.parse(text));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse date: " + text, ex);
					}

					break;
				case 2:

					try {
						setValue(timeFormat.parse(text));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse date: " + text, ex);
					}

					break;
				case 3:

					try {
						setValue(dateTimeFormat2.parse(text));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse date: " + text, ex);
					}

					break;

				default:
					setValue(null);
				}
			}
		}

		public String getAsText() {
			Timestamp value = (Timestamp) getValue();
			return value != null ? String.valueOf(value.getTime()) : "";
		}
	}

	/**
	 * 时间戳类型参数转换器
	 * 
	 * @author lei
	 */
	public class CustomTimestampEditor extends PropertyEditorSupport {
		private final boolean allowEmpty;

		public CustomTimestampEditor(boolean allowEmpty) {
			this.allowEmpty = allowEmpty;
		}

		public void setAsText(String text) throws IllegalArgumentException {

			if ((this.allowEmpty) && (StringUtil.isEmpty(text))) {
				setValue(null);
			} else if (StringUtil.isNumber(text)) {
				try {
					setValue(new Timestamp(Long.parseLong(text)));
				} catch (Throwable ex) {
					throw new IllegalArgumentException("Could not parse timestamp: " + text, ex);
				}
			} else {

				switch (StringUtil.isDateTime(text)) {

				case 0:

					try {
						setValue(new Timestamp(dateTimeFormat.parse(text).getTime()));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse timestamp: " + text, ex);
					}

					break;
				case 1:

					try {
						setValue(new Timestamp(dateFormat.parse(text).getTime()));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse timestamp: " + text, ex);
					}

					break;
				case 2:

					try {
						setValue(new Timestamp(timeFormat.parse(text).getTime()));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse timestamp: " + text, ex);
					}

					break;
				case 3:

					try {
						setValue(new Timestamp(dateTimeFormat2.parse(text).getTime()));
					} catch (Throwable ex) {
						throw new IllegalArgumentException("Could not parse timestamp: " + text, ex);
					}

					break;

				default:
					setValue(null);
				}
			}
		}

		public String getAsText() {
			Timestamp value = (Timestamp) getValue();
			return value != null ? String.valueOf(value.getTime()) : "";
		}
	}
}
