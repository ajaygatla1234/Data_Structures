package com.ds.linear.linkedlist.singly;

public class Singly_Nodes_Display {
	
public static void main(String[] args) {
		
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
		
		//Display the Nodes
		Node currentNode = headNode;
		while(currentNode!=null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.nextNode;
		}
	}


}
