package com.PincodeWise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StateRepo extends JpaRepository<State, String> {
	
	@Query("SELECT new com.PincodeWise.StateOrderResponse(d.stateCode,s.stateNameCaps,d.districtName) FROM  District d  JOIN State s ON d.stateCode = s.stateCode ")
	 public List<StateOrderResponse> getStateDis();

}
