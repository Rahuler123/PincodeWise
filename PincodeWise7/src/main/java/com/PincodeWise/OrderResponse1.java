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
public class OrderResponse1 {

//    private String PincodeName;
//    private String cityName;

    
    private String Pincode;
    private String stateName;
    private String districtName;
    
    
    
    public OrderResponse1(String Pincode, String stateName, String districtName) {
        this.Pincode = Pincode;
        this.stateName = stateName;
        this.districtName = districtName;
        
    }

 // private String stateCode;

	public String getPincode() {
		return Pincode;
	}

	public void setPincode(String Pincode) {
		this.Pincode = Pincode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
	
	

//	public int getstateCode() {
//		return stateCode;
//	}
//
//	public void setStateCode(String stateCode) {
//		this.stateCode = stateCode;
//	}
//    
    
    
}
