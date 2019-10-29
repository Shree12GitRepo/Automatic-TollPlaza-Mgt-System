package com.USA.RTO.DTO;

public class VeichleOwnerAddressRegstrtnDTO {
	private String house_no;
	private Integer ssn_no;
	private String city;
	private Integer zip_code;
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getSsn_no() {
		return ssn_no;
	}
	public void setSsn_no(Integer ssn_no) {
		this.ssn_no = ssn_no;
	}
	public Integer getZip_code() {
		return zip_code;
	}
	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}
	
}
