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

public class Singly_Reverse_The_Nodes {

	// Reversing the Nodes using Iterative method
	public static Node reverseUsingIteration(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.nextNode;
			current.nextNode = prev;
			prev = current;
			current = next;
		}
		head = prev;

		return head;
	}

	// Reversing the Nodes using Recursive method
	public static void reverseUsingRecursion1(Node head) {
		if (head.nextNode == null) {
			System.out.print(head.data + " ");
			return;
		}

		reverseUsingRecursion1(head.nextNode);
		System.out.print(head.data + " ");
	}

	public static Node reverseUsingRecursion2(Node head) {
		if (head == null || head.nextNode == null) {
			return head;
		}

		Node newHead = reverseUsingRecursion2(head.nextNode);

		head.nextNode.nextNode = head;
		head.nextNode = null;

		return newHead;
	}

	// Displays the Nodes
	public static void display(Node newHead) {
		Node currentNode = newHead;
		while (currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfNodes;

		Node head = null;

		System.out.println("Enter number of Nodes");
		numberOfNodes = scanner.nextInt();

		System.out.println("Enter Individual Node's Data");

		int key[] = new int[numberOfNodes];

		for (int i = 0; i < numberOfNodes; i++) {
			key[i] = scanner.nextInt();
		}

		for (int i = numberOfNodes - 1; i >= 0; i--) {
			head = new Node(key[i], head);
		}

		System.out.println();
		System.out.println("Given Nodes : ");
		display(head);

		System.out.println("\n\nOutput 1 : Reverse of Given Nodes using Iterative method : ");
		Node newHead = reverseUsingIteration(head);
		display(newHead);

		System.out.println("\n\nOutput 2 : Reverse of output 1 Nodes using Recursive method : ");
		reverseUsingRecursion1(newHead);

		// This reverseUsingRecursion2() is taking output 1 as input and displaying it correctly ,
		System.out.println("\n\nOutput 3 : Reverse of output 1 Nodes using Recursive method : ");
		System.out.println(
				"**This reverse method is taking output 1 as input and displaying it correctly by reversing Nodes**");
		Node newHead2 = reverseUsingRecursion2(newHead);
		display(newHead2);

		scanner.close();
	}
}
