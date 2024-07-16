package com.gl;

import java.util.Arrays;

public class DynamicArray {
	
	int arr[];
	int size;
	int capacity;
	
	DynamicArray(int capacity){
		this.capacity=capacity;
		arr=new int[capacity];
		size=0;
	}
	
	public void insert(int element) {
		if(size==capacity) {
			growArray();
		}
		arr[size++]=element;  //first it will assign the element at 0th index & then size is incremented
	}
	
	public void growArray() {
		int temp[]=new int[2*capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		capacity=2*capacity; //updates the capacity to double capacity
	}
	
	public void display() {
		System.out.println(Arrays.toString(arr));
		System.out.println("Size : "+size);
		System.out.println("Capacity : "+capacity);
	}
	
	public static void main(String[] args) {
		
		DynamicArray obj = new DynamicArray(2);
		
		obj.insert(1);
		obj.insert(2);
		obj.insert(3);
		obj.insert(4);
		obj.insert(5);
		obj.display();
	}
}