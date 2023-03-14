package main;

import java.util.Scanner;

public class 문자찾기 {
	public int solution(String str,char t) {
		int answer =0;
		str= str.toUpperCase();//대문자화 
		t=Character.toUpperCase(t);
		/*
		 * for( int i = 0; i <str.length(); i ++) { if( str.charAt(i)==t) { answer++; }
		 * 
		 * }
		 */
		for(char x : str.toCharArray()) {
			if(x== t) answer++;
		}
		
		
		
		return answer;
		
		
		
	}
	
	public static void main(String[] args) {

		문자찾기 c = new 문자찾기();
		Scanner sc = new Scanner(System.in);
	
	   String str = sc.nextLine();
		
		char t = sc.next().charAt(0);
		System.out.println(c.solution(str, t));
		
		

		
		
	}

}
