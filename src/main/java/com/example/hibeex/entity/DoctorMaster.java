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
 * DoctorMaster generated by hbm2java
 */
@Entity
@Table(name="doctor_master"
    ,catalog="raf"
)
public class DoctorMaster  implements java.io.Serializable {


     private Integer doctorId;
     private Loginmaster loginmaster;
     private String fullName;
     private String degree;
     private String category;
     private Date dob;
     private Date doa;
     private String status;
     private Date createDate;
     private String address;
     private String mobile;
     private String email;
     private String city;
     private String deleteoperation;

    public DoctorMaster() {
    }

	
    public DoctorMaster(String fullName, String degree, String category, String status, Date createDate, String city) {
        this.fullName = fullName;
        this.degree = degree;
        this.category = category;
        this.status = status;
        this.createDate = createDate;
        this.city = city;
    }
    public DoctorMaster(Loginmaster loginmaster, String fullName, String degree, String category, Date dob, Date doa, String status, Date createDate, String address, String mobile, String email, String city, String deleteoperation) {
       this.loginmaster = loginmaster;
       this.fullName = fullName;
       this.degree = degree;
       this.category = category;
       this.dob = dob;
       this.doa = doa;
       this.status = status;
       this.createDate = createDate;
       this.address = address;
       this.mobile = mobile;
       this.email = email;
       this.city = city;
       this.deleteoperation = deleteoperation;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="doctor_id", unique=true, nullable=false)
    public Integer getDoctorId() {
        return this.doctorId;
    }
    
    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loginid")
    public Loginmaster getLoginmaster() {
        return this.loginmaster;
    }
    
    public void setLoginmaster(Loginmaster loginmaster) {
        this.loginmaster = loginmaster;
    }

    
    @Column(name="full_name", nullable=false, length=45)
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    
    @Column(name="degree", nullable=false, length=45)
    public String getDegree() {
        return this.degree;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }

    
    @Column(name="category", nullable=false, length=45)
    public String getCategory() {
        return this.category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dob", length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="doa", length=10)
    public Date getDoa() {
        return this.doa;
    }
    
    public void setDoa(Date doa) {
        this.doa = doa;
    }

    
    @Column(name="status", nullable=false, length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="create_date", nullable=false, length=10)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="address", length=45)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="mobile", length=45)
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="city", nullable=false, length=45)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="deleteoperation", length=45)
    public String getDeleteoperation() {
        return this.deleteoperation;
    }
    
    public void setDeleteoperation(String deleteoperation) {
        this.deleteoperation = deleteoperation;
    }




}


