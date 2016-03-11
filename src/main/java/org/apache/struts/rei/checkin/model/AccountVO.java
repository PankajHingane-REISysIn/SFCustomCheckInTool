package org.apache.struts.rei.checkin.model;

import java.util.Date;

import com.force.service.vo.CustomVO;

public class AccountVO extends CustomVO {
	private java.lang.String Id;
	
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getId() {
		return Id;
	}
}
