package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ū���ǹ�Ģ2 {
	
	/*
	 * Q.�ݺ��Ǵ� ���� ũ��?
	 * (K+1)
	 * Q.������ �ݺ��Ǵ� Ƚ��?
	 * 	M/(K+1) =N
	 * Q.���� ū �� �� �����ϴ� Ƚ��?
	 * N*K=W 
	 * 
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// �� ���� �о� String Ÿ������ ���� �����ö� ����Ѵ�.
	 int[] inputNumArr =Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	 int[]data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
	 int n = inputNumArr[0];//�迭�� ũ�� 5
	 int m = inputNumArr[1];//���ڰ� �������� Ƚ�� 8
	 int k = inputNumArr[2];//�����ؼ� �� �� �� �ִ� Ƚ��  3
	 
	 
	 //�Է� ���� �� ����
	 Arrays.sort(data);
	 System.out.println(data);
	 int first = data[n-1];//���� ū �� 
	 System.out.println(first);
	 int second = data[n-2];//�״��� ū�� 
	 System.out.println(second);
	 
	 //���� ū ���� �������� Ƚ�� ���
	 int count = m/(k+1) +k;
	 count += m %(k+1);//�� �������� ���� ��� ������ �� ���ϱ� 
	 
	 int result =0;
	 result +=(count)* first; //���� ū �� ���ϱ�
	 result +=(m-count)*second;//�ι�°�� ū �� ���ϱ� 
	 
	 System.out.println(result);
	 
	 
	 
	 
	 
	}
}
