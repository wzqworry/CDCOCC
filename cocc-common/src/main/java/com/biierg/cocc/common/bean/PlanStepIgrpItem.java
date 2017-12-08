/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/3/21.
 */
public class PlanStepIgrpItem  implements Serializable  {
    private final static long serialVersionUID = 1L;
    //阶段要点
    private String stepId; // 措施ID；UUID、PK
    private String planId; // 预案ID；FK
    private String parentId;// 阶段的 ID；可空
    private Integer category; // 级别；0-线网级、1-线路级、2-本地
    private Integer phaseFlag; // 阶段标记；0-措施、1-阶段
    private String content; // phaseFlag = 0时，为措施内容；phaseFlag = 1时，为阶段名称；
    private String func1; // 关联组团项1
    private String func2; // 关联组团项2
    private String func3; // 关联组团项3
    private Integer sortnum; // 排序号
    private String postId;//角色
    //组团
    private String id;//组团项ID
    private String name;//组团项名字
    private String url;//调用地址
    private String parameter;//调用参数
    private int status;//使用状态 0：正常使用 1：停用
    private String creator;//创建者
    private Date createTime;//创建时间
    private String updator;//修改者
    private Date updateTime;//修改时间
    private String description;//描述

    //角色
    private String postName;
    private int srcFlag;

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getPhaseFlag() {
        return phaseFlag;
    }

    public void setPhaseFlag(Integer phaseFlag) {
        this.phaseFlag = phaseFlag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFunc1() {
        return func1;
    }

    public void setFunc1(String func1) {
        this.func1 = func1;
    }

    public String getFunc2() {
        return func2;
    }

    public void setFunc2(String func2) {
        this.func2 = func2;
    }

    public String getFunc3() {
        return func3;
    }

    public void setFunc3(String func3) {
        this.func3 = func3;
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdator() {
        return updator;
    }

    public void setUpdator(String updator) {
        this.updator = updator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public int getSrcFlag() {
        return srcFlag;
    }

    public void setSrcFlag(int srcFlag) {
        this.srcFlag = srcFlag;
    }
}
