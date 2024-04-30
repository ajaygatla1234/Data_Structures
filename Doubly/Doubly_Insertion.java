package com.gl.linkedlist;

public class Doubly_Insertion {
	
	private static NodeDoubly head;
//	private static NodeDoubly third;
	
	//This method used to count the number of nodes
	public static int nodeCounter() {
		NodeDoubly cNode=head;
		int counter=0;
		while(cNode!=null) {
			cNode=cNode.nextNode;
			counter++;
		}
		return counter;
	}
	
	public static void display() {
		NodeDoubly cNode=head;

		while(cNode!=null) {
			System.out.println(cNode.data);
			cNode=cNode.nextNode;
		}
		System.out.println();
	}
	
	public static void displayFromTail1() {
	    NodeDoubly temp = head;
	    // Move temp to the last node
	    while (temp.nextNode != null) {  //if we use temp!=null, at the end of the loop temp=null surpassing the last node, so we cannot traverse if it is null
	        temp = temp.nextNode;
	    }
	    // Now temp points to the last node
	    while (temp != null) {
	        System.out.println(temp.data);
	        temp = temp.previousNode;
	    }
	    System.out.println();
	}
	
	public static void displayFromTail2(NodeDoubly third) {
		NodeDoubly temp = third;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.previousNode;
		}
		System.out.println();
	}
	
	public static void insertAtGivenPosition(int position, int data) {
		NodeDoubly newNode = new NodeDoubly(data);
		
		//for adding the node at head
		if(position==1) {
			newNode.nextNode=head;
			head=newNode;
			display();
			return;
		}
		
		else {
			NodeDoubly previous=head;
			int count=1;
			while(count<position-1&&previous.nextNode!=null) {
				previous=previous.nextNode;
				count++;
			}
			if (count != position - 1) {
				System.err.println("Invalid position specified");
				System.out.println("List has only "+nodeCounter()+" Nodes");
				int i=nodeCounter()+1;
				System.out.println("You can Add upto "+i+" Nodes, Including "+i+" as Last node");
				return;
			}
			
			NodeDoubly currentNode = previous.nextNode;
			previous.nextNode=newNode;
			newNode.nextNode=currentNode;
			display();
		}
		
	}

	
	public static void main(String[] args) {
		head = new NodeDoubly(10);
		NodeDoubly first = new NodeDoubly(20);
		NodeDoubly second = new NodeDoubly(30);
		NodeDoubly third = new NodeDoubly(40);
		
		//forward reference
		head.nextNode=first;
		first.nextNode=second;
		second.nextNode=third;
		third.nextNode=null;
		
		//Reverse Reference
		third.previousNode=second;
		second.previousNode=first;
		first.previousNode=head;
		head.previousNode=null;
		
		displayFromTail1();
		displayFromTail2(third);
		display();
		insertAtGivenPosition(2, 5);
		insertAtGivenPosition(100, 76);
		insertAtGivenPosition(0, 0);
		
	}

}
