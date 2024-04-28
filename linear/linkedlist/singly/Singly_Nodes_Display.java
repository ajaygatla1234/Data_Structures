package com.ds.linear.linkedlist.singly;

import java.util.Scanner;

public class Singly_Nodes_Display {

	// Display the Nodes
	public static void display(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
	}

	public static void main(String[] args) {

		// Displaying the hard-coded nodes
		// Adding the data to the nodes
		Node headNode = new Node(10);

		Node secondNode = new Node(20);

		Node thirdNode = new Node(30);

		Node fourthNode = new Node(40);

		// Adding References among the Nodes
		headNode.nextNode = secondNode;

		secondNode.nextNode = thirdNode;

		thirdNode.nextNode = fourthNode;

		fourthNode.nextNode = null;

		System.out.println("Displaying Hard-Coded input");
		display(headNode);

		System.out.println("\n");

		Scanner scanner = new Scanner(System.in);

		//Displays the user input
		int numberOfNodes;
		
		System.out.println("enter No. of Nodes");
		numberOfNodes=scanner.nextInt();
		
		for(int i=1;i<=numberOfNodes;i++) {
			System.out.println("Enter "+i+" Node data");
			int data=scanner.nextInt();
			Node newNode = new Node(data);
			if(headNode==null) {
				headNode=newNode;
			}
			else {
				Node currentNode=head;
				while(currentNode.nextNode!=null) {
					currentNode=currentNode.nextNode;
				}
				cuNode.nextNode=newNode;
			}
		}
		System.out.println();
		display(headNode);

		// Displays the user input using array
		int numberOfNodes1;

		System.out.println("Enter number of Nodes");
		numberOfNodes1 = scanner.nextInt();

		System.out.println("Enter Individual Node's Data");

		int key[] = new int[numberOfNodes1];

		for (int i = 0; i < numberOfNodes1; i++) {
			key[i] = scanner.nextInt();
		}

		for (int i = numberOfNodes1 - 1; i >= 0; i--) {
			// Creating nodes with user input and adding them at the front
			headNode = new Node(key[i], headNode);
		}

		System.out.println();
		System.out.println("Displaying the user input Nodes");
		display(headNode);

		scanner.close();
	}

}
