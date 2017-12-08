/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.model.path;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wzq on 2016/11/8.
 */
public class Lines implements Serializable{
    private static final long serialVersionUID = 1L;
    private String lcode ="";//线路编码
    private String lname = "";//线路名称
    private String dir = "";//上下行
    private String flag = "0";
    private String tripNo = "";//车号
    private String tableNo = "";
    private int isCircle;//是否环线
    private int stations;//经过多少站
    private double loadCoef=0;
    private double length;//路程
    private int etype=0;
    private String edesc;

    private List<Stations> sdata = new ArrayList<Stations>();

    public String getLcode() {
        return lcode;
    }

    public void setLcode(String lcode) {
        this.lcode = lcode;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTripNo() {
        return tripNo;
    }

    public void setTripNo(String tripNo) {
        this.tripNo = tripNo;
    }

    public String getTableNo() {
        return tableNo;
    }

    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }

    public int getIsCircle() {
        return isCircle;
    }

    public void setIsCircle(int isCircle) {
        this.isCircle = isCircle;
    }

    public int getStations() {
        return stations;
    }

    public void setStations(int stations) {
        this.stations = stations;
    }

    public double getLoadCoef() {
        return loadCoef;
    }

    public void setLoadCoef(double loadCoef) {
        this.loadCoef = loadCoef;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getEtype() {
        return etype;
    }

    public void setEtype(int etype) {
        this.etype = etype;
    }

    public String getEdesc() {
        return edesc;
    }

    public void setEdesc(String edesc) {
        this.edesc = edesc;
    }

    public List<Stations> getSdata() {
        return sdata;
    }

    public void setSdata(List<Stations> sdata) {
        this.sdata = sdata;
    }
}
