package com.wipro.service;

import java.util.List;
import java.util.Optional;

import com.wipro.model.CafeInfo;

public interface CafeInfoService {

	public CafeInfo addCafe(CafeInfo cafeInfo);
	
	public List<CafeInfo> getCafes();
	
	public Optional<CafeInfo> getCafeById(Integer cafeId);
	
}
