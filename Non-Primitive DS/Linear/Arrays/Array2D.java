package com.gl;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter NO of Rows");
        int i=scanner.nextInt();
        System.out.println("Enter NO of Columns");
        int j=scanner.nextInt();
        int[][] arr = new int[i][j];
        
        System.out.println("Enter the elements of the array:");
        for(int k=0;k<arr.length;k++){
            for(int l=0;l<arr[k].length;l++){
            	System.out.print("Element at [" + k + "][" + l + "]: ");
            	arr[k][l]=scanner.nextInt();
            }
        }
        
        for(int m=0;m<arr.length;m++) {
        	for(int n=0;n<arr[m].length;n++) {
        		System.out.print(arr[m][n]+" ");
        	}
        	System.out.println();
        }
        System.out.println();
        for(int[] a:arr) {
        	System.out.println(Arrays.toString(a));
        }
        System.out.println();
        
        System.out.println(Arrays.deepToString(arr));

        scanner.close();
    }

}
