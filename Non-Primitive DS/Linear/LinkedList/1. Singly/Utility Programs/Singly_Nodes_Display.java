import java.util.Scanner;

class Node {
	int data; // Data stored in the node
	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null; // Optional as it's set to null by default
	}

	// Constructor to create a node with given data and a specified next node
	public Node(int data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
}

//Inputting the Nodes and Display
public class Singly_Nodes_Display {

	// Display the Nodes
	public static void display(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
		System.out.println();
	}

	// Method to append nodes to the end of the linked list
	public static Node appendNodesToEnd(Node head, int[] data) {
		if (head == null) {
			head = new Node(data[0]);  // Create the first node if head is null
		} else {
			Node currentNode = head;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			// Append each new node from the data array
			for (int i = 0; i < data.length; i++) {
				currentNode.nextNode = new Node(data[i]);
				currentNode = currentNode.nextNode;
			}
		}
		return head;
	}



	// Method to prepend nodes to the beginning of the linked list
    public static Node prependNodesToStart(Node head, int[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            head = new Node(data[i], head);
        }
        return head;
    }


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Displaying the hard-coded nodes
		Node headNode = new Node(10);
		Node secondNode = new Node(20);
		Node thirdNode = new Node(30);
		Node fourthNode = new Node(40);

		// Adding References among the Nodes
		headNode.nextNode = secondNode;
		secondNode.nextNode = thirdNode;
		thirdNode.nextNode = fourthNode;
		fourthNode.nextNode = null;

		System.out.println("Displaying Hard-Coded input:");
		display(headNode);
		System.out.println();

		// Method 1: Append user input nodes to the end
		System.out.println("Enter number of nodes to append:");
		int numberOfNodes1 = scanner.nextInt();
		int[] data1 = new int[numberOfNodes1];
		System.out.println("Enter data for each node to append:");
		for (int i = 0; i < numberOfNodes1; i++) {
			data1[i] = scanner.nextInt();
		}
		headNode = appendNodesToEnd(headNode, data1);

		System.out.println("Displaying User Input Data appended at the end:");
		display(headNode);
		System.out.println();

		// Method 2: Prepend user input nodes to the start
		System.out.println("Enter number of nodes to prepend:");
		int numberOfNodes2 = scanner.nextInt();
		int[] data2 = new int[numberOfNodes2];
		System.out.println("Enter data for each node to prepend (in reverse order):");
		for (int i = 0; i < numberOfNodes2; i++) {
			data2[i] = scanner.nextInt();
		}
		headNode = prependNodesToStart(headNode, data2);

		System.out.println("Displaying User Input Data prepended at the start:");
		display(headNode);

		scanner.close();
	}
}
