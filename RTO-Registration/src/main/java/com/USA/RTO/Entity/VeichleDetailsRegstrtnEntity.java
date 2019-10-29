package com.USA.RTO.Entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "veichle_details")
public class VeichleDetailsRegstrtnEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vchl_dtls")
	@SequenceGenerator(sequenceName = "vchl_dtlsSEQ", name = "vchl_dtls", allocationSize = 1)
	private Integer vchl_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "VCHL_OWNRID", referencedColumnName = "vchl_ownrID",nullable=false)
	private VeichleOwnerRegstrtnEntity OwnerID;
	@Column(name = "vchl_Type", length = 10)
	private String vchl_Type;
	@Column(name = "vchl_Brand", length = 10)
	private String vchl_Brand;
	@Column(name = "vchl_Numbplate", length = 10)
	private String vchl_Numbplate;
	@Column(name = "create_date")
	private Date create_Date;

	public Integer getVchl_id() {
		return vchl_id;
	}

	public void setVchl_id(Integer vchl_id) {
		this.vchl_id = vchl_id;
	}

	public String getVchl_Type() {
		return vchl_Type;
	}

	public void setVchl_Type(String vchl_Type) {
		this.vchl_Type = vchl_Type;
	}

	public String getVchl_Brand() {
		return vchl_Brand;
	}

	public void setVchl_Brand(String vchl_Brand) {
		this.vchl_Brand = vchl_Brand;
	}

	public String getVchl_Numbplate() {
		return vchl_Numbplate;
	}

	public void setVchl_Numbplate(String vchl_Numbplate) {
		this.vchl_Numbplate = vchl_Numbplate;
	}

	public Date getCreate_Date() {
		return create_Date;
	}

	public void setCreate_Date(Date create_Date) {
		this.create_Date = create_Date;
	}

	public VeichleOwnerRegstrtnEntity getOwnerID() {
		return OwnerID;
	}

	public void setOwnerID(VeichleOwnerRegstrtnEntity ownerID) {
		OwnerID = ownerID;
	}

	

}
