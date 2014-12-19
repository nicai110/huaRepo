package com.test.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import com.test.dao.TestDaoImpl;

@Service(value="testService")
public class TestServiceImpl  {
	@Autowired
	private TestDaoImpl testDao;
	
	public ArrayList<String> load(){
		return testDao.load();
	}
}
