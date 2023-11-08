package com.linkedlist.singly;

import java.util.Scanner;

public class Singly_AddGivenNumberOf_LastNodes {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int n;

	public static void addGivenNumberOfLastNodes(Node head, int n) {
		
		//First find the Number of Nodes present
		Node temp = head;
		int count=0;
		while(temp!=null) {
			count++;
			temp = temp.nextNode;
		}
		
		//System.out.println(count);  Number of Nodes in linked list
		
		//Logic for adding last n number of nodes
		Node temp1=head;
		int count1=0;
		int sum=0;
		
		while(temp1!=null) {
			count1++;
			
			if((count1>(count-n))) {
				sum = sum+temp1.data;
			}
			temp1=temp1.nextNode;
			
		}
		
		System.out.println(sum);
	}
	

	public static void display(Node headNode) {
		Node currentNode = headNode;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.nextNode;
		}
	}

	public static void main(String[] args) {

		//Adding the data to the nodes
		Node head = new Node(10);

		Node secondNode = new Node(20);

		Node thirdNode = new Node(30);

		Node fourthNode = new Node(40);

		Node fifthNode = new Node(50);

		//Adding References
		head.nextNode = secondNode;

		secondNode.nextNode = thirdNode;

		thirdNode.nextNode = fourthNode;

		fourthNode.nextNode = fifthNode;

		fifthNode.nextNode = null;

		System.out.println("Given Input :");
		display(head);
		
		System.out.println("\n\nEnter Last Number of nodes to add");
		n=scanner.nextInt();
		
		System.out.println("\nAdding last "+n+" Nodes gives :");
		
		addGivenNumberOfLastNodes(head, n);
	}

}
