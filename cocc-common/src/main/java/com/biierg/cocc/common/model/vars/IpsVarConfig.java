/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.vars;

import java.io.Serializable;

/**
 * 信息发布系统中变量配置实体
 *
 * @author wen.ding
 * @date 2017/6/29 13:21
 */
public class IpsVarConfig implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name; // 变量名
    private String remark; // 变量备注
    private String format; // 格式化输出
    private String sql; // 对应的 sql

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
}
