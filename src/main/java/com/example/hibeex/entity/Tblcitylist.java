package com.example.hibeex.entity;
// Generated 4 Jul, 2019 1:49:52 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tblcitylist generated by hbm2java
 */
@Entity
@Table(name="tblcitylist"
    ,catalog="raf"
)
public class Tblcitylist  implements java.io.Serializable {


     private int cityId;
     private String cityName;
     private String latitude;
     private String longitude;
     private String state;

    public Tblcitylist() {
    }

    public Tblcitylist(int cityId, String cityName, String latitude, String longitude, String state) {
       this.cityId = cityId;
       this.cityName = cityName;
       this.latitude = latitude;
       this.longitude = longitude;
       this.state = state;
    }
   
     @Id 

    
    @Column(name="city_id", unique=true, nullable=false)
    public int getCityId() {
        return this.cityId;
    }
    
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    
    @Column(name="city_name", nullable=false, length=50)
    public String getCityName() {
        return this.cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    
    @Column(name="latitude", nullable=false, length=10)
    public String getLatitude() {
        return this.latitude;
    }
    
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    
    @Column(name="longitude", nullable=false, length=10)
    public String getLongitude() {
        return this.longitude;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    
    @Column(name="state", nullable=false, length=50)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }




}

