package main;

import java.util.Scanner;

public class 대문자 {
	public String solution(String str) {
		String answer="";
	
		char [] charArray = str.toCharArray();//배열로 바꿔준다.
		
		for( int i=0 ; i<charArray.length; i ++) {
			System.out.println(charArray[i]);
			if(Character.isUpperCase(charArray[i])) {
				System.out.println(charArray[i]);
				answer+=Character.toLowerCase(charArray[i]);
				System.out.println(answer);
		}else {
				
				answer +=Character.toUpperCase(charArray[i]);
				System.out.println(answer);
			}
			
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		대문자 t = new 대문자();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(t.solution(str));
		
		
	}
	

}
