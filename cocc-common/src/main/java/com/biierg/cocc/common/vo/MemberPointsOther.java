package com.biierg.cocc.common.vo;

import java.io.Serializable;

public class MemberPointsOther implements Serializable  {
	
	  private final static long serialVersionUID = 1L;
	  private int gainPoints;//用户已获取的积分数
	  private int usePoints;//用户已使用的积分数
	  
		public int getGainPoints() {
			return gainPoints;
		}
		public void setGainPoints(int gainPoints) {
			this.gainPoints = gainPoints;
		}
		public int getUsePoints() {
			return usePoints;
		}
		public void setUsePoints(int usePoints) {
			this.usePoints = usePoints;
		}
	  
	  
}
