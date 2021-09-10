package com.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {

	public static void main(String[] args) {
		
		TestNG obj=new TestNG();
		List<String> suites=new ArrayList<String>();
		suites.add("C:\\Users\\Iqra Andleeb\\workspace\\ConfigPortal\\testng.xml");
		obj.setTestSuites(suites);
		//running all the classes through textng1.xml
	
		obj.run();
		
		
	}

	
	

}
