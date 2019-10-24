package com.USA.RTO.BO;



import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class VeichleOwnerRegstrtnBO {
	private String owner_Fname;
	private String owner_Lname;
	private String owner_email;
	private Long owner_Mob;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date owner_DOB;
	private String owner_Gender;
	
	public String getOwner_Fname() {
		return owner_Fname;
	}
	public void setOwner_Fname(String owner_Fname) {
		this.owner_Fname = owner_Fname;
	}
	public String getOwner_Lname() {
		return owner_Lname;
	}
	public void setOwner_Lname(String owner_Lname) {
		this.owner_Lname = owner_Lname;
	}
	public String getOwner_email() {
		return owner_email;
	}
	public void setOwner_email(String owner_email) {
		this.owner_email = owner_email;
	}
	public Long getOwner_Mob() {
		return owner_Mob;
	}
	public void setOwner_Mob(Long owner_Mob) {
		this.owner_Mob = owner_Mob;
	}
	public Date getOwner_DOB() {
		return owner_DOB;
	}
	public void setOwner_DOB(Date owner_DOB) {
		this.owner_DOB = owner_DOB;
	}
	public String getOwner_Gender() {
		return owner_Gender;
	}
	public void setOwner_Gender(String owner_Gender) {
		this.owner_Gender = owner_Gender;
	}
}
