package com.ds.linear.linkedlist.singly;

import java.util.Scanner;

public class Singly_Nodes_Display {

	//Display the Nodes
	public static void display(Node head) {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.nextNode;
		}
	}

	public static void main(String[] args) {

		//Displaying the hard-coded nodes
		//Adding the data to the nodes
		Node headNode = new Node(10);

		Node secondNode = new Node(20);

		Node thirdNode = new Node(30);

		Node fourthNode = new Node(40);

		//Adding References among the Nodes
		headNode.nextNode = secondNode;

		secondNode.nextNode = thirdNode;

		thirdNode.nextNode = fourthNode;

		fourthNode.nextNode = null;

		System.out.println("Displaying Hard-Coded input");
		display(headNode);
		
		System.out.println("\n");
		

		//Displays the user input
		Scanner scanner = new Scanner(System.in);

		int numberOfNodes;

		Node head=null;

		System.out.println("Enter number of Nodes");
		numberOfNodes = scanner.nextInt();

		System.out.println("Enter Individual Node's Data");

		int key[] = new int[numberOfNodes];

		for(int i=0; i<numberOfNodes;i++) {
			key[i]=scanner.nextInt();
		}

		for(int i=numberOfNodes-1; i>=0;i--) {
			head = new Node(key[i], head);
		}


		System.out.println();
		System.out.println("Displaying the user input Nodes");
		display(head);

		scanner.close();
	}


}
