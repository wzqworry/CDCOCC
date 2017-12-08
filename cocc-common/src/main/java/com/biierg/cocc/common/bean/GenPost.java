/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;

/**
 * @author wwj
 * 人员岗位表
 */

public class GenPost implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String postID;//岗位ID
    private String postName;//岗位名字
    private int srcFlag; // 信息来源 0:自己创建  1:权限系统同步 2:文件导入

    public int getSrcFlag() {
        return srcFlag;
    }

    public void setSrcFlag(int srcFlag) {
        this.srcFlag = srcFlag;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

}
