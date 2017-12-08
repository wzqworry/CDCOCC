package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wzq on 2017/7/20.
 */
public class WarningInfoList implements Serializable {
    private final static long serialVersionUID =1l;

    List<EmergencyWarningInfo> warningInfoList;

    public List<EmergencyWarningInfo> getWarningInfoList() {
        return warningInfoList;
    }

    public void setWarningInfoList(List<EmergencyWarningInfo> warningInfoList) {
        this.warningInfoList = warningInfoList;
    }
}

