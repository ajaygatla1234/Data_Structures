package com.sorting;

import java.util.Arrays;

public class Hashing_Basic_Concept{
	
	public static void main(String[] args) {
		
		int values[]= {21,32,43,54,65,76,87,98};
		
		int hashTable[]=new int[10];
		
		for(int i=0;i<values.length;i++) {
			int hashFunction=values[i]%10;
			hashTable[hashFunction]=values[i];
		}
		
		System.out.println(Arrays.toString(hashTable));
		System.out.println(hashTable[8]);
	}	
}