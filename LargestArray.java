package com.selenium;

public class LargestArray {
// Find largest and 2nd largest array elemnt 
	public static void main(String[] args) {
		int[] it= {1,2,3,4};
		
		int largestarry=0;
		
		int Seclarge=0;

		
		for(int i=0;i<it.length;i++)
		{
			
			if(largestarry<it[i])
				
			{
				Seclarge=largestarry;
				
				largestarry=it[i];
				
			}
			
		}
		
		System.out.println("Largset Array:"  +largestarry );
		
		System.out.println("Largset Array:"  +Seclarge );
	}

}
