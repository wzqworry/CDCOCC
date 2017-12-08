/**
 * 版权所有@2015 北京京投亿雅捷交通科技有限公司；未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.util;


import java.io.Serializable;

/**
 * 全局常量类
 *
 * @author lei
 */
public final class Constants implements Serializable {
    private static final long serialVersionUID = 1L;

    public static String ROOT_DIR;
    public static String CATALINA_HOME;
    
    //存入到cookie 的name kToken、kUserId
    public static final String kToken = "kToken";
    public static final String kUserId = "kUserId";

    // 线路状态：开通
    public static final int LineStateEnable = 1;
    // 线路状态：未开通
    public static final int LineStateDisable = 0;

    // 预案措施类别：线网级、线路级、现场
    public static final int PlanStepCocc = 0;
    public static final int PlanStepOcc = 1;
    public static final int PlanStepLocal = 2;

    //实时数据的前缀
    public static final String RealData = "RealData";

    /**
     * 布尔值 与 整数之前的对应关系
     *
     * @author lei
     */
    public static final class DATABASE {
        public static final String dbOne = "dataSourceOne";
        public static final String dbTwo = "dataSourceTwo";
    }

    /**
     * 布尔值 与 整数之前的对应关系
     *
     * @author lei
     */
    public static final class Boolean {
        public static final int True = 1;
        public static final int False = 0;
    }

    /**
     * 预警类型
     *
     * @author lei
     */
    public static final class ThresholdConfigType {

        // 车站进站量
        public static final String JzlStation = "jzl_station";

        // 车站出站量
        public static final String CzlStation = "czl_station";

        // 断面拥挤度
        public static final String YjdSection = "yjd_section";
    }

    /**
     * 预测数据类型
     *
     * @author lei
     */
    public static final class ForecastDataType {

        // 线路进站量
        public static final String JzlLine = "jzl_line";

        // 线路出站量
        public static final String CzlLine = "czl_line";

        // 线路换乘量
        public static final String HclLine = "hcl_line";

        // 站点进站量
        public static final String JzlStation = "jzl_station";

        // 站点出站量
        public static final String CzlStation = "czl_station";

        // 线路换乘量
        public static final String HclStation = "hcl_station";

        //-------------------- 实时 ---------------------------
        public static final String RealJczLine = "RealJczLine";
        public static final String RealJczStation = "RealJczStation";
        public static final String RealHclLine = "RealHclLine";
        public static final String RealHclStation = "RealHclStation";
        //-------------------- 实时 ---------------------------
    }

    /**
     * 缓存域
     *
     * @author lei
     */
    public static final class CacheScope {

        // 微信公众平台 AccessToken
        public static final String WechatAccessToken = "WechatAccessToken";

        public static final String WeiboAccessToken = "WeiboAccessToken";

        // 会话信息
        public static final String Session = "Session";
        // APP会员平台信息
        public static final String Platform = "Platform";
        
        // 短信验证码
        public static final String SmsCode = "SmsCode";

        // 站点客流量
        public static final String StationKll = "StationKll";

        // 线路出站量
        public static final String CzlLine = "CzlLine";

        // 线路出站量
        public static final String JzlLine = "JzlLine";

        // 站点出站量
        public static final String CzlStation = "CzlStation";

        // 站点进站量
        public static final String JzlStation = "JzlStation";

        // 站点换乘量
        public static final String HclStation = "HclStation";

        // 线路换乘量
        public static final String HclLine = "HclLine";

        // 站点客运量
        public static final String KylStation = "KylStation";

        // 线路客运量
        public static final String KylLine = "KylLine";

        //-------------------- 基础信息 ---------------------------
        // 断面
        public static final String BaseSections = "BaseSections";
        // 时刻表
        public static final String TrainTimetable = "TrainTimetable";
        // 线路载客量信息
        public static final String BASELINES = "BaseLines";
        // 行车数据信息
        public static final String XCSJFC = "XcSjfc";
        //-------------------- 时刻表 ---------------------------


