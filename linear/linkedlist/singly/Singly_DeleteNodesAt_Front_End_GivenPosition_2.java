package com.gl.linkedlist;

public class Singly_DeleteNodesAt_Front_End_GivenPosition_2 {

	private static Node head=null;
	
	public static void deleteHead() {
		
		head=head.nextNode;
		display();
	}
	
	public static void deleteTail() {
		Node currentNode = head;
		
		while(currentNode.nextNode.nextNode!=null) {
			currentNode=currentNode.nextNode;
		}
		currentNode.nextNode=null;
		display();
	}
	
	public static void deleteAtGivenPosition(int position) {
		if(head==null) {    //if head is empty
			System.out.println("List is Empty");
			return;
		}
		else if(position==1) {   //if we want to delete head node
			if(head.nextNode==null) { //if head is the only node present
				head=null;
				System.out.println("List became empty because it has only one Node & that got deleted Now");
				return;
			}
			
			head=head.nextNode;
			display();
			return;
		}
		
		else {   //Deletes the node at any position even at last node
			Node previousNode=head;
			int count=1;
			while(count<position-1) {
				previousNode=previousNode.nextNode;
				count++;
			}
			previousNode.nextNode=previousNode.nextNode.nextNode;
			display();
		}
	}
	
	public static void display() {
		Node cNode=head;

		while(cNode!=null) {
			System.out.println(cNode.data);
			cNode=cNode.nextNode;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);

		head.nextNode=first;
		first.nextNode=second;
		second.nextNode=third;
		third.nextNode=null;
//		head.nextNode=null;  // if list has only one node
		
		display();
//		deleteHead();
//		deleteTail();
		deleteAtGivenPosition(3);
		deleteAtGivenPosition(3);

}
}
