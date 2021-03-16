package com.teknikhogskolan.ranomd_maven_01;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MethodRandomTest {

	@Test
	public void test() {
		
		MyRandomMethods mrm = new MyRandomMethods();
		
		int result = 0; 
		
		
		for (int i = 0; i < 5; i++) {
			
			result = mrm.randomBetween1and10();
			
			assertTrue((result >= 1) && ( result <= 10));
		
		}
		
		for (int i = 0; i < 5; i++) {
			
			result = mrm.randomBetween11and20();
			
			assertTrue((result >= 11) && ( result <= 20));
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			result = mrm.randomBetween21and30();
			
			assertTrue((result >= 21) && ( result <= 30));
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			result = mrm.randomBetween31and40();
			
			assertTrue((result >= 31) && ( result <= 40));
			
		}
		
		for (int i = 0; i < 5; i++) {
			
			result = mrm.randomBetween41and50();
			
			assertTrue((result >= 41) && ( result <= 50));
			
		}
		
	}

}
