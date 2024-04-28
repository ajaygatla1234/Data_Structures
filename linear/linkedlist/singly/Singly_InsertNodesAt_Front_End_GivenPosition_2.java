package com.gl.linkedlist;

//In this code methods don't have return type
public class Singly_InsertNodesAt_Front_End_GivenPosition_2 {

	// Initializing new head Node for Updating the singly list after adding new front node as head
		static Node head = null;

		// Inserting Node at Front
		public static void insertAtFront(int data) {

			// creating new node and assign data value to add it as Front node
			Node newNode = new Node(data);

			// assigning this newNode's next as current head node
			newNode.nextNode = head;

			// re-assigning head to this newNode
			head = newNode;


		}

		// Inserting Node at End
		public static void insertAtEnd(int data) {

			// check if the given node is null
			if (head == null) {
				System.out.println("The given head node cannot be null");
				return;
			}

			// create new node and assign data value to add it as End node
			Node newnode = new Node(data);
			newnode.data = data; // (optional)

			// Assign head node to current Node
			Node currentNode = head;

			// Traverse the list until current node is null
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}

			currentNode.nextNode = newnode;
		}

		// Inserting Node at Given Position
		public static void insertAtGivenPosition(int position, int value) {

			// create new node and assign data value to add it as Given node
			Node node = new Node(value);

			// check if the given node is null
			if (head == null) {
				System.out.println("The given head node cannot be null");
				return;
			}

			// condition for adding the Node at front end (Already insertAtFront() method is present)
			// but using this condition with respect to, adding of Node at given position
			if (position == 1) {
				node.nextNode = head;
				head = node;
			}
			// condition for other Position Nodes
			else {
				Node previous = head;
				int count = 1;

				while (count < position - 1) {
					previous = previous.nextNode;
					count++;
				}

				Node currentNode = previous.nextNode;
				previous.nextNode = node;
				node.nextNode = currentNode;
			}
		}

		// Traverse the Nodes
		public static void display() {

			Node current = head;
			while (current != null) {

				System.out.print(current.data + " ");
				current = current.nextNode;
			}
		}

		// Driver Method
		public static void main(String[] args) {

			// Adding the Nodes
			head = new Node(10);

			Node secondNode = new Node(20);

			Node thirdNode = new Node(30);

			// Adding references among nodes
			head.nextNode = secondNode;

			secondNode.nextNode = thirdNode;

			thirdNode.nextNode = null;

			System.out.print("Given Node : \n");
			display();

			System.out.println("\n\nData added at Front Node");
			insertAtFront(-10);
			display();

			System.out.println("\n\nData added at End Node");
			insertAtEnd(40);
			display();

			System.out.println("\n\nData added at Given Position Node");
			insertAtGivenPosition(2, 0);
			display();
		}

	}