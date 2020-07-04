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
public class State {
    @Id
    
    @Column(name = "stateCode")
    private String stateCode;
    private String stateNameCaps;
//    private String countryCode;
//    private String districtCode;
//    private String status;
//    private String stateNameReg;
//    private int min_pin_prefix;
//    private int max_pin_prefix;
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateNameCaps() {
		return stateNameCaps;
	}
	public void setStateNameCaps(String stateNameCaps) {
		this.stateNameCaps = stateNameCaps;
	}
//	public String getCountryCode() {
//		return countryCode;
//	}
//	public void setCountryCode(String countryCode) {
//		this.countryCode = countryCode;
//	}
//	public String getDistrictCode() {
//		return districtCode;
//	}
//	public void setDistrictCode(String districtCode) {
//		this.districtCode = districtCode;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public String getStateNameReg() {
//		return stateNameReg;
//	}
//	public void setStateNameReg(String stateNameReg) {
//		this.stateNameReg = stateNameReg;
//	}
//	public int getMin_pin_prefix() {
//		return min_pin_prefix;
//	}
//	public void setMin_pin_prefix(int min_pin_prefix) {
//		this.min_pin_prefix = min_pin_prefix;
//	}
//	public int getMax_pin_prefix() {
//		return max_pin_prefix;
//	}
//	public void setMax_pin_prefix(int max_pin_prefix) {
//		this.max_pin_prefix = max_pin_prefix;
//	}
	public State(String stateCode, String stateNameCaps, String countryCode, String districtCode, String status,
			String stateNameReg, int min_pin_prefix, int max_pin_prefix) {
		super();
		this.stateCode = stateCode;
		this.stateNameCaps = stateNameCaps;
//		this.countryCode = countryCode;
//		this.districtCode = districtCode;
//		this.status = status;
//		this.stateNameReg = stateNameReg;
//		this.min_pin_prefix = min_pin_prefix;
//		this.max_pin_prefix = max_pin_prefix;
	}

    
    
}
