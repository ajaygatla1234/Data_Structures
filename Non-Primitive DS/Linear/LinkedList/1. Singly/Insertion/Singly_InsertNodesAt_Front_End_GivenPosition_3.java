
class Node {

	int data; // Data stored in the node

	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

//In this code methods don't have return type & has nodeCounter()
public class Singly_InsertNodesAt_Front_End_GivenPosition_3 {

	private static Node head = null;

	//This method used to count the number of nodes
	public static int nodeCounter() {
		Node cNode = head;
		int counter = 0;
		while(cNode != null) {
			cNode = cNode.nextNode;
			counter++;
		}
		return counter;
	}

	public static void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.nextNode = head;
		head = newNode;
		display();
	}

	public static void insertAtTail(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode;
		}
		display();
	}

	public static void insertAtGivenPosition(int position, int data) {
		if (position <= 0) {
			System.err.println("Invalid position specified");
			return;
		}

		Node newNode = new Node(data);

		if (head == null) {
			if (position != 1) {
				System.out.println("List is empty, add the head element first");
				return;
			}
			head = newNode;
		} else {   //condition for adding node at given position including tail node

			if (position == 1) {
				newNode.nextNode = head;
				head = newNode;
				display();
				return;
			}

			Node previousNode = head;
			int count = 1;
			while(count < position - 1 && previousNode.nextNode != null) {
				previousNode = previousNode.nextNode;
				count++;
			}
			if (count != position - 1) {
				System.err.println("Invalid position specified");
				System.out.println("List has only " + nodeCounter() + " nodes");
				int i = nodeCounter() + 1;
				System.out.println("You can add up to " + i + " nodes, including " + i + " as the last node");
				return;
			}

			newNode.nextNode = previousNode.nextNode;
			previousNode.nextNode = newNode;
		}
		display();
	}

	public static void display() {
		Node cNode = head;
		while(cNode != null) {
			System.out.println(cNode.data);
			cNode = cNode.nextNode;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);

		head.nextNode = first;
		first.nextNode = second;
		second.nextNode = third;

		display();

		insertAtHead(0);
		insertAtTail(50);
		insertAtGivenPosition(4, 25);
		insertAtGivenPosition(9, 60);
		insertAtGivenPosition(0, 0);
	}
}
