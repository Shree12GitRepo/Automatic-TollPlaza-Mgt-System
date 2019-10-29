package com.USA.RTO.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.USA.RTO.CompositePK.Regstrtn_NumbCmpstPK;
import com.USA.RTO.CustomGenerator.RegistrationNumberGenerator;

@Entity
@Table(name = "RegistrationNumber")
@IdClass(Regstrtn_NumbCmpstPK.class)
public class RegistrationNumberEntity {	
	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RegNum_ID_Seq")
	@SequenceGenerator(sequenceName = "reg_num_ID", name = "RegNum_ID_Seq", allocationSize = 1)
	private Integer reg_Num_Id;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "regstrtnSeq")
	@GenericGenerator(name = "regstrtnSeq", strategy = "com.USA.RTO.CustomGenerator.RegistrationNumberGenerator", parameters = {
			@Parameter(name = RegistrationNumberGenerator.INCREMENT_PARAM, value = "1"),
			@Parameter(name = RegistrationNumberGenerator.VALUE_PREFIX_PARAMETER, value = "B_"),
			@Parameter(name = RegistrationNumberGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String regstrtn_No;
	@Column(name = "owner_Name", length = 30)
	private String owner_name;
	@Column(name = "Owner_SSN_No", length = 10)
	private Integer owner_SSN_NO;
	@Column(name = "OWNER_VEICHLE_TYPE", length = 8)
	private String owner_Veichle_Type;
	@Column(name = "owner_Numberplate", length = 10)
	private String owner_Numberplate;

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

	public String getOwner_Numberplate() {
		return owner_Numberplate;
	}

	public void setOwner_Numberplate(String owner_Numberplate) {
		this.owner_Numberplate = owner_Numberplate;
	}

	public Integer getReg_Num_Id() {
		return reg_Num_Id;
	}

	public void setReg_Num_Id(Integer reg_Num_Id) {
		this.reg_Num_Id = reg_Num_Id;
	}

}
