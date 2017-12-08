/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.path;

import java.io.Serializable;

/**
 * Created by wzq on 2016/11/8.
 */
public class Stations  implements Serializable{
    private static final long serialVersionUID = 1L;
    private String scode;  //站点编号
    private String sname;  //站名
    private String upOrder;  //第几个
    private String xfer;
    private String lpfv;    //满载率
    private String spfv;
    private String arrt;   //到达时间
    private String dept;   //出发时间
    private String intvl;  //发车间隔
    private double dis;   //长度
    private String lpfvColour; //颜色
    private int waitt;
    private int walkt;
    private int walkd;
    private int ispass;
    private String costt; //用时

    public void Clone(Stations other)
    {
        this.scode = other.scode;
        this.dis = other.dis;
        this.sname = other.sname;
        this.upOrder = other.upOrder;
        this.xfer  = other.xfer;
        this.lpfv  = other.lpfv;
        this.spfv  = other.spfv;
        this.arrt  = other.arrt;
        this.dept  = other.dept;
        this.intvl = other.intvl;
        this.waitt = other.waitt;
        this.walkt = other.walkt;
        this.walkd = other.walkd;
        this.costt = other.costt;
        this.ispass = other.ispass;
        this.lpfvColour = other.lpfvColour;
    }

    public String getScode() {
        return scode;
    }

    public String getSname() {
        return sname;
    }

    public String getUpOrder() {
        return upOrder;
    }

    public String getXfer() {
        return xfer;
    }

    public String getLpfv() {
        return lpfv;
    }

    public String getSpfv() {
        return spfv;
    }

    public String getArrt() {
        return arrt;
    }

    public String getDept() {
        return dept;
    }

    public String getIntvl() {
        return intvl;
    }

    public double getDis() {
        return dis;
    }

    public String getLpfvColour() {
        return lpfvColour;
    }

    public int getWaitt() {
        return waitt;
    }

    public int getWalkt() {
        return walkt;
    }

    public int getWalkd() {
        return walkd;
    }

    public int getIspass() {
        return ispass;
    }

    public String getCostt() {
        return costt;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setUpOrder(String upOrder) {
        this.upOrder = upOrder;
    }

    public void setXfer(String xfer) {
        this.xfer = xfer;
    }

    public void setLpfv(String lpfv) {
        this.lpfv = lpfv;
    }

    public void setSpfv(String spfv) {
        this.spfv = spfv;
    }

    public void setArrt(String arrt) {
        this.arrt = arrt;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setIntvl(String intvl) {
        this.intvl = intvl;
    }

    public void setDis(double dis) {
        this.dis = dis;
    }

    public void setLpfvColour(String lpfvColour) {
        this.lpfvColour = lpfvColour;
    }

    public void setWaitt(int waitt) {
        this.waitt = waitt;
    }

    public void setWalkt(int walkt) {
        this.walkt = walkt;
    }

    public void setWalkd(int walkd) {
        this.walkd = walkd;
    }

    public void setIspass(int ispass) {
        this.ispass = ispass;
    }

    public void setCostt(String costt) {
        this.costt = costt;
    }
}
