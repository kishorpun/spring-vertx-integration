package com.kiss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kiss.entity.ScreeningNRequest;

public interface IScreeningRepository extends JpaRepository<ScreeningNRequest, Long>{

	
}
