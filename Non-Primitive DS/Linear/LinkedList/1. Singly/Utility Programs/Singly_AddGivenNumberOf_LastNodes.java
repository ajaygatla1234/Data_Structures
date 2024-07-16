
import java.util.Scanner;

class Node {
	
	int data; // Data stored in the node
	
	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

public class Singly_AddGivenNumberOf_LastNodes {
	
	public static Scanner scanner = new Scanner(System.in);
	public static int n;

	
	// Method to add the values of last n nodes in the linked list
	public static void addGivenNumberOfLastNodes(Node head, int n) {
	    // First find the Number of Nodes present
	    Node temp = head;
	    int count = 0;
	    while (temp != null) {
	        count++;
	        temp = temp.nextNode;
	    }

	    // Adjust n if it exceeds the number of nodes
	    if (n > count) {
	        System.out.println("Warning: Number of nodes to sum (n=" + n + ") exceeds the list size (" + count + ")");
	        n = count; // Sum all nodes
	        return;
	    }

	    // Logic for adding last n number of nodes
	    temp = head;
	    int count1 = 0;
	    int sum = 0;

	    while (temp != null) {
	        count1++;

	        if (count1 > (count - n)) {
	            sum = sum + temp.data;
	        }
	        temp = temp.nextNode;

	    }

	    System.out.println(sum);
	}

	
	// Method to display the elements of the linked list
	public static void display(Node headNode) {
		Node currentNode = headNode;
		while(currentNode != null) {
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
		
		System.out.println("\n\nEnter Last Number of nodes to add");
		n = scanner.nextInt();
		
		System.out.println("\nAdding last " + n + " Nodes gives :");
		
		addGivenNumberOfLastNodes(head, n);
	}

}
