package main;

import java.util.ArrayList;

public class �������� {
	
	/*
	 * 15739248610�����ϱ� 
	 * 
	 */
	public static void main (String []args) {
	int[] arr = {1,5,7,3,9,2,4,8,6,10};

	int i,j,min,index = 0,temp;
	//i,j(�迭���� Ž��), min(�ּڰ�), index(���� ���� �迭 ���� ��ġ),temp(Ư�� �� ���� �ڸ� �ٲ�)
	
	for( i=0;i<10;i++) {//ù��° �ڸ� �϶� 
		System.out.println(i);
		min=999;
		for(j=i ; j<10; j++) {//������ ĭ�� ���鼭 ���κ��� ���� ���� ã�� 
		System.out.println(j);
			if(min>arr[j]) {
				min = arr[j];//j���� �־��ش�
				System.out.println(min);
				index =j;//j�� �ش� ��ġ ���� �־��ش�.
				System.out.println(index);
			
			}
		}	
		
		temp = arr[i];//��ġ����(i�� ���� ���� �����˱�)
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