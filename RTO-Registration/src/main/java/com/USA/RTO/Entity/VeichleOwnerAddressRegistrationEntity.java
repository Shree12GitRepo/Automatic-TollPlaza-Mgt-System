package com.USA.RTO.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Vchl_Ownr_Addrs")
public class VeichleOwnerAddressRegistrationEntity {
	@Id
	@GeneratedValue(generator = "owner_AddrsSeq",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1,name = "owner_AddrsSeq",sequenceName = "owner_AddrsSeq")
	private Integer ownrAddrsID;
	@Column(name="House_no")
	private String house_no;
	@Column(name = "SSN_NO", length = 8)
	private int ssn_no;
	@Column(name = "City", length = 18)
	private String city;
	@Column(name = "Zip_Code", length = 5)
	private int zip_code;
	@Column(name = "Create_Date")
	@CreationTimestamp
	private Date create_Date;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Vchl_Owner_ID", referencedColumnName = "vchl_ownrID")
	private VeichleOwnerRegstrtnEntity vchl_ownrID;
	public String getHouse_no() {
		return house_no;
	}
	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}
	public int getSsn_no() {
		return ssn_no;
	}
	public void setSsn_no(int ssn_no) {
		this.ssn_no = ssn_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZip_code() {
		return zip_code;
	}
	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}
	public Date getCreate_Date() {
		return create_Date;
	}
	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}
	public VeichleOwnerRegstrtnEntity getVchl_ownrID() {
		return vchl_ownrID;
	}
	public void setVchl_ownrID(VeichleOwnerRegstrtnEntity vchl_ownrID) {
		this.vchl_ownrID = vchl_ownrID;
	}
	public Integer getOwnrAddrsID() {
		return ownrAddrsID;
	}
	public void setOwnrAddrsID(Integer ownrAddrsID) {
		this.ownrAddrsID = ownrAddrsID;
	}
	
}
