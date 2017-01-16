package com.sample.service.impl;

import org.springframework.stereotype.Repository;

import com.common.dao.AbstractDAO;

@Repository
public class SampleDAO extends AbstractDAO{
	public int selectCntFoodDes(){
		return (Integer)selectOne("selectCntFoodDes");
	}
}