        //-------------------- 应急 ---------------------------
        // 预案
        public static final String Plan = "Plan";
        // 预案场景
        public static final String PlanScene = "PlanScene";
        // 预案措施
        public static final String PlanStep = "PlanStep";
        //预警信息
        public static final String WarningInfo = "WarningInfo";
        //应急资源
        public static final String EmergencySupply = "EmergencySupply";
        //应急队伍
        public static final String EmergencyDutyTeam = "EmergencyDutyTeam";
        //应急值守点
        public static final String EmergencyDutyPoint = "EmergencyDutyPoint";
        //地震预警
        public static final String EarthQuakeWarning = "EarthQuakeWarning";
        //气象预警
        public static final String WeatherWarning = "WeatherWarning";
        //综合预警
        public static final String AlmAlarm = "AlmAlarm";
        //应急
        public static final String Emergency = "Emergency";
        public static final String EmergencyDrill = "EmergencyDrill";
        public static final String CustomTask = "CustomTask";
        //-------------------- 应急 ---------------------------


        //-------------------- 排班 ---------------------------
        // 班组管理
        public static final String DutyWorkGroup = "DutyWorkGroup";
        // 班次管理
        public static final String DutyTurn = "DutyTurn";
        // 排班规则管理
        public static final String DutyTurnRule = "DutyTurnRule";
        // 人员调休管理
        public static final String DutyPersonWorkOff = "DutyPersonWorkOff";
        // 交接班管理
        public static final String DutyChangeWorkDuty = "DutyChangeWorkDuty";
        // 排班计划管理
        public static final String DutyTurnPlan = "DutyTurnPlan";
        // 排班计划详情
        public static final String DutyTurnPlanDetails = "DutyTurnPlanDetails";
        // 台账管理
        public static final String DutyHandover = "DutyHandover";
        //-------------------- 排班 ---------------------------


        //-------------------- 辅助资源 ---------------------------
        // 调度文件管理
        public static final String AssistScheduleFile = "AssistScheduleFile";
        //-------------------- 辅助资源 ---------------------------


        //-------------------- 实时 ---------------------------
        public static final String RealJczLine = "RealJczLine";
        public static final String RealJczStation = "RealJczStation";
        public static final String RealHclLine = "RealHclLine";
        public static final String RealDmkll = "RealDmkll";
        public static final String RealDmyjd = "RealDmyjd";
        public static final String ThresholdConfig = "ThresholdConfig";
        public static final String AvalidThresholdConfig = "AvalidThresholdConfig";

        public static final String RouteNum = "RouteNum";
        //-------------------- 实时 ---------------------------


        //-------------------- 历史 ---------------------------
        public static final String HisDmyjd = "HisDmyjd";
        public static final String HisYjdLine = "HisYjdLine";
        public static final String HisKylLine = "HisKylLine";
        public static final String HisZzlLine = "HisZzlLine";
        public static final String HisHclLine = "HisHclLine";
        public static final String HisSelfCountStation = "HisSelfCountStation";
        public static final String HisJzlStationTop = "HisJzlStationTop";
        public static final String HisCzlStationTop = "HisCzlStationTop";
        public static final String HisHclStationTop = "HisHclStationTop";
        //-------------------- 历史 ---------------------------


        //-------------------- 信息发布 -------------------------
        public static final String MsgList4Box = "MsgList4Box"; //用于面板显示的消息
        public static final String IpsMessage = "IpsMessage"; // 消息
        public static final String IpsMessages = "IpsMessages"; // 消息集合
        public static final String EventList = "EventList"; // 用于突发事件显示的短信
        public static final String MessageList = "MessageList";//面板显示模板
        public static final String Messages = "Messages";//面板点击显示信息
        public static final String MsgTimer = "MsgTimer";//定时任务
        public static final String MsgTimerTrigger = "MsgTimerTrigger";//定时任务触发器

        public static final String GenExpert = "GenExpert";//专家通讯录
        public static final String StationEquList = "StationEquList";//车站设施
        public static final String LineMsgList = "LineMsgList";//车站设施

        public static final String MessageToSend = "MessageToSend"; // 待发送消息
        //-------------------- 信息发布 -------------------------


        //-------------------- 信息组团 -------------------------
        public static final String IgrpModel = "IgrpModel"; //组团模式
        public static final String IgrpItem = "IgrpItem"; //组团项
        public static final String DateSection = "DateSection"; //时期段
        public static final String AvalidDateSection = "AvalidDateSection"; // 有效的时期段
        public static final String TimeSection = "TimeSection"; //日期段
        public static final String ImsGroup = "ImsGroup"; //IMS编组
        //-------------------- 信息组团 ---------------------------


        // -------------------- 审核--------------------------------
        public static final String ApprovalList = "ApprovalRec";//审核列表
        //-------------------- 审核--------------------------------

