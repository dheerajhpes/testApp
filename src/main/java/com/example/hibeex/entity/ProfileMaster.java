package com.example.hibeex.entity;
// Generated 4 Jul, 2019 1:49:52 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProfileMaster generated by hbm2java
 */
@Entity
@Table(name="profile_master"
    ,catalog="raf"
)
public class ProfileMaster  implements java.io.Serializable {


     private Integer profileId;
     private String fullName;
     private String email;
     private String mobile;
     private String secondaryMobile;
     private String city;
     private String state;
     private String pin;
     private String permanentAddress;
     private String type;
     private int createdBy;
     private Date creationDate;
     private Date dob;
     private String headQ;
     private String exst;

    public ProfileMaster() {
    }

	
    public ProfileMaster(String fullName, String email, String mobile, String city, String state, String permanentAddress, String type, int createdBy, Date creationDate, Date dob, String headQ) {
        this.fullName = fullName;
        this.email = email;
        this.mobile = mobile;
        this.city = city;
        this.state = state;
        this.permanentAddress = permanentAddress;
        this.type = type;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.dob = dob;
        this.headQ = headQ;
    }
    public ProfileMaster(String fullName, String email, String mobile, String secondaryMobile, String city, String state, String pin, String permanentAddress, String type, int createdBy, Date creationDate, Date dob, String headQ, String exst) {
       this.fullName = fullName;
       this.email = email;
       this.mobile = mobile;
       this.secondaryMobile = secondaryMobile;
       this.city = city;
       this.state = state;
       this.pin = pin;
       this.permanentAddress = permanentAddress;
       this.type = type;
       this.createdBy = createdBy;
       this.creationDate = creationDate;
       this.dob = dob;
       this.headQ = headQ;
       this.exst = exst;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="profile_id", unique=true, nullable=false)
    public Integer getProfileId() {
        return this.profileId;
    }
    
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    
    @Column(name="full_name", nullable=false, length=45)
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="mobile", nullable=false, length=45)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    @Column(name="secondary_mobile", length=45)
    public String getSecondaryMobile() {
        return this.secondaryMobile;
    }
    
    public void setSecondaryMobile(String secondaryMobile) {
        this.secondaryMobile = secondaryMobile;
    }

    
    @Column(name="city", nullable=false, length=45)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="state", nullable=false, length=45)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="pin", length=45)
    public String getPin() {
        return this.pin;
    }
    
    public void setPin(String pin) {
        this.pin = pin;
    }

    
    @Column(name="permanent_address", nullable=false, length=45)
    public String getPermanentAddress() {
        return this.permanentAddress;
    }
    
    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    
    @Column(name="type", nullable=false, length=45)
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    
    @Column(name="created_by", nullable=false)
    public int getCreatedBy() {
        return this.createdBy;
    }
    
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="creation_date", nullable=false, length=10)
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DOB", nullable=false, length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    @Column(name="head_q", nullable=false, length=450)
    public String getHeadQ() {
        return this.headQ;
    }
    
    public void setHeadQ(String headQ) {
        this.headQ = headQ;
    }

    
    @Column(name="exst", length=450)
    public String getExst() {
        return this.exst;
    }
    
    public void setExst(String exst) {
        this.exst = exst;
    }




}


