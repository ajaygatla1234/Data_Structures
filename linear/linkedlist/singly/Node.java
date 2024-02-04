package com.ds.linear.linkedlist.singly;

public class Node {
	
	int data; // Data stored in the node
	
	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
	
	// Constructor used in Singly_Reverse_The_Nodes
	// Constructor to create a node with given data and a specified next node
	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
}
