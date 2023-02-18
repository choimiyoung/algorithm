package main;

import java.util.ArrayList;

public class 선택정렬 {
	
	/*
	 * 15739248610정렬하기 
	 * 
	 */
	public static void main (String []args) {
	int[] arr = {1,5,7,3,9,2,4,8,6,10};

	int i,j,min,index = 0,temp;
	//i,j(배열원소 탐색), min(최솟값), index(가장 작은 배열 원소 위치),temp(특정 두 숫자 자리 바꿈)
	
	for( i=0;i<10;i++) {//첫번째 자리 일때 
		System.out.println(i);
		min=999;
		for(j=i ; j<10; j++) {//나머지 칸을 돌면서 본인보다 작은 숫자 찾기 
		System.out.println(j);
			if(min>arr[j]) {
				min = arr[j];//j값을 넣어준다
				System.out.println(min);
				index =j;//j의 해당 위치 값을 넣어준다.
				System.out.println(index);
			
			}
		}	
		
		temp = arr[i];//위치정보(i해 현재 숫자 가져옹기)
		System.out.println(temp);
		arr[i] =arr[index];
		System.out.println(arr[i]);
		arr[index] =temp;
		System.out.println(arr[index]);
		System.out.println(arr);
		
	}

	for(i =0;i<10 ; i++) {
		System.out.printf("%d" ,arr[i]);
		
	}
	
	
  }
}