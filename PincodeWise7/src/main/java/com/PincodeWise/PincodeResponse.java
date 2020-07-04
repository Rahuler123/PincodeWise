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

public class PincodeResponse {
	
	 private int pincode;
	    private String  districtCode;
	    private String  stateCode;
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
		public PincodeResponse(int pincode, String districtCode, String stateCode) {
			super();
			this.pincode = pincode;
			this.districtCode = districtCode;
			this.stateCode = stateCode;
		}
	    
	    
	    
	

}
