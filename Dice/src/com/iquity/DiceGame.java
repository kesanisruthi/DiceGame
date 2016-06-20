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
	public static int calculatePoints(){
		int points=0;
		if(count_invalid>0){
			points=0;
		}else {
			if(count_1==3){
				points=1000;
			}else if(count_1==2){
				points+=200;
			} else if(count_1==1){
				points+=100;
			}
			
			if(count_2==3){
				points+=200;
			}
			if(count_3==3){
				points+=300;
			}
			if(count_4==3){
				points+=400;
			}else if(count_4==2){
				points+=80;
			} else if(count_4==1){
				points+=40;
			}
			if(count_5==3){
				points+=500;
			}
			if(count_6==3){
				points+=600;
			}
		}
		return points;
	}

	public static void main(String[] args) {
		int input[]={5,4,0,4,5};

	}

}
