package com.beasp.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository(value="testDao") 
public class TestDaoImpl {
	
	public ArrayList<String> load(){ 
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		return al;  
	}
	
}
