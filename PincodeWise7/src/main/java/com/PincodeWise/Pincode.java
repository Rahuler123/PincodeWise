package com.PincodeWise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Pincode {
    @Id
    @GeneratedValue
    @Column(name = "pincode")
    private int pincode;
    private String  districtCode;
    private String  stateCode;
    //private String countryCode;
    
    
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
//	public String getCountryCode() {
//		return countryCode;
//	}
//	public void setCountryCode(String countryCode) {
//		this.countryCode = countryCode;
//		
//	}
	public Pincode(int pincode, String districtCode, String stateCode, String countryCode) {
		super();
		this.pincode = pincode;
		this.districtCode = districtCode;
		this.stateCode = stateCode;
	//this.countryCode = countryCode;
	}
   
}
