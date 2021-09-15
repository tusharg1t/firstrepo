package com.lti.client;

import com.lti.model.Flight;

public class Main {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String args[]) {
		Flight f=new Flight(1001, "Mumbai", "Pune");
		System.out.println(f.getSource()+" "+f.getDestination());
		
		
	}
	
	public static boolean compare(int n1, int n2) {
		if(n1==n2) {
			return true;
		}
		return false;
	}
}
