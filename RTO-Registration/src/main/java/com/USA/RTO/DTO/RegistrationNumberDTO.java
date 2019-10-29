package com.USA.RTO.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class RegistrationNumberDTO {
	
	private String regstrtn_No;
	private String owner_name;
	private Integer owner_SSN_NO;
	private String owner_Veichle_Type;
	private Integer owner_Numberplate;
	public String getRegstrtn_No() {
		return regstrtn_No;
	}
	public void setRegstrtn_No(String regstrtn_No) {
		this.regstrtn_No = regstrtn_No;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public Integer getOwner_SSN_NO() {
		return owner_SSN_NO;
	}
	public void setOwner_SSN_NO(Integer owner_SSN_NO) {
		this.owner_SSN_NO = owner_SSN_NO;
	}
	public String getOwner_Veichle_Type() {
		return owner_Veichle_Type;
	}
	public void setOwner_Veichle_Type(String owner_Veichle_Type) {
		this.owner_Veichle_Type = owner_Veichle_Type;
	}
	public Integer getOwner_Numberplate() {
		return owner_Numberplate;
	}
	public void setOwner_Numberplate(Integer owner_Numberplate) {
		this.owner_Numberplate = owner_Numberplate;
	}
	

}