        //        大屏 通讯录
        public static final String expertScreenList = "expertScreenList";

        //---------------------延误事件------------------------------
        public static final String DelayList = "DelayList";//延误列表

        //---------------------重要事件------------------------------
        public static final String NotesList = "NotesList";//重要事件列表

        //---------------------遗留故障------------------------------
        public static final String FaultList = "FaultList";//遗留故障列表

        //---------------------施工计划------------------------------
        public static final String TerminalBuildList = "TerminalBuildList";//施工计划列表
        
        
        //-------------------- ATS ---------------------------
        public static final String AtsTrainPosition = "AtsTrainPosition"; // 列车实时位置
        
      //-------------------- 配置兑换日期 ---------------------------
        public static final String ExchangeDate = "ExchangeDate"; // 列车实时位置

    }

    /**
     * 数据预测算法选项
     *
     * @author lei
     */
    public static final class ForecastOption {

        // 算术平均
        public static final int ArithmeticalAverage = 0;

        // 几何平均
        public static final int GeometricAverage = 1;

        // 算术平均(去极值)
        public static final int ArithmeticalAverageRE = 2;

        // 几何平均(去极值)
        public static final int GeometricAverageRE = 3;

        // 自定义
        public static final int Customize = 4;
    }

    /**
     * 同比日期策略
     *
     * @author lei
     */
    public static final class YoYPolicy {

        // 上周同期
        public static final int PrevWeek = 0;

        // 上月同期
        public static final int PrevMonth = 1;

        // 去年同期
        public static final int PrevYear = 2;

        // 自定义日期
        public static final int Custom = 3;
    }

    /**
     * 大屏标识
     *
     * @author lei
     */
    public static class ScrId {
        public static final String SHIJC = "SHIJC";
        public static final String CUIJD = "CUIJD";
    }

    /**
     * Integer source
     */
    /*public static class WarningSrcType {
        //内网预警
        public static final int InSource = 0;
        //外网预警
        public static final int OutSource = 1;
    }*/

    public static class WarningSource {
        // -------  内部    -----
        //供电系统
        public static final int PowerSys = 1;
        //信号系统
        public static final int SignalSys = 2;
        //火灾自动报警系统
        public static final int FireSys = 3;
        //环境与设备监控系统
        public static final int EnvironmentSys = 4;
        //屏蔽门系统
        public static final int PisSys = 5;
        //清分系统
        public static final int ClearSys = 6;
        //线网监控及应用
        public static final int LineSys = 7;
        //客流预测系统
        public static final int PassengerSys = 8;
        // -------  外部    -----

        //气象
        public static final int WeatherSys = 10;
        //地震
        public static final int EarthQuakeSys = 11;
        //公安
        //公共交通
        //上级相关
        public static final int UpSys = 14;
    }

    public static class WarningType {
        //气象
        public static final int OtherWarning = 4;
        //设备类预警
        public static final int DeviceWarning = 5;
        //指标类预警
        public static final int IndexWarning = 6;
        //灾害类预警
        public static final int DisasterWarning = 7;
    }

    public static class WarningLevel {
        //绿色
        public static final int blue = 1;
        //黄色
        public static final int yellow = 2;
        //黄色
        public static final int orange = 3;
        //红色
        public static final int Red = 4;
    }

    //0-未发布,1-发布中,2-已撤销
    public static class WarningPublish {
        //未发布
        public static final int NotApply = 0;
        //发布中
        public static final int Applying = 1;
        //已撤销
        public static final int Canceled = 2;
    }

    //0-未审批,1-审批通过,2-审批未通过
    public static class WarningApproval {
        //未审批
        public static final int NotApply = 1;
        //审批通过
        public static final int Applying = 2;
        //审批未通过
        public static final int Canceled = 3;
        //不需审批
        public static final int NoNeed = 4;
    }

    //0-接警,1-处置中,2-处置完成
    public static class EmergencyStatue {
        public static final int HANDLING = 0;
        public static final int HANDOVER = 1;
        public static final int DONE = 2;
    }

    //1-1级,2-2级,3-3级,4-四级
    public static class EmergencyLevel {
        public static final int LEVEL1 = 1;
        public static final int LEVEL2 = 2;
        public static final int LEVEL3 = 3;
        public static final int LEVEL4 = 4;
    }

    //0-车站,1-中心,2-场段,3-区间
    public static class EmergencyPlaceType {
        public static final int PLACETYPE0 = 0;
        public static final int PLACETYPE1 = 1;
        public static final int PLACETYPE2 = 2;
        public static final int PLACETYPE3 = 3;
    }

