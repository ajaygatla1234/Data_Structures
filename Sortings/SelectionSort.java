package com.gl.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int arr[]) {

		for(int i=0;i<arr.length-1;i++) {   //used to put the smallest elements at the correct index
											//i<arr.length-1 is given in outer loop because, there is no need to compare last element cause it will be already in correct position as the largest element 
			int min=i;                      //we assume ith element as the minimum element
			for(int j=i+1;j<arr.length;j++) {  //find the smallest no. based on the index of outer loop & place it in the i index
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			if(min!=i) {         //if the minimum element is present in the same index we compare, then there is no need to swap
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
	}

	/*
	 * Algorithm Performance Analysis
	 * Time Complexity
	 * worst, Average & Best Case - O(n^2)
	 * Space Complexity - O(1) - Constant space complexity (inplace)
	 * Not-Stable (in this particular code, we are not giving any consideration of the relative order of elements while swapping, No guarantee that array remains stable) (if we want we can make it stable by taking special care Programitically with extra steps)
  	 * Go through this link to understand why it is not stable : https://youtu.be/19YOpMMtLx8?feature=shared
	 * Number of comparisons - n^2
	 * Number of swaps - n  (swapping of elements occurs inside the outer loop but outside of inner loop so n times )
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=scanner.nextInt();
		int arr[]=new int[size];

		System.out.println("Enter elements of array");
		for(int i=0;i<size;i++) {
			arr[i]=scanner.nextInt();

		}

		System.out.println("Given Array\n"+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("\nSorted Array\n"+Arrays.toString(arr));
		
		scanner.close();

	}

}
