class Node {
	
	int data; // Data stored in the node
	
	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

public class Singly_Nodes_Display {

	// Method to print alternate nodes by removing alternate nodes
	public static Node printAlternateNodes1(Node head) {
		if (head == null || head.nextNode == null) {
			return head;
		}

		Node currentNode = head;

		while (head != null && head.nextNode != null) {
			head.nextNode = head.nextNode.nextNode;
			head = head.nextNode;
		}

		return currentNode;
	}

	// Method to print alternate nodes without removing nodes
	public static void printAlternateNodes2(Node head) {
		int count = 0;
		while (head != null) {
			if (count % 2 == 0) { // when count is even print the nodes
				System.out.print(head.data + " ");
			}
			count++; // count the nodes
			head = head.nextNode; // move on to the next node.
		}
	}

	// Display the Nodes
	public static void display(Node headNode) {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
	}

	public static void main(String[] args) {

		// Adding the data to the nodes
		Node head = new Node(10);

		Node secondNode = new Node(20);

		Node thirdNode = new Node(30);

		Node fourthNode = new Node(40);

		Node fifthNode = new Node(50);

		// Adding References
		head.nextNode = secondNode;

		secondNode.nextNode = thirdNode;

		thirdNode.nextNode = fourthNode;

		fourthNode.nextNode = fifthNode;

		fifthNode.nextNode = null;

		System.out.println("Given Input :");
		display(head);

		System.out.println("\n\nOutput (removing alternate nodes) :");
		Node newHead = printAlternateNodes1(head);
		display(newHead);

		System.out.println("\n\nOutput (printing alternate nodes without removing) :");
		printAlternateNodes2(head);
	}
}
