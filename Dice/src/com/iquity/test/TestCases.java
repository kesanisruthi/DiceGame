package com.iquity.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.iquity.DiceGame;
import com.java.Test1;

public class TestCases {

	@Test
	public void test() {
		int input1[]={1,2,3,4,5};
		 DiceGame dg=new DiceGame();
			int result=dg.fetchscore(input);
			assertEquals(140, result);
			
			int input2[]={1,1,1,2,2};
			int result3=dg.fetchscore(input2);
			assertEquals(1000, result3);
			
			int input3[]={5,4,5,4,5};
			int result4=dg.fetchscore(input3);
			assertEquals(580, result4);
			
			int input4[]={5,0,5,4,5};
			int result5=dg.fetchscore(input4);
			assertEquals(0, result5);
	}

}
