package com.teknikhogskolan.ranomd_maven_01;

import java.util.Random;

public class MyRandomMethods {

	public int randomBetween1and10() {
	
		Random rand = new Random();
		
		int result0 = rand.nextInt(10)+1;
		
		return result0;
	}
	
	
	public int randomBetween11and20() {
			
		Random rand = new Random();
		
		int result1 = rand.nextInt(10)+11;
		
		return result1;
	}
	
	
	
	public int randomBetween21and30() {
		
		Random rand = new Random();
		
	 	int result2 = rand.nextInt(10)+21;
		
		return result2;
	}
	
	
	public int randomBetween31and40() {
		
		Random rand = new Random();
		
		int result3 = rand.nextInt(10)+31;
		
		return result3;
	}
	
	
	public int randomBetween41and50() {
		
		Random rand = new Random();
		
		int result4 = rand.nextInt(10)+41;
		
		return result4;
	}	
		
	
}
