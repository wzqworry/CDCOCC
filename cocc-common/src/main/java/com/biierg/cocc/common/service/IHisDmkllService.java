/**
 * 版权所有@2016 北京京投亿雅捷交通科技有限公司；
 * 未经许可，不得擅自复制、传播；
 */
package com.biierg.cocc.common.service;

        import com.biierg.cocc.common.bean.HisDmkll;
        import com.biierg.cocc.common.support.SrvException;
        import com.biierg.cocc.common.support.SrvResponse;

        import java.util.Date;
        import java.util.List;
        import java.util.Map;

/**
 * Created by wzq on 2017/3/28.
 */
public interface IHisDmkllService {
    /**
     * SRV11001 - 最大断面客流数据查询服务
     *
     * @param startTime   起始时间
     * @param endTime     截止时间
     * @param lineId      线路ID 为空查询全部，00是路网
     * @param direction   上下行
     * @param timeGrade   时间粒度
     * @param pageNum
     * @param pageSize
     * @return Map<String,Object> 最大断面客流明细表
     * @throws SrvException
     * his_dmkll 关联 一个断面基础表
     */
    public Map<String,Object> queryDmkllMax(String startDate, String endDate,String startTime, String endTime, String lineId, String direction,
                                            String timeGrade, Integer pageNum, Integer pageSize, String type) throws SrvException;

    /**
     * 查询详细的断面客流数据查询服务  包括上下行
     *
     ** @param startDate
     *            起始日期
     * @param endDate
     *            截止日期
     * @param startTime
     *            起始时间
     * @param endTime
     *            截止时间
     * @param lineId
     *            线路ID 为空查询全部，00是路网
     * @param direction
     *            上下行
     * @param sectionId 断面id
     * @param timeGrade
     *            时间粒度
     * @return 最大断面客流明细表
     * @throws SrvException
     * his_dmkll 关联 一个断面基础表 和 站点基础表
     */
    public Map<String,Object> getHisDmkllDetail(String startDate, String endDate,String startTime, String endTime, String lineId,String sectionId,
                                                Integer direction, String timeGrade,Integer pageNum,Integer pageSize) throws SrvException;


    /**
     * 小时最大断面客流量(线路)查询服务 (查出最大与次大)
     *
     * @param timeDate    日期
     * @param startTime   起始时间
     * @param endTime     截止时间
     * @param lineId      线路ID 为空查询全部，00是路网
     * @param direction   上下行
     * @param timeGrade   时间粒度
     * @return 小时最大断面客流量(线网票务运营日报)
     * @throws SrvException
     * his_dmkll 关联 一个断面基础表
     */
    public List<HisDmkll> queryDmkllTopTwo(String timeDate,Date startTime, Date endTime, String lineId,String direction,
                                           String timeGrade) throws SrvException;

    /**
     *   查询指定线路所有断面指定时刻的 线路拥挤度
     *   @param lineId  必填
     *   @param timeDate 必填
     *   @param timeGrade 必填 时间粒度
     *   @param specialTime 指定时刻，为空则查询最新记录
     * */
    List<HisDmkll> queryHisDmkll(String timeDate,String timeGrade, Date specialTime, String lineId) throws SrvException;
    
    /**
     * 查询断面客流量前十(线网)(线网票务运营日报)
     * @param timeDate 日期
     * @param tiemGrade 粒度
     * @return
     * @throws SrvException
     */
    List<HisDmkll> queryHisDmkllTopTen(String timeDate,String timeGrade,Integer pageNum, Integer pageSize) throws SrvException;


}
