package main;

import java.util.ArrayList;
import java.util.Scanner;

public class �ܾ������ {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
		 char[] s = x.toCharArray();
		System.out.println(s);
		 int lt =0, rt=x.length()-1;
		 System.out.println(x.length());
        System.out.println(rt);
		 while(lt<rt) {
			 char tmp=s[lt];
			 System.out.println(tmp);
			 s[lt]=s[rt];
			 System.out.println(s[lt]);
			 s[rt]=tmp;
			 System.out.println(s[rt]);
			 lt++;
	System.out.println(lt);
			 rt--;
			 System.out.println(rt);
		 }
			String tmp=String.valueOf(s);
			System.out.println(tmp);
			answer.add(tmp);
			
		}
	
				return answer;
	}
	
	
	public static void main(String[] args){
	�ܾ������ T = new �ܾ������();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		
		String[] str=new String[n];//n ���� ��ŭ�� String �迭 �����.
		for(int i=0; i<n; i++){
			str[i]=kb.next();//���� �־��ش�.
			
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		
		}
	}
}