    //0-站厅,1-站台,2-换乘通道,3-设备房,4-出入口
    public static class EmergencyAreaType {
        public static final int AREATYPE0 = 0;
        public static final int AREATYPE1 = 1;
        public static final int AREATYPE2 = 2;
        public static final int AREATYPE3 = 3;
        public static final int AREATYPE4 = 4;
    }
    //todo 预留  突发事件场段，中心的常量配置

    public static class EmergencyDutyArea {
        public static final int EAST = 1;
        public static final int WEST = 2;
        public static final int SOUTH = 3;
        public static final int NORTH = 4;
        public static final int CENTER = 5;
    }

    public static class Algorithm {
        public static final int AVERAGE = 0;// 历史同期平均值
        public static final int GEOAVERAGE = 1;// 几何平均值
        public static final int AVERAGERE = 2;// 历史同期(去极值)
        public static final int GEOAVERAGERE = 3;// 几何平均值(去极值)
        public static final int SELFDEFINED = 4;//
    }

    /**
     * 定时任务的任务组名
     *
     * @author wen.ding
     */
    public static class JobGroupName {
        public static final String GROUP_IPS = "groupIps"; // 短信、调令
        public static final String GROUP_WX = "groupWx"; // 微信
        public static final String GROUP_WB = "groupWb"; // 微博

        public static final String GROUP_EMER = "groupEmer"; // 微博
    }

    /**
     * 定时任务的状态
     *
     * @author wen.ding
     */
    public static class JobStateMessage {
        public static final String JOBS_STATE_0 = "NORMAL 任务执行正常";
        public static final String JOBS_STATE_1 = "PAUSED 任务暂停";
        public static final String JOBS_STATE_2 = "COMPLETE 任务完成";
        public static final String JOBS_STATE_3 = "ERROR 任务执行错误";
        public static final String JOBS_STATE_4 = "BLOCKED 任务阻塞";
        public static final String JOBS_STATE__1 = "NONE 任务不存在";
    }

    /**
     * 定时任务的状态
     *
     * @author wen.ding
     */
    public static class JobTriggerState {
        public static final String NONE = "Trigger已经完成，且不会在执行，或者找不到该触发器，或者Trigger已经被删除";
        public static final String NORMAL = "正常状态";
        public static final String PAUSED = "暂停状态";
        public static final String COMPLETE = "触发器完成，但是任务可能还正在执行中";
        public static final String BLOCKED = "线程阻塞状态";
        public static final String ERROR = "出现错误";
    }

    /**
     * 会员积分渠道
     * signin:签到 ;equipment_repair:设备报修;qr_ride:二维码乘车;buy_ticket:购买票卡
     * @author lei
     */
	public static class MemberPointsChannel {
		public static final String REGISTER = "register";
		public static final String RECOMMEND = "recommend";
		
		public static final String SIGNIN = "signin";
		public static final String EQUIPMENT_REPAIR = "equipment_repair";
		public static final String QR_RIDE = "qr_ride";
		public static final String BUY_TICKET = "buy_ticket";
		
		public static final String GIFT_EXCHANGE = "gift_exchange";
	}

    /**
     * app礼品兑换相关
     * 0:正常兑换 ;1:积分不足 ;2:库存不足
     * @author weibo.zheng
     */
    public static class GiftExchangeInfo{
        public static final int NOMAL = 0;
        public static final int POINTS_LACK = 1;
        public static final int RESERVE_LACK = 2;
    }

    /**
     * 推送消息类型
     *
     * @author lei
     */
    public static class PushMessageType {
        public static final String ANNOUNCEMENT = "announcement";
        public static final String LIMITING = "limiting";
    }
    
    /**
     * TCP通讯消息头
     * 
     * @author lei
     */
    public static class TcpHeader {

    	// 定时消息头
    	public static byte[] TimingMsg_Header;
    	static {
    		try {
    			TimingMsg_Header = ByteUtils.fill(new byte[10], "TimingMsg".getBytes("UTF-8"));
    		} catch (Throwable e) {
    		}
    	}
    	
    	public static byte[] Heartbeat_Header;
    	static {
    		try {
    			Heartbeat_Header = ByteUtils.fill(new byte[10], "Heartbeat".getBytes("UTF-8"));
    		} catch (Throwable e) {
    		}
    	}
    }
}
