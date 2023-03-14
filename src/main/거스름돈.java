package main;

import java.util.ArrayList;

public class °Å½º¸§µ· {
	/*
	 * 
	 * 
	 */
	

	public static void main (String []args) {
	
		int money =1260;
		int count = 0;
		
		int [] coin_types= {500,100,50,10};
		
		
		for(int coin : coin_types) {
			
			System.out.println(coin);
			count += money/coin;
			System.out.println(count);
			money %= coin;
			System.out.println(money);
			
			
		
			
		}
		
		System.out.println(count);
	
  }
}