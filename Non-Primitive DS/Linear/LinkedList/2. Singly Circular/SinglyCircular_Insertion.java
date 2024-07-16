
class Node {
	int data; // Data stored in the node
	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null; // Optional as it's set to null by default
	}
}

public class SinglyCircular_Insertion {

	private static Node head;

	// Method to get the size of the circular singly linked list
	public static int getSize() {
		int count = 0;
		Node temp = head;
		if (head != null) {
			count++;
			temp = temp.nextNode;
			while (temp != head) {
				count++;
				temp = temp.nextNode;
			}
		}
		return count;
	}

	// Method to display the circular singly linked list
	public static void display() {
		Node temp = head;
		System.out.println(head.data);
		temp = head.nextNode;
		while (temp != head) {
			System.out.println(temp.data);
			temp = temp.nextNode;
		}
		System.out.println();
	}
	
	public static void insertAtGivenPosition(int position, int data) {
	    Node newNode = new Node(data);

	    if (position == 1) {
	        Node temp = head;
	        newNode.nextNode = temp;
	        while (temp.nextNode != head) {
	            temp = temp.nextNode;
	        }
	        temp.nextNode = newNode;
	        head = newNode;
	        display();
	    } else if (position > 1) {
	        if (position > getSize() + 1) {
	            System.out.println("Invalid position");
	            return;
	        } else {
	            Node temp = head;
	            int count = 1;
	            while (count < position - 1 && temp != null) {
	                temp = temp.nextNode;
	                count++;
	            }

	            newNode.nextNode = temp.nextNode;
	            temp.nextNode = newNode;

	            // If inserting at the last position, update head to newNode
	            if (position == getSize() + 1) {
	                head = newNode;
	            }

	            display();
	        }
	    } else {
	        System.out.println("Invalid position");
	    }
	}


	public static void main(String[] args) {
		head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);

		//forward reference
		head.nextNode = first;
		first.nextNode = second;
		second.nextNode = third;
		third.nextNode = head;

		display();
		insertAtGivenPosition(1, 0);
		insertAtGivenPosition(2, 5);
		insertAtGivenPosition(7, 50); //adding last node
		insertAtGivenPosition(8, 60); //adding last node
		insertAtGivenPosition(20, 0); // Trying to insert at position 20, which is invalid
		insertAtGivenPosition(0, 0); // Trying to insert at position 0, which is invalid

	}
}
