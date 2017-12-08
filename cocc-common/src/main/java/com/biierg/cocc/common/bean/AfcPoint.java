/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 综合监控点数据
 * 
 * @author lei
 */
public class AfcPoint implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private int count;
	private int offset;

	private String format;

	private double value;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count
	 *            the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * @param offset
	 *            the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(double value) {
		this.value = value;
	}

	public static class Bundle implements Serializable {
		private static final long serialVersionUID = 1L;

		private String name;

		private int unitCode;
		private int code;
		private int address;

		private int unit;

		private int count = 0;

		private List<AfcPoint> points = new ArrayList<>();

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the unitCode
		 */
		public int getUnitCode() {
			return unitCode;
		}

		/**
		 * @param unitCode the unitCode to set
		 */
		public void setUnitCode(int unitCode) {
			this.unitCode = unitCode;
		}

		/**
		 * @return the code
		 */
		public int getCode() {
			return code;
		}

		/**
		 * @param code
		 *            the code to set
		 */
		public void setCode(int code) {
			this.code = code;
		}

		/**
		 * @return the address
		 */
		public int getAddress() {
			return address;
		}

		/**
		 * @param address
		 *            the address to set
		 */
		public void setAddress(int address) {
			this.address = address;
		}

		/**
		 * @return the unit
		 */
		public int getUnit() {
			return unit;
		}

		/**
		 * @param unit
		 *            the unit to set
		 */
		public void setUnit(int unit) {
			this.unit = unit;
		}

		/**
		 * @return the count
		 */
		public int getCount() {
			return count;
		}

		/**
		 * @param count
		 *            the count to set
		 */
		public void setCount(int count) {
			this.count = count;
		}

		/**
		 * @return the points
		 */
		public List<AfcPoint> getPoints() {
			return points;
		}

		/**
		 * @param point
		 */
		public Bundle addPoint(AfcPoint point) {
			this.points.add(point);
			return this;
		}
	}
}
