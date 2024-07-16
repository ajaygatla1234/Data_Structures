package com.gl.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort_1(int arr[]) {

		for(int i=arr.length-1;i>0;i--) {   //1st loop is for no. of passes & at the end of first pass, it pushes the largest no to correct index
			for(int j=0;j<i;j++) {          //2nd loop is for no. of Iterations & compares the 2 no.s and swap accordingly
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

	public static void bubbleSort_2(int arr[]) {
		//boolean flag = false;   //flag is used to avoid the useless passes that are not required (if the array got sorted within few passes other passes are useless to perform)
		for(int i=0;i<arr.length-1;i++) {
			//flag=0;
			boolean flag = false;
			for(int j=0;j<arr.length-1-i;j++) {  //-i is added to reduce the no of iterations by avoiding comparison of sorted elements
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}
	//Algorithm Performance Analysis
	//Time Complexity
	//worst & Average - O(n^2) 
	//Best-O(n)(only if we use flag or check whether it is already sorted or not)
	//Space Complexity - O(1) - Constant space complexity (inplace)
	//Stable
	//Number of comparisons - n^2
	//Number of swaps - n^2

	public static void main(String[] args) {

		//int[] arr_1= {-1,-2,-3,-4,-5};
		int[] arr_1= {5,4,3,3,4};


		//		System.out.println("Given Array");
		//		for(int a:arr_1) {
		//			System.out.print(a+" ");
		//		}

		System.out.println("Given Array\n"+Arrays.toString(arr_1));

		bubbleSort_1(arr_1);

		//		System.out.println();
		//		System.out.println("\n\nusing 1st method");
		//		System.out.println("Sorted Array");
		//		for(int a:arr_1) {
		//			System.out.print(a+" ");
		//		}

		System.out.println("\nSorted Array with 1st method\n"+Arrays.toString(arr_1));

		bubbleSort_2(arr_1);
		//		System.out.println();
		//		System.out.println("\n\nusing 2nd method");
		//		System.out.println("Sorted Array");
		//		for(int a:arr_1) {
		//			System.out.print(a+" ");
		//		}

		System.out.println("\nSorted Array with 2nd method\n"+Arrays.toString(arr_1));

	}

}
