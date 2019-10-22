package com.USA.RTO.BO;

public class VeichleRegstrtnBO {
	private String[] veichleType;
	private String[] veichleName;
	private String[] veichleModel;
	private String veichleNo;
	private String country;
	private String state;
	private String city;
	private String cityCode;
	
	public String[] getVeichleType() {
		return veichleType;
	}
	public void setVeichleType(String[] veichleType) {
		this.veichleType = veichleType;
	}
	public String[] getVeichleName() {
		return veichleName;
	}
	public void setVeichleName(String[] veichleName) {
		this.veichleName = veichleName;
	}
	public String[] getVeichleModel() {
		return veichleModel;
	}
	public void setVeichleModel(String[] veichleModel) {
		this.veichleModel = veichleModel;
	}
	public String getVeichleNo() {
		return veichleNo;
	}
	public void setVeichleNo(String veichleNo) {
		this.veichleNo = veichleNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
}
