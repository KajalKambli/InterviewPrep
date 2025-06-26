package com.selenium;

import java.util.Arrays;

public class AddElements {
//addition of int 
	public static void main(String[] args) {
		
		
		
		int i=123;
		
		//1+2+3=6
		
		int[] iarry =String.valueOf(i).chars().map(Character::getNumericValue).toArray();
		
		int addition=Arrays.stream(iarry).sum();
		
		System.out.println("addition of i : "+addition);

	}

}
