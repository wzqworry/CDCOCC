package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/8/30.
 *  综合监控对应实体 (对应 视图V_HISALARM)
 */
public class AlmAlarms implements Serializable {
    private final static long serialVersionUID = 1l;
    /*FD_NODENAME, FD_TAGNAME, FD_ALARMTYPE, FD_STATUS, FD_OCCURTIME*/
    /*fdNodeName,fdTagName,fdAlarmType,fdStatus,fdOcurTime*/
    private String fdNodeName;//线路编号
    private String fdTagName;//报警点名称
    private int fdAlarmType;//报警类型	　
    private String fdOcurTime;//报警产生时间
    private String fdStatus;//报警状态	confirmed and recovered（已确认已恢复）
    private String fdTagDesp;//报警点描述	TFDS主机TFDS-1通道3状态
    private String fdEgu;//报警描述	火警；故障等
    private String fdClassName;//报警类名称	　
    private String fdCategory;//fd_category
    private String fdSubSystem;//报警子系统	AFC；PSD；FAS;PSCADA等
    private int fdPriority;//报警级别	最高报警级别为1
    private String fdConfirmTime;//人工确认时间	2015-10-17 01:52:49.958
    private String fdRecoverTime;//报警恢复时间	2015-10-17 01:52:49.958
    private String fdConfirmPersion;//确认人员	lisi
    private String fdCurvalue;//当前值	1
    private String fdPrevalue;//之前值	0
    private int fdAlarmid;//报警id	1001
    private String fdFirstAlarmArea;//fd_firstalarmarea
    private String fdSecondAlarmArea;//fd_firstalarmarea
    private String fdThirdAlarmArea;//fd_firstalarmarea
    private String fdFourthAlarmArea;//fd_firstalarmarea
    private String fdFifthAlarmArea;//fd_firstalarmarea
    private String fdSixthAlarmArea;//fd_firstalarmarea


    public String getFdNodeName() {
        return fdNodeName;
    }

    public void setFdNodeName(String fdNodeName) {
        this.fdNodeName = fdNodeName;
    }

    public String getFdTagName() {
        return fdTagName;
    }

    public void setFdTagName(String fdTagName) {
        this.fdTagName = fdTagName;
    }

    public int getFdAlarmType() {
        return fdAlarmType;
    }

    public void setFdAlarmType(int fdAlarmType) {
        this.fdAlarmType = fdAlarmType;
    }

    public String getFdOcurTime() {
        return fdOcurTime;
    }

    public void setFdOcurTime(String fdOcurTime) {
        this.fdOcurTime = fdOcurTime;
    }

    public String getFdStatus() {
        return fdStatus;
    }

    public void setFdStatus(String fdStatus) {
        this.fdStatus = fdStatus;
    }

    public String getFdTagDesp() {
        return fdTagDesp;
    }

    public void setFdTagDesp(String fdTagDesp) {
        this.fdTagDesp = fdTagDesp;
    }

    public String getFdEgu() {
        return fdEgu;
    }

    public void setFdEgu(String fdEgu) {
        this.fdEgu = fdEgu;
    }

    public String getFdClassName() {
        return fdClassName;
    }

    public void setFdClassName(String fdClassName) {
        this.fdClassName = fdClassName;
    }

    public String getFdCategory() {
        return fdCategory;
    }

    public void setFdCategory(String fdCategory) {
        this.fdCategory = fdCategory;
    }

    public String getFdSubSystem() {
        return fdSubSystem;
    }

    public void setFdSubSystem(String fdSubSystem) {
        this.fdSubSystem = fdSubSystem;
    }

    public int getFdPriority() {
        return fdPriority;
    }

    public void setFdPriority(int fdPriority) {
        this.fdPriority = fdPriority;
    }

    public String getFdConfirmTime() {
        return fdConfirmTime;
    }

    public void setFdConfirmTime(String fdConfirmTime) {
        this.fdConfirmTime = fdConfirmTime;
    }

    public String getFdRecoverTime() {
        return fdRecoverTime;
    }

    public void setFdRecoverTime(String fdRecoverTime) {
        this.fdRecoverTime = fdRecoverTime;
    }

    public String getFdConfirmPersion() {
        return fdConfirmPersion;
    }

    public void setFdConfirmPersion(String fdConfirmPersion) {
        this.fdConfirmPersion = fdConfirmPersion;
    }

    public String getFdCurvalue() {
        return fdCurvalue;
    }

    public void setFdCurvalue(String fdCurvalue) {
        this.fdCurvalue = fdCurvalue;
    }

    public String getFdPrevalue() {
        return fdPrevalue;
    }

    public void setFdPrevalue(String fdPrevalue) {
        this.fdPrevalue = fdPrevalue;
    }

    public int getFdAlarmid() {
        return fdAlarmid;
    }

    public void setFdAlarmid(int fdAlarmid) {
        this.fdAlarmid = fdAlarmid;
    }

    public String getFdFirstAlarmArea() {
        return fdFirstAlarmArea;
    }

    public void setFdFirstAlarmArea(String fdFirstAlarmArea) {
        this.fdFirstAlarmArea = fdFirstAlarmArea;
    }

    public String getFdSecondAlarmArea() {
        return fdSecondAlarmArea;
    }

    public void setFdSecondAlarmArea(String fdSecondAlarmArea) {
        this.fdSecondAlarmArea = fdSecondAlarmArea;
    }

    public String getFdThirdAlarmArea() {
        return fdThirdAlarmArea;
    }

    public void setFdThirdAlarmArea(String fdThirdAlarmArea) {
        this.fdThirdAlarmArea = fdThirdAlarmArea;
    }

    public String getFdFourthAlarmArea() {
        return fdFourthAlarmArea;
    }

    public void setFdFourthAlarmArea(String fdFourthAlarmArea) {
        this.fdFourthAlarmArea = fdFourthAlarmArea;
    }

    public String getFdFifthAlarmArea() {
        return fdFifthAlarmArea;
    }

    public void setFdFifthAlarmArea(String fdFifthAlarmArea) {
        this.fdFifthAlarmArea = fdFifthAlarmArea;
    }

    public String getFdSixthAlarmArea() {
        return fdSixthAlarmArea;
    }

    public void setFdSixthAlarmArea(String fdSixthAlarmArea) {
        this.fdSixthAlarmArea = fdSixthAlarmArea;
    }
}
