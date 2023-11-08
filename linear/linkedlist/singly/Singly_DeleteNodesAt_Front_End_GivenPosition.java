package com.ds.linear.linkedlist.singly;

public class Singly_DeleteNodesAt_Front_End_GivenPosition {
	
	static Node newHead = null;

	//Deleting the Node at Front (head Node)
	public static Node deleteAtFront(Node head) {

		head = head.nextNode;
		return head;
	}

	//Deleting the Node at End
	public static void deleteAtEnd(Node head) {

		//create a new node
		Node current = head;

		//if only head node is available, assign null to head
		if(head.nextNode == null) {
			head = null;
		}
		else {
			while(current.nextNode.nextNode!=null) {
				current = current.nextNode;
			}
			current.nextNode = null;
		}

	}

	//Deleting the Node at given Position
	public static void deleteAtGivenPosition(Node head, int key ) {

		//store head node
		Node temp = head;
		Node prev = null;
		
		while(temp!=null && temp.data!=key) {
			prev = temp;
			temp = temp.nextNode;
		}
		prev.nextNode = temp.nextNode;
	}

	//Traverse the Nodes
	public static void display(Node node) {

		while(node!=null) {

			System.out.print(node.data+" ");
			node=node.nextNode;
		}
	}

	//Driver Method
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

		System.out.println("\n\nDeletion at Front");
		newHead = deleteAtFront(head);
		display(newHead);

		System.out.println("\n\nDeletion at End");
		deleteAtEnd(newHead);
		display(newHead);

		System.out.println("\n\nDeletion at Given position");
		deleteAtGivenPosition(newHead, 30);
		display(newHead);
	}


}
