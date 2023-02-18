package main;

public class 버블정렬 {

	
	public static void main(String[]args) {
		
		
		int j,i ,temp;
		
		int [] arr = {1,5,8,10,2,7,4,6,3,9};
		
		for(j=0; j<10; j++ ) {
		
			System.out.println(j);
			for(i=0; i<9-j ;i++) {
				System.out.println(i);
					if(arr[i] >arr[i+1]) {
					 System.out.println(arr[j]);
						temp = arr[i];
						System.out.println(temp);
						arr[i]=arr[i+1];
						System.out.println(arr[i]);
						arr[i+1]=temp;
						System.out.println(arr[i+1]);
						
					}
				
				
			}
			
		}
		
		for(j = 0 ; j<10 ; j++ ) {
			System.out.printf("%d" ,arr[j]);
		}
	}
	
	
	
	

}
