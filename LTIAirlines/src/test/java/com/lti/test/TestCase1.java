package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lti.client.Main;
import com.lti.model.Flight;

public class TestCase1 {

	@Test
	public void testAdd() {
		//test data
		int num1=10;int num2=10;
		
		assertEquals(20, Main.add(num1, num2));
		
		
	}
	
	@Test
	public void testNums() {
		int num1=10;int num2=90;
		
		//assertTrue(Main.compare(num1, num2));
		assertFalse(Main.compare(num1, num2));
	}
	
	@Test
	public void testObjects() {
		Flight f1=new Flight(1001, "Pune", "Thane");
//		Flight f2=new Flight(1001, "Pune", "Thane");
		
		//assertSame("Objects are not same",f1, f2);-->false
		//assertEquals(f1, f2);-->false
		Flight f2=f1;
		//assertSame(f1, f2);-->true
		//assertEquals("Objects are equal",f1, f2);-->true
		
		Flight f3=null;
		//assertNotNull(f3);-->fails
		assertNotNull(f1);//-->passes
		
	}
}
