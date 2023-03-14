package main;

public class ∞≈Ω∫∏ßµ∑πÈ¡ÿ {
	
	public static void main(String[] args) {
		
		int count = 0;//∞πºˆ ºº±‚
		int money = 1000-380; // ∞≈Ω∫∏ßµ∑ 
		int [] coin_types = { 500,100,50,10,5,1}; //»≠∆Û ¥‹¿ß
		
	  for(int i =0; i<coin_types.length ;i++) {
		  if(money/coin_types[i]>0) {
			  
			  count += money/coin_types[i];
			  money %=coin_types[i];
			  
			  
			  
		  }
		  
		  
		  
	  }
		
		
		System.out.println(count);
		
	}

}
