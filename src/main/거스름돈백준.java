package main;

public class �Ž��������� {
	
	public static void main(String[] args) {
		
		int count = 0;//���� ����
		int money = 1000-380; // �Ž����� 
		int [] coin_types = { 500,100,50,10,5,1}; //ȭ�� ����
		
	  for(int i =0; i<coin_types.length ;i++) {
		  if(money/coin_types[i]>0) {
			  
			  count += money/coin_types[i];
			  money %=coin_types[i];
			  
			  
			  
		  }
		  
		  
		  
	  }
		
		
		System.out.println(count);
		
	}

}
