package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by syy on 2017/8/26.
 */
public class CmsArticle implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String columnId;// 栏目id
    private String title;// 标题
    private String subTitle;// 副标题
    private String keyword;// 关键字
    private String summary; //摘要
    private String content;// 内容
    private String frontcover_1;// 封面图片1
    private String frontcover_2;// 封面图片2
    private String attachment;// 附件
    private Date pub_date;
    private int isLocked;    // 是否锁定
    private int isTop; // 是否需要置顶（如果需要，则在到达预设的发布日期后置顶，直至取消置顶）
    private int isComment; //是否允许评论
    private int pv;// 浏览量
    private int cv; //评论数
    private int status;// 文章发布状态（0 未发布、1 已发布 、2 已删除）
    private int sortnum;
    private Date createTime;
    private String creator;
    private Date updateTime;
    private String updater;

    @Override
    public String toString() {
        return "CmsArticle{" +
                "id='" + id + '\'' +
                ", columnId='" + columnId + '\'' +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", keyword='" + keyword + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", frontcover_1='" + frontcover_1 + '\'' +
                ", frontcover_2='" + frontcover_2 + '\'' +
                ", attachment='" + attachment + '\'' +
                ", pub_date=" + pub_date +
                ", isLocked=" + isLocked +
                ", isTop=" + isTop +
                ", isComment=" + isComment +
                ", pv=" + pv +
                ", cv=" + cv +
                ", status=" + status +
                ", sortnum=" + sortnum +
                ", createTime=" + createTime +
                ", creator='" + creator + '\'' +
                ", updateTime=" + updateTime +
                ", updater='" + updater + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFrontcover_1() {
        return frontcover_1;
    }

    public void setFrontcover_1(String frontcover_1) {
        this.frontcover_1 = frontcover_1;
    }

    public String getFrontcover_2() {
        return frontcover_2;
    }

    public void setFrontcover_2(String frontcover_2) {
        this.frontcover_2 = frontcover_2;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Date getPub_date() {
        return pub_date;
    }

    public void setPub_date(Date pub_date) {
        this.pub_date = pub_date;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    public int getIsTop() {
        return isTop;
    }

    public void setIsTop(int isTop) {
        this.isTop = isTop;
    }

    public int getIsComment() {
        return isComment;
    }

    public void setIsComment(int isComment) {
        this.isComment = isComment;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSortnum() {
        return sortnum;
    }

    public void setSortnum(int sortnum) {
        this.sortnum = sortnum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }
}