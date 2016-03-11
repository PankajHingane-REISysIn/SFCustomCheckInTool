package org.apache.struts.rei.checkin.model;

import java.io.Serializable;
import java.util.Date;

import com.force.service.vo.CustomVO;

public class UserVO extends CustomVO {
	private String userid;
	private String username;
	private Boolean isactive;
	private String userroleid;
	private String userrolename;
	private String email;
	private String firstName;
	private String lastName;
	private String name;
	private String defaultDivision;
	private String contactId;
	private Date LastLoginDate;
	
	public Date getLastLoginDate() {
		return LastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	public String getDefaultDivision() {
		return defaultDivision;
	}
	public void setDefaultDivision(String defaultDivision) {
		this.defaultDivision = defaultDivision;
	}
	public UserVO() {}
	public UserVO(String userid, String username, boolean isactive, String userroleid) {
		this.userid = userid;
		if (username != null) {
			this.username = username.toLowerCase();
		}
		this.isactive = isactive;
		this.userroleid = userroleid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserroleid() {
		return userroleid;
	}
	public void setUserroleid(String userroleid) {
		this.userroleid = userroleid;
	}
	public boolean equals(Object o) {
		UserVO other = (UserVO) o;
		return this.userid.equals(other.userid);
	}
	public String getUserrolename() {
		return userrolename;
	}
	public void setUserrolename(String userrolename) {
		this.userrolename = userrolename;
	}
	public String toString() {
		return userid + "," + name + "," + username + "," + isactive + "," + userroleid + ",\"" + userrolename + "\""; 
	}
	public Boolean isActive() {
		return isactive;
	}
	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
