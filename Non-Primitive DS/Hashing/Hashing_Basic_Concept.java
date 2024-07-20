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

	/*
 
	Is hashing linear or non linear data structures...?
	
	Hashing can be implemented in both linear and non-linear data structures, depending on the specific implementation and use case.
		
	Linear Implementation: When using open addressing techniques like linear probing or quadratic probing, hashing can be considered linear. These methods involve searching for an empty slot in a sequential manner when a collision occurs1.
	Non-Linear Implementation: When using closed addressing techniques like chaining, where each slot in the hash table points to a linked list or another data structure, hashing is considered non-linear12.
		
  	So, hashing itself is a technique that can be adapted to both linear and non-linear data structures.
   
 	*/
}
