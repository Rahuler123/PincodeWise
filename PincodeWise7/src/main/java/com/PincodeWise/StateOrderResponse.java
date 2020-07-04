package com.PincodeWise;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class StateOrderResponse {
	
	private String stateCode;
    private String stateNameCaps;
    private String districtName;
    
    
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
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public StateOrderResponse(String stateCode, String stateNameCaps, String districtName) {
		super();
		this.stateCode = stateCode;
		this.stateNameCaps = stateNameCaps;
		this.districtName = districtName;
	}

}
