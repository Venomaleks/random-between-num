package com.teknikhogskolan.ranomd_maven_01;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MethodRandomTest {

	MyRandomMethods mrm = new MyRandomMethods();
	
	int result = 0; 
	
	@Test
	public void testBetween1and10() {
		
		for (int i = 0; i < 10; i++) {
			
			result = mrm.randomBetween1and10();
			
			assertTrue((result >= 1) && ( result <= 10));
			System.out.print(result + ", ");
			
		}
		System.out.println(": 1 to 10");
	}
		
		
	@Test
	public void testBetween11and20() {
		
		for (int i = 0; i < 10; i++) {
			
			result = mrm.randomBetween11and20();
			
			assertTrue((result >= 11) && ( result <= 20));
			System.out.print(result + ", ");
		}
		System.out.println(": 11 to 20");
	}
	
	
		
	@Test
	public void testBetween21and30() {
		
		for (int i = 0; i < 10; i++) {
			
			result = mrm.randomBetween21and30();
			
			assertTrue((result >= 21) && ( result <= 30));
			System.out.print(result + ", ");
		}
		
		System.out.println(": 21 to 30");	
	}
	
	@Test
	public void testBetween31and40() {
		
		for (int i = 0; i < 10; i++) {
			
			result = mrm.randomBetween31and40();
			
			assertTrue((result >= 31) && ( result <= 40));
			System.out.print(result + ", ");
			
		}
		
		System.out.println(": 31 to 40");
	}
	
	@Test
	public void testBetween41and50() { 
		
		for (int i = 0; i < 10; i++) {
			
			result = mrm.randomBetween41and50();
			
			assertTrue((result >= 41) && ( result <= 50));
			System.out.print(result + ", ");
			
		}
		
		System.out.println(": 41 to 50");
		
	}

}
