package com.biierg.cocc.common.bean;

import java.io.Serializable;

/*
 * Created by wxs on 2017/07/24.
 * 车站设备类型信息==》实体类
*/

public class BaseStationEquipmentsType  implements Serializable{
	private final static long serialVersionUID = 1l;
	private  String equipment_type_id;//设备类型ID
	private  String equipment_type_name;//设备类型名称
	public String getEquipment_type_id() {
		return equipment_type_id;
	}
	public void setEquipment_type_id(String equipment_type_id) {
		this.equipment_type_id = equipment_type_id;
	}
	public String getEquipment_type_name() {
		return equipment_type_name;
	}
	public void setEquipment_type_name(String equipment_type_name) {
		this.equipment_type_name = equipment_type_name;
	}
	
}
