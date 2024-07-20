package com.gl.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int arr[], int lowerIndex, int higherIndex) {

		if(lowerIndex<higherIndex) {
			int midIndex=lowerIndex+(higherIndex-lowerIndex)/2;

			sort(arr,lowerIndex,midIndex);
			sort(arr,midIndex+1,higherIndex);

			merge(arr,lowerIndex,midIndex,higherIndex);
		}
	}

	public static void merge(int arr[], int lowerIndex, int midIndex, int higherIndex) {

		int subArraySize_1 = midIndex-lowerIndex+1;
		int subArraySize_2=higherIndex-midIndex;

		int[] leftSubArray = new int[subArraySize_1];
		int[] righttSubArray = new int[subArraySize_2];

		for(int i=0;i<subArraySize_1;i++) {
			leftSubArray[i]=arr[i+lowerIndex];
		}

		for(int i=0;i<subArraySize_2;i++) {
			righttSubArray[i]=arr[midIndex+1+i];
		}

		int i=0,j=0,k=lowerIndex;

		while(i<subArraySize_1 && j<subArraySize_2) {
			if(leftSubArray[i]<=righttSubArray[j]) {
				arr[k]=leftSubArray[i];
				i++;
			}
			else {
				arr[k]=righttSubArray[j];
				j++;
			}
			k++;
		}
		
		while(i<subArraySize_1) {
			arr[k]=leftSubArray[i];
			i++;
			k++;
		}
		while(j<subArraySize_2) {
			arr[k]=righttSubArray[j];
			j++;
			k++;
		}
	}
	
	/*
	 * Algorithm Performance Analysis:
	 * Time Complexity:
	 * worst & Average & Best - O(n log n)
	 * Space Complexity - O(n)   (Auxiliary Space (for merging): O(n) : Recursive Call Stack Space: O(log n) : Overall Space Complexity: O(n))
  	   (The space complexity is dominated by the space required for the temporary arrays used during the merge step. 
      	    The recursion stack space contributes to the total space complexity, but its impact is relatively small compared to the space required for merging.)
	 * Stable 
	 * Number of comparisons - n-1
	 * Number of swaps - The sort answer is that merge sort does not have swaps, or better stated is that it does not need swaps. We can create a temporary array that will be returned as the sum of the lengths of the arrays being merged in order 
	 */

	public static void main(String[] args) {

		int arr[] = {5,4,3,2,1};

		sort(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));

	}

}
