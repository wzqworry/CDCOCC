/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 预案处置措施
 * 
 * @author lei
 */
public class PlanStep implements Serializable,Cloneable {
	private static final long serialVersionUID = 1L;

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

	// 如果当前是阶段，fatherParse就为空 ，应该有childList 如果是要点 childList为空 fatherParse 为父阶段
    private IgrpItem func1Item;
    private GenPost genPost;
	private PlanStep fatherParse;
	private List<PlanStep> childList;

    @Override
    public Object clone() {
        PlanStep planStep = null;
        try{
            planStep = (PlanStep)super.clone();
        }catch(CloneNotSupportedException e) {
        }
        return planStep;
    }

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

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public IgrpItem getFunc1Item() {
        return func1Item;
    }

    public void setFunc1Item(IgrpItem func1Item) {
        this.func1Item = func1Item;
    }

    public PlanStep getFatherParse() {
        return fatherParse;
    }

    public void setFatherParse(PlanStep fatherParse) {
        this.fatherParse = fatherParse;
    }

    public List<PlanStep> getChildList() {
        return childList;
    }

    public void setChildList(List<PlanStep> childList) {
        this.childList = childList;
    }

    public GenPost getGenPost() {
        return genPost;
    }

    public void setGenPost(GenPost genPost) {
        this.genPost = genPost;
    }
}
