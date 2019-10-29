package com.USA.RTO.CompositePK;

import java.io.Serializable;

public class Regstrtn_NumbCmpstPK implements Serializable {
	private Integer reg_Num_Id;
	private String regstrtn_No;
	
	

	public Integer getReg_Num_Id() {
		return reg_Num_Id;
	}

	public void setReg_Num_Id(Integer reg_Num_Id) {
		this.reg_Num_Id = reg_Num_Id;
	}

	public String getRegstrtn_No() {
		return regstrtn_No;
	}

	public void setRegstrtn_No(String regstrtn_No) {
		this.regstrtn_No = regstrtn_No;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reg_Num_Id == null) ? 0 : reg_Num_Id.hashCode());
		result = prime * result + ((regstrtn_No == null) ? 0 : regstrtn_No.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Regstrtn_NumbCmpstPK other = (Regstrtn_NumbCmpstPK) obj;
		if (reg_Num_Id == null) {
			if (other.reg_Num_Id != null)
				return false;
		} else if (!reg_Num_Id.equals(other.reg_Num_Id))
			return false;
		if (regstrtn_No == null) {
			if (other.regstrtn_No != null)
				return false;
		} else if (!regstrtn_No.equals(other.regstrtn_No))
			return false;
		return true;
	}

}
