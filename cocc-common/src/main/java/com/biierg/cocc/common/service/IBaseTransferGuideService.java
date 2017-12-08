package com.biierg.cocc.common.service;

import java.util.List;

import com.biierg.cocc.common.bean.AppTransferGuide;
import com.biierg.cocc.common.support.SrvException;

/**
 * @author wxs
 * 
 */
public interface IBaseTransferGuideService {
	/**站内乘换引导查询
	 * @param line_code
	 * @param station_code
	 * @return
	 * @throws SrvException
	 */
	public List<AppTransferGuide> getInStationTransferGuide(String line_code, String station_code) throws SrvException;
}
