package com.wipro.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import com.wipro.model.CafeInfo;
import com.wipro.repository.CafeInfoRepository;
import com.wipro.service.CafeInfoService;

@Service
@EnableAutoConfiguration
public class CafeInfoServiceImpl implements CafeInfoService{

	@Autowired
	CafeInfoRepository repo;

	@Override
	public CafeInfo addCafe(CafeInfo cafeInfo) {
		System.out.println("CafeInfo details inside cafeInfoService addCafeservice:"+cafeInfo.getCafeName()+""+cafeInfo.getCafeDesc());
		
		System.out.println("new repository objecct:"+repo);
		return repo.save(cafeInfo);
	}

	@Override
	public List<CafeInfo> getCafes() {
		return repo.findAll();
	}

	@Override
	public Optional<CafeInfo> getCafeById(Integer cafeId) {
		// TODO Auto-generated method stub
		return repo.findById(cafeId);
	}
	
	
}
