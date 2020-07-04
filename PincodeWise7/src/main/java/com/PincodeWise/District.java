package com.PincodeWise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity

public class District {
	
	@Id
	@Column(name="districtCode")
	private String districtCode;
    private String districtName;
    private String stateCode;
    
   
public District(String districtCode, String districtName, String stateCode) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.stateCode = stateCode;
	}
public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	//    private String stateCode;
//    private String countryCode;
//    private String status;
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
//	public String getStateCode() {
//		return stateCode;
//	}
//	public void setStateCode(String stateCode) {
//		this.stateCode = stateCode;
//	}
//	public String getCountryCode() {
//		return countryCode;
//	}
//	public void setCountryCode(String countryCode) {
//		this.countryCode = countryCode;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}

    
    
}
