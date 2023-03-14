package main;

import java.util.Scanner;

public class 문장속단어 {
	public String solution(String str) {
		
		String answer="";
		int m = Integer.MIN_VALUE;
		int pos;
		while((pos=str.indexOf(' '))!= -1) {//띄어 쓰기가 있을때 까지 만 
			System.out.println(pos);//첫번째 띄어쓰기가 있는 위치 까지 (2)
			String tmp = str.substring(0,pos);//띄어쓰기 단어(it)
			System.out.println(tmp);//it (substirng 은 처음 부터 마지막 -1하기//0과1 인덱스 값 가져오기  )
			int len = tmp.length();//길이 2(it)
			if(len>m) {
				m=len;//2
				answer=tmp;//it
				
			}
			str = str.substring(pos+1);//인덱스 2 에서 1더하면 그다음 단어 로간다
			System.out.println(str);
			
			
		}
		System.out.println(str.length());
		System.out.println(m);
		if(str.length()>m) answer=str;
	System.out.println(str);
				return answer;
	}
	
	
	public static void main(String[] args) {
		문장속단어 T = new 문장속단어();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}

}
