/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wzq on 2017/6/1.
 * 实时数据 - 车站5分钟分票种进出站量
 */
public class RealJczTicketStation implements Serializable{
    private final static long serialVersionUID = 1l;

    private String timeDate;//日期
    private String lineId;//线路编号
    private String lineName;//线路名称
    private String stationId;//车站编号
    private String stationName;//车站名称
    private Date startTime;//起始时刻
    private Date endTime;//终止时刻
    private String ticketType;//票种编码
    private Integer jzl;//进站量
    private Integer czl;//出站量
    private Integer jzlSum;//累计进站量
    private Integer czlSum;//累计出站量
    private Date updateTime;//更新时间
    private String remark;//备注

    private float ticketRate;
    private String ticketTypeName;//
    
    private String timeGrade;
}
