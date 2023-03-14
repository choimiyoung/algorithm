package main;

public class ∞≈Ω∫∏ßµ∑πÈ¡ÿ2 {
	
	public static void main(String[] args) {
		
		int count = 0;//∞πºˆ ºº±‚
		int money = 1000-380; // ∞≈Ω∫∏ßµ∑ 
		int [] coin_types = { 500,100,50,10,5,1}; //»≠∆Û ¥‹¿ß
		
		for( int coin : coin_types) {
		 System.out.println(money/coin); 
			count += money/coin;
			 System.out.println(count); 
            
            money %=coin;
			
			
			
		}
		
		
		System.out.println(count);
		
	}

}
