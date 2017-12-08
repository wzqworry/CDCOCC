/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.support;


import java.io.Serializable;
import java.util.List;

/**
 * 与 bootstrap table 配合的结果集包装类
 */
public class BootstrapTableResponseWrapper<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    private int total; // 结果集中数据总条数 必填
    private List<T> rows; // 数据列表 必填
    private String cacheKey; // 缓存key ，可空

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }
}
