package com.beasp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beasp.bean.BeeTest;
import com.beasp.dao.TestDaoImpl;

@Service(value="testService")
public class TestServiceImpl  {
	@Autowired
	private TestDaoImpl testDao;
	
	public ArrayList<BeeTest> load(){
		return testDao.load();
	}
}
