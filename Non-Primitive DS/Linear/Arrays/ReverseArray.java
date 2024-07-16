package com.gl1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		int temp;
		int j = array.length - 1;

		System.out.println("Enter 5 values:");
		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();
		}

		// Reverse the array
		for (int i = 0; i < array.length / 2; i++) { 
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			j--;
		}

		// Print the reversed array
		System.out.println("Reversed array:");
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println(); // Print a newline for better formatting

		// Print the reversed array using Arrays.toString
		System.out.println(Arrays.toString(array));

		scanner.close();

		//array.length/2 = if odd no. of Numbers are there, then the middle value remains at the same position as o/p of array.length/2 is int & it will not go to the middle as no element to swap.

		//Ex: if 7 no.s are there in array, array.length/2 is 3, it will not goes to middle element of 4th index, & as only one element is present, No need to swap
	}
}
