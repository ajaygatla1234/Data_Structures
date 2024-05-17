package com.gl.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort_1(int[] arr) {

		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;       

			while(j>=1 && arr[j-1]>temp) { 
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
	}

	
	/*
	 * Algorithm Performance Analysis:
	 * Time Complexity:
	 * worst & Average - O(n^2)
	 * Best-O(n)(if the array is already sorted)
	 * Space Complexity - O(1) - Constant space complexity (inplace)
	 * Stable 
	 * Number of comparisons - n^2/4(Average), n^2/2(Worst)
	 * Number of swaps - n^2/8(Average), n^2/4(Worst) 
	 */


	public static void insertionSort_2(int[] arr) {

		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;       

			while(j>=0 && arr[j]>temp) { 
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}


	public static void insertionSort_3(int[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };

		int len = arr.length;

		for(int i=0;i<len-1;i++) {

			for(int j=i+1;j<len;j++) {

				if(arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr= {5,4,3,2,1};
		

		insertionSort_1(arr);

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}