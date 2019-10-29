package com.USA.RTO.Entity;




import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
@Entity
@Table(name="vchl_ownr_dtls")
public class VeichleOwnerRegstrtnEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "vchl_ownrSeq")
	@SequenceGenerator(sequenceName = "ownr_seq",allocationSize = 1,name = "vchl_ownrSeq")
	private int vchl_ownrID;
	
	@Column(name = "OWNR_FNAME", length = 10)
	private String owner_Fname;
	@Column(name = "OWNR_LNAME", length = 8)
	private String owner_Lname;
	@Column(name = "OWNR_MAIL", length = 30)
	private String owner_email;
	@Column(name = "OWNR_MOB", length = 10)
	private Long owner_Mob;
	@Column(name = "OWNR_DOB")
	@Temporal(TemporalType.DATE)
	private Date owner_DOB;
	@Column(name = "OWNR_GENDER",length = 6)
	private String owner_Gender;
	@CreationTimestamp
	@Column(name = "OWNR_CREATE_DATE", nullable = false)
	private LocalDateTime ownr_create_Date;
	
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
	public int getVchl_ownrID() {
		return vchl_ownrID;
	}
	public void setVchl_ownrID(int vchl_ownrID) {
		this.vchl_ownrID = vchl_ownrID;
	}
	public LocalDateTime getOwnr_create_Date() {
		return ownr_create_Date;
	}
	public void setOwnr_create_Date(LocalDateTime ownr_create_Date) {
		this.ownr_create_Date = ownr_create_Date;
	}
	
	
}
