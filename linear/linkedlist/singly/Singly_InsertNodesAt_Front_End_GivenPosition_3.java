package com.gl.linkedlist;

//In this code methods don't have return type
public class Singly_InsertNodesAt_Front_End_GivenPosition_3 {

	private static Node head=null;

	//This method used to count the number of nodes
		public static int nodeCounter() {
			Node cNode=head;
			int counter=0;
			while(cNode!=null) {
				cNode=cNode.nextNode;
				counter++;
			}
			return counter;
		}

	public static void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.nextNode=head;
		head=newNode;
		display();
	}

	public static void insertAtTail(int data) {
		Node newNode=new Node(data);
		Node currentNode=head;
		while(currentNode.nextNode!=null) {
			currentNode=currentNode.nextNode;
		}
		currentNode.nextNode=newNode;
		display();
	}

	public static void insertAtGivenPosition(int position, int data) {

		Node newNode = new Node(data);


		if(head==null) {
			if(position!=1) {
				System.out.println("Node is Emply, First add the head element or First element");
				return;
			}
			head=newNode;

		}

		else {   //condition for adding node at given position including tail node
			Node previousNode=head;
			int count=1;
			while(count<position-1 && previousNode.nextNode!=null) {  //if we want to add the node at 4th position, if we gave count<position, since 3 is less than 4, then previousNode is updated to 4th position, then Node will be added at 5th position, so position-1 is given
				//previousNode.nextNode!=null helps to add the tail node, and after giving this condition, if (count != position - 1) is not given then the node will be added as the tail node irrespective of position given
				previousNode=previousNode.nextNode;
				count++;
			}
			if (count != position - 1) {
				System.err.println("Invalid position specified");
				System.out.println("List has only "+nodeCounter()+" Nodes");
				int i=nodeCounter()+1;
				System.out.println("You can Add upto "+i+" Nodes, Including "+i+" as Last node");
				return;
			}

			Node currentNode1=previousNode.nextNode;
			previousNode.nextNode=newNode;
			newNode.nextNode=currentNode1;
		}
		display();
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

				display();
		

		insertAtHead(0);
		insertAtTail(50);
		insertAtGivenPosition(4, 25);
		insertAtGivenPosition(9, 40);
	}

}


