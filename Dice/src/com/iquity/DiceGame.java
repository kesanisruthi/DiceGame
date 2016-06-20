package com.iquity;

public class DiceGame {
	public static int count_1=0;
	public static int count_2=0;
	public static int count_3=0;
	public static int count_4=0;
	public static int count_5=0;
	public static int count_6=0;
	public static int count_invalid=0;
	
	public static void checkCount(int input){
		switch(input){
			case 1: count_1++;
					break;	
			case 2: count_2++;
					break;
			case 3: count_3++;
					break;
			case 4: count_4++;
					break;	
			case 5: count_5++;
					break;
			case 6: count_6++;
					break;
			default: count_invalid++;
					break;
			
		} 
		
	}

	public static void main(String[] args) {
		int input[]={5,4,0,4,5};

	}

}
