package com.example.hibeex.entity;
// Generated 4 Jul, 2019 1:49:52 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * StockistMaster generated by hbm2java
 */
@Entity
@Table(name="stockist_master"
    ,catalog="raf"
)
public class StockistMaster  implements java.io.Serializable {


     private Integer stId;
     private Loginmaster loginmaster;
     private String stName;
     private String city;
     private String state;
     private String address;
     private String mobile;
     private String email;
     private Date createionDate;
     private String status;
     private String deleteoperation;

    public StockistMaster() {
    }

	
    public StockistMaster(Loginmaster loginmaster, String stName, String city, String state, String address, String mobile, String email, Date createionDate) {
        this.loginmaster = loginmaster;
        this.stName = stName;
        this.city = city;
        this.state = state;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.createionDate = createionDate;
    }
    public StockistMaster(Loginmaster loginmaster, String stName, String city, String state, String address, String mobile, String email, Date createionDate, String status, String deleteoperation) {
       this.loginmaster = loginmaster;
       this.stName = stName;
       this.city = city;
       this.state = state;
       this.address = address;
       this.mobile = mobile;
       this.email = email;
       this.createionDate = createionDate;
       this.status = status;
       this.deleteoperation = deleteoperation;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="st_id", unique=true, nullable=false)
    public Integer getStId() {
        return this.stId;
    }
    
    public void setStId(Integer stId) {
        this.stId = stId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loginid", nullable=false)
    public Loginmaster getLoginmaster() {
        return this.loginmaster;
    }
    
    public void setLoginmaster(Loginmaster loginmaster) {
        this.loginmaster = loginmaster;
    }

    
    @Column(name="st_name", nullable=false, length=205)
    public String getStName() {
        return this.stName;
    }
    
    public void setStName(String stName) {
        this.stName = stName;
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

    
    @Column(name="address", nullable=false, length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="mobile", nullable=false, length=45)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="createion_date", nullable=false, length=10)
    public Date getCreateionDate() {
        return this.createionDate;
    }
    
    public void setCreateionDate(Date createionDate) {
        this.createionDate = createionDate;
    }

    
    @Column(name="status", length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="deleteoperation", length=45)
    public String getDeleteoperation() {
        return this.deleteoperation;
    }
    
    public void setDeleteoperation(String deleteoperation) {
        this.deleteoperation = deleteoperation;
    }




}


