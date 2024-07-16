package com.gl1;

import java.util.Scanner;

public class SumOfArray {

	public static void sum1() {
		int arr[]= {5,2};
		int sum=0;

		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}

		System.out.println("Sum : "+sum);
	}

	public static void sum2() {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];


		int a=0;
		System.out.println("Enter 5 values");
		for(int i=0;i<numbers.length;i++){
			numbers[i]=scanner.nextInt(); //asks for the number for every iteration
			a=a+numbers[i];               //it will just add but not display when iteration is going on
		}
		System.out.println("Sum : "+a);

		scanner.close();
	}


	public static void main(String[] args) {
		
		sum1();
		sum2();
	}


}
