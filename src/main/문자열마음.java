package main;

import java.util.ArrayList;
import java.util.Scanner;

public class 문자열마음 {
	public String[] solution(int n, String[] str) {
		
        String[] answer = {};
        char b;
        for(int i = 0 ; i< str.length ;i++) {
        	;
			 System.out.println(str[i]);
		        b  =str[i].charAt(n);
		              System.out.println(b);
		              
		    	
        	
        }
        		
		
				return answer;
	}
	
	
	public static void main(String[] args){
	
		문자열마음 T = new 문자열마음();
		int n = 1;
		String [] str = {"name", "key", "hello"};
		System.out.println(T.solution(n, str));
	}
}

