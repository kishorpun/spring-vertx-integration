package com.kiss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiss.entity.ScreeningNRequest;
import com.kiss.repository.IScreeningRepository;

@Service
public class ScreeningService {
	@Autowired
	IScreeningRepository repository;
	
	public List<ScreeningNRequest> findAllScreening(){
		return repository.findAll();
	}

}
