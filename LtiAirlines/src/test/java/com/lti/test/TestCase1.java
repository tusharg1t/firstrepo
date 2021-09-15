package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		//test data
		int num1=10; int num2=10;
		
		assertEquals(20, Main.add(num1,num2));
	}
	
	@Test
	public void testCompare() {
		int num1=10; int num2=20;
		
		assertTrue(Main.compare(num1, num2));
	}
	
	@Test
	public void testObject() {
		Flight f1=new Flight(1001,"Mumbai","Delhi");
		Flight f2=new Flight(1001,"Mumbai","Delhi");
		
		
	}

}
