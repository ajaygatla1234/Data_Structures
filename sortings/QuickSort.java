package com.gl.sorting;

import java.util.Arrays;

public class QuickSort {
	
	public static int partition(int arr[], int lowerIndex, int higherIndex) {
		
		int pivot = arr[higherIndex];
		
		int i=lowerIndex-1;
		
		for(int j=lowerIndex;j<higherIndex;j++) {
			if(arr[j]<pivot) {
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[higherIndex];
		arr[higherIndex]=temp;
		
		return i+1;
	}
	
	public static void quickSort(int arr[], int lowerIndex, int higherIndex) {
		
		if(lowerIndex<higherIndex) {
			
			int p = partition(arr,lowerIndex,higherIndex);
			
			quickSort(arr, lowerIndex, p-1);
			quickSort(arr, p+1, higherIndex);
		}
	}
	
	/*
	 * Algorithm Performance Analysis:
	 * Time Complexity:
	 * worst  - O(n^2)
	 * Average & Best - O(n*log n) 
	 * 
	 * Space Complexity - O(log(n))
	 * Not-Stable 
	 * Number of comparisons - n*log(n)
	 * Number of swaps - 
	 */

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		
		quickSort(arr, 0 , arr.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}