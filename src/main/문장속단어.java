package main;

import java.util.Scanner;

public class ����Ӵܾ� {
	public String solution(String str) {
		
		String answer="";
		int m = Integer.MIN_VALUE;
		int pos;
		while((pos=str.indexOf(' '))!= -1) {//��� ���Ⱑ ������ ���� �� 
			System.out.println(pos);//ù��° ���Ⱑ �ִ� ��ġ ���� (2)
			String tmp = str.substring(0,pos);//���� �ܾ�(it)
			System.out.println(tmp);//it (substirng �� ó�� ���� ������ -1�ϱ�//0��1 �ε��� �� ��������  )
			int len = tmp.length();//���� 2(it)
			if(len>m) {
				m=len;//2
				answer=tmp;//it
				
			}
			str = str.substring(pos+1);//�ε��� 2 ���� 1���ϸ� �״��� �ܾ� �ΰ���
			System.out.println(str);
			
			
		}
		System.out.println(str.length());
		System.out.println(m);
		if(str.length()>m) answer=str;
	System.out.println(str);
				return answer;
	}
	
	
	public static void main(String[] args) {
		����Ӵܾ� T = new ����Ӵܾ�();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}

}
