/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;

import java.io.Serializable;
import java.util.List;

/**
 * 与JsGrid配合的结果集包装类
 * 
 * @author lei
 */
public class JGridResponseWrapper<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	private PagingList<T> data;

	public JGridResponseWrapper(List<T> data) {
		this.data = new PagingList<>(data);
	}

	public JGridResponseWrapper(int pageCapacity, List<T> data) {
		this.data = new PagingList<>(pageCapacity, data);
	}
	
	public int getRowCount() {
		
		if (data != null) {
			return data.getRealSize();
		}
		
		return 0;
	}

	/**
	 * @return the pageCount
	 */
	public int getPageCount() {
		
		if (data != null) {
			return data.getPageCount();
		}
		
		return 0;
	}

	/**
	 * @return the pageNum
	 */
	public int getPageNumber() {
		
		if (data != null) {
			return data.getPageNum();
		}
		
		return 0;
	}

	/**
	 * @param pageNum
	 *            the pageNum to set
	 */
	public void setPageNumber(int pageNum) {
		this.data.setPageNum(pageNum);
	}

	/**
	 * @return the pageCapacity
	 */
	public int getPageCapacity() {
		
		if (data != null) {
			return data.getPageCapacity();
		}
		
		return 0;
	}

	/**
	 * @param pageCapacity
	 *            the pageCapacity to set
	 */
	public void setPageCapacity(int pageCapacity) {
		this.data.setPageCapacity(pageCapacity);
	}

	/**
	 * @return the data
	 */
	public PagingList<T> getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(PagingList<T> data) {
		this.data = data;
	}
}
