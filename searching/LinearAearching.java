package com.gl.searching;

public class LinearAearching {
	
	public static int linearSearch(int arr[], int searchElement) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchElement) {
				return i;
			}
		}
		return -1;
	}
	
	/*
	 * avg & worst case - O(n)
	 * best - O(1) - if element found at 0th index
	 * 
	 * space - o(1) - constant space complexity
	 * 
	 */

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		
		int searchElement=5;
		
		int b = linearSearch(arr, searchElement);
		
		if(b==-1) {
			System.out.println(searchElement+" not found in array");
		}
		else {
			System.out.println(searchElement+" found at Index "+b);
		}
		

		
		

	}

}
