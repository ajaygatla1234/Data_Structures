package com.ds.linear.linkedlist.singly;

public class Node {
	
	int data;

	Node nextNode;

	public Node(int data) {
		this.data=data;
		this.nextNode=null;  //optional
	}
	
	//Constructor used in Singly_Reverse_The_Nodes
	public Node(int data, Node nextNode) {
		this.data=data;
		//this.nextNode=null;
		this.nextNode=nextNode;
	}

}
