package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 큰수의법칙 {
	
	/*
	 * Q.반복되는 수열 크기?
	 * (K+1)
	 * Q.수열이 반복되는 횟수?
	 * 	M/(K+1) =N
	 * Q.가장 큰 수 가 등장하는 횟수?
	 * N*K=W 
	 * 
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) throws IOException {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 한 줄을 읽어 String 타입으로 값을 가져올때 사용한다.
	 int[] inputNumArr =Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	 int[]data = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer:: parseInt).toArray();
	 int n = inputNumArr[0];//배열의 크기 5
	 int m = inputNumArr[1];//숫자가 더해지는 횟수 8
	 int k = inputNumArr[2];//연속해서 더 할 수 있는 횟수  3
	 
	 
	 //입력 받은 수 정렬
	 Arrays.sort(data);
	 System.out.println(data);
	 int first = data[n-1];//가장 큰 수 
	 System.out.println(first);
	 int second = data[n-2];//그다음 큰수 
	 System.out.println(second);
	int sumNum = 0;//더하기 값
	int count=1;// 카운트  (총 m번)
	while (count <= m) { // 숫자가 더해지는 횟수 m만큼 만 계속 while문을 돌아야 한다.
		System.out.println(count );
		System.out.println(count%k);
		if(count % k ==0) {// 연속해서 더할 수 있는 횟수는 k개로 제한 이 있다.
		sumNum +=data[n-2];
		System.out.println(sumNum);
	}else {
		sumNum +=data[n-1];
		System.out.println(sumNum);
	}
		count++;
	}
	System.out.println(sumNum);	
	}

}
