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
public class Path implements Serializable{
    private static final long serialVersionUID = 1L;
    private String bname;  //开始站
    private String endname;//结束站
    private int lines;     //
    private int stations;  //站数
    private double length;//长度
    private double lengthPrice;//票价
    private int minutes;//时间
    private String pathCode;
    private double loadCoef;
    private List<Lines> ldata = new ArrayList<Lines>();

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getEndname() {
        return endname;
    }

    public void setEndname(String endname) {
        this.endname = endname;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getStations() {
        return stations;
    }

    public void setStations(int stations) {
        this.stations = stations;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLengthPrice() {
        return lengthPrice;
    }

    public void setLengthPrice(double lengthPrice) {
        this.lengthPrice = lengthPrice;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getPathCode() {
        return pathCode;
    }

    public void setPathCode(String pathCode) {
        this.pathCode = pathCode;
    }

    public double getLoadCoef() {
        return loadCoef;
    }

    public void setLoadCoef(double loadCoef) {
        this.loadCoef = loadCoef;
    }

    public List<Lines> getLdata() {
        return ldata;
    }

    public void setLdata(List<Lines> ldata) {
        this.ldata = ldata;
    }
}
