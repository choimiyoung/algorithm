package main;







class Solution {
	public static void main( String[] args) {
		
	solution(1,2,3,4);
		
	}
    public static Object solution(int numer1, int denom1, int numer2, int denom2) {
    	 
         
    	 int numerator = numer1 * denom2 + denom1*numer2;
    	 int denominator = denom1 * denom2;
    	 
    	 
    	 	
    	  int temp =Euclidean(numerator, denominator);
    	   
    	 int dam1 =numerator /= temp;
    	 int dam2 =denominator /= temp;
    	 System.out.printf("%s","%s" ,dam1,dam2);
    	 int [] answer = {dam1,dam2};
    	 
    	 
    
         return   answer ;
    	
    	
    	
    	

    }
    
    
  public static   int Euclidean(int a, int b) {
	   if (a <= b) {
           int temp = a;
           a = b;
           b = temp;
       }

       if (b == 0) {
           return a;
       }
       return Euclidean(b , a % b);
  }
    
}