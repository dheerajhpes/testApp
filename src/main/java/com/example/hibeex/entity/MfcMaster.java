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
 * MfcMaster generated by hbm2java
 */
@Entity
@Table(name="mfc_master"
    ,catalog="raf"
)
public class MfcMaster  implements java.io.Serializable {


     private Integer mfcId;
     private String station;
     private String stType;
     private String modeOfTravel;
     private String totalDistance;
     private String ta;
     private String da;
     private Date createDate;
     private String status;
     private String deleteoperation;
     private String loginid;
     private String logintype;
     private String mfcFrom;
     private String mfcTo;
     private String workedAt;

    public MfcMaster() {
    }

	
    public MfcMaster(String station, String stType, String modeOfTravel, String totalDistance, Date createDate, String status, String deleteoperation, String loginid, String logintype, String mfcFrom, String mfcTo, String workedAt) {
        this.station = station;
        this.stType = stType;
        this.modeOfTravel = modeOfTravel;
        this.totalDistance = totalDistance;
        this.createDate = createDate;
        this.status = status;
        this.deleteoperation = deleteoperation;
        this.loginid = loginid;
        this.logintype = logintype;
        this.mfcFrom = mfcFrom;
        this.mfcTo = mfcTo;
        this.workedAt = workedAt;
    }
    public MfcMaster(String station, String stType, String modeOfTravel, String totalDistance, String ta, String da, Date createDate, String status, String deleteoperation, String loginid, String logintype, String mfcFrom, String mfcTo, String workedAt) {
       this.station = station;
       this.stType = stType;
       this.modeOfTravel = modeOfTravel;
       this.totalDistance = totalDistance;
       this.ta = ta;
       this.da = da;
       this.createDate = createDate;
       this.status = status;
       this.deleteoperation = deleteoperation;
       this.loginid = loginid;
       this.logintype = logintype;
       this.mfcFrom = mfcFrom;
       this.mfcTo = mfcTo;
       this.workedAt = workedAt;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mfc_id", unique=true, nullable=false)
    public Integer getMfcId() {
        return this.mfcId;
    }
    
    public void setMfcId(Integer mfcId) {
        this.mfcId = mfcId;
    }

    
    @Column(name="station", nullable=false, length=45)
    public String getStation() {
        return this.station;
    }
    
    public void setStation(String station) {
        this.station = station;
    }

    
    @Column(name="st_type", nullable=false, length=45)
    public String getStType() {
        return this.stType;
    }
    
    public void setStType(String stType) {
        this.stType = stType;
    }

    
    @Column(name="mode_of_travel", nullable=false, length=45)
    public String getModeOfTravel() {
        return this.modeOfTravel;
    }
    
    public void setModeOfTravel(String modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
    }

    
    @Column(name="total_distance", nullable=false, length=45)
    public String getTotalDistance() {
        return this.totalDistance;
    }
    
    public void setTotalDistance(String totalDistance) {
        this.totalDistance = totalDistance;
    }

    
    @Column(name="ta", length=45)
    public String getTa() {
        return this.ta;
    }
    
    public void setTa(String ta) {
        this.ta = ta;
    }

    
    @Column(name="da", length=45)
    public String getDa() {
        return this.da;
    }
    
    public void setDa(String da) {
        this.da = da;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date", nullable=false, length=19)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="status", nullable=false, length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    
    @Column(name="deleteoperation", nullable=false, length=45)
    public String getDeleteoperation() {
        return this.deleteoperation;
    }
    
    public void setDeleteoperation(String deleteoperation) {
        this.deleteoperation = deleteoperation;
    }

    
    @Column(name="loginid", nullable=false, length=45)
    public String getLoginid() {
        return this.loginid;
    }
    
    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    
    @Column(name="logintype", nullable=false, length=45)
    public String getLogintype() {
        return this.logintype;
    }
    
    public void setLogintype(String logintype) {
        this.logintype = logintype;
    }

    
    @Column(name="mfc_from", nullable=false, length=45)
    public String getMfcFrom() {
        return this.mfcFrom;
    }
    
    public void setMfcFrom(String mfcFrom) {
        this.mfcFrom = mfcFrom;
    }

    
    @Column(name="mfc_to", nullable=false, length=45)
    public String getMfcTo() {
        return this.mfcTo;
    }
    
    public void setMfcTo(String mfcTo) {
        this.mfcTo = mfcTo;
    }

    
    @Column(name="worked_at", nullable=false, length=45)
    public String getWorkedAt() {
        return this.workedAt;
    }
    
    public void setWorkedAt(String workedAt) {
        this.workedAt = workedAt;
    }




}

