package main;

import java.util.Arrays;
import java.util.Iterator;

public class �������� {
	public static void main(String[] args) {
		int temp = 0;
		int j = 0;
		int arr[] = {2,3, 4, 5, 6,7, 8, 9,  10,1 };
		//�տ� ������ �� ������ �Ǿ��ִٰ� ���� 
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println(i);
			j = i;
			System.out.println(j);
			while (j >= 0 &&  arr[j] > arr[j+1]) {//-1�迭�� ������ �� ��������.
				System.out.println(arr[j]);
				System.out.println(arr[j+1]);
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
				j--;
				System.out.println(j);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}	
}
 
