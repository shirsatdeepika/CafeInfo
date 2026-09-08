package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.model.CafeInfo;

public interface CafeInfoRepository extends JpaRepository<CafeInfo, Integer>{

}
