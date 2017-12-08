package com.biierg.cocc.common.bean;
/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wenjuan.wang on 2017/8/23.
 * LED配置表 LED_CONFIGURATION
 */
public class LedConfiguration implements Serializable {
    private final static long serialVersionUID = 1l;
    private String mid;//记录ID
    private String name;//模式名称
    private byte[] template;//模板文件内容，BLOB类型
    
    private Integer r1_mode;//区域1显示模式
    private Integer r2_mode;//区域2显示模式
    
    private String r2_content;//区域2文字内容
    private String r2_color;//区域2字体颜色    
    private Integer r2_fontsize;//区域2字号大小
    private Integer r2_rolling;//区域2文字滚动方向
    
    private String r3_content;//区域3文字内容
    private String r3_color;//区域3字体颜色    
    private Integer r3_fontsize;//区域3字号大小
    private Integer r3_rolling;//区域3文字滚动方向
    
    private String r4_content;//区域4文字内容
    private String r4_color;//区域4字体颜色    
    private Integer r4_fontsize;//区域4字号大小
    private Integer r4_rolling;//区域4文字滚动方向
    
    private Integer is_enable;//是否启用
    private Integer is_show;//是否当前模式
    private String updater;//更新人
    private Date updateTime;//更新日期
    private String remark;
	/**
	 * @return the mid
	 */
	public String getMid() {
		return mid;
	}
	/**
	 * @param mid the mid to set
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getTemplate() {
		return template;
	}
	public void setTemplate(byte[] template) {
		this.template = template;
	}
	public Integer getR1_mode() {
		return r1_mode;
	}
	public void setR1_mode(Integer r1_mode) {
		this.r1_mode = r1_mode;
	}
	public Integer getR2_mode() {
		return r2_mode;
	}
	public void setR2_mode(Integer r2_mode) {
		this.r2_mode = r2_mode;
	}
	public String getR2_content() {
		return r2_content;
	}
	public void setR2_content(String r2_content) {
		this.r2_content = r2_content;
	}
	public String getR2_color() {
		return r2_color;
	}
	public void setR2_color(String r2_color) {
		this.r2_color = r2_color;
	}
	public Integer getR2_fontsize() {
		return r2_fontsize;
	}
	public void setR2_fontsize(Integer r2_fontsize) {
		this.r2_fontsize = r2_fontsize;
	}
	public Integer getR2_rolling() {
		return r2_rolling;
	}
	public void setR2_rolling(Integer r2_rolling) {
		this.r2_rolling = r2_rolling;
	}
	public String getR3_content() {
		return r3_content;
	}
	public void setR3_content(String r3_content) {
		this.r3_content = r3_content;
	}
	public String getR3_color() {
		return r3_color;
	}
	public void setR3_color(String r3_color) {
		this.r3_color = r3_color;
	}
	public Integer getR3_fontsize() {
		return r3_fontsize;
	}
	public void setR3_fontsize(Integer r3_fontsize) {
		this.r3_fontsize = r3_fontsize;
	}
	public Integer getR3_rolling() {
		return r3_rolling;
	}
	public void setR3_rolling(Integer r3_rolling) {
		this.r3_rolling = r3_rolling;
	}
	public String getR4_content() {
		return r4_content;
	}
	public void setR4_content(String r4_content) {
		this.r4_content = r4_content;
	}
	public String getR4_color() {
		return r4_color;
	}
	public void setR4_color(String r4_color) {
		this.r4_color = r4_color;
	}
	public Integer getR4_fontsize() {
		return r4_fontsize;
	}
	public void setR4_fontsize(Integer r4_fontsize) {
		this.r4_fontsize = r4_fontsize;
	}
	public Integer getR4_rolling() {
		return r4_rolling;
	}
	public void setR4_rolling(Integer r4_rolling) {
		this.r4_rolling = r4_rolling;
	}
	public Integer getIs_enable() {
		return is_enable;
	}
	public void setIs_enable(Integer is_enable) {
		this.is_enable = is_enable;
	}
	public Integer getIs_show() {
		return is_show;
	}
	public void setIs_show(Integer is_show) {
		this.is_show = is_show;
	}
	public String getUpdater() {
		return updater;
	}
	public void setUpdater(String updater) {
		this.updater = updater;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
    
    

}
