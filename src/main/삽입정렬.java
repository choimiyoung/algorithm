package main;

import java.util.Arrays;
import java.util.Iterator;

public class 삽입정렬 {
	public static void main(String[] args) {
		int temp = 0;
		int j = 0;
		int arr[] = {2,3, 4, 5, 6,7, 8, 9,  10,1 };
		//앞에 정렬이 다 정렬이 되어있다고 과정 
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println(i);
			j = i;
			System.out.println(j);
			while (j >= 0 &&  arr[j] > arr[j+1]) {//-1배열은 없으니 까 에러난다.
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
 
