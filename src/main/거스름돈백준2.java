package main;

public class �Ž���������2 {
	
	public static void main(String[] args) {
		
		int count = 0;//���� ����
		int money = 1000-380; // �Ž����� 
		int [] coin_types = { 500,100,50,10,5,1}; //ȭ�� ����
		
		for( int coin : coin_types) {
		 System.out.println(money/coin); 
			count += money/coin;
			 System.out.println(count); 
            
            money %=coin;
			
			
			
		}
		
		
		System.out.println(count);
		
	}

}
