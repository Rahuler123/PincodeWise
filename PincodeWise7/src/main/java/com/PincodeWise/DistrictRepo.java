package com.PincodeWise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DistrictRepo extends JpaRepository<District, String>{
	
	@Query("SELECT new com.PincodeWise.District(d.districtCode,d.districtName,d.stateCode) FROM District d JOIN State s where d.stateCode = s.stateCode ")
	 public List<District> getJoinInformationnn();
	
	

}
