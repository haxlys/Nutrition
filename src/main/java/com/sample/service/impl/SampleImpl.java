package com.sample.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sample.service.SampleService;

@Service
public class SampleImpl implements SampleService{

	@Resource
	SampleDAO sampleDAO;
	
	@Override
	public int selectCntFoodDes() {
		return sampleDAO.selectCntFoodDes();
	}
	
}
