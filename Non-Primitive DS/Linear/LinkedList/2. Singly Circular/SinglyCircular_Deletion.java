class Node {
	int data; // Data stored in the node
	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null; // Optional as it's set to null by default
	}
}

public class SinglyCircular_Deletion {

	private static Node head;

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

	// Method to delete a node at a given position in the circular singly linked list
	public static void deleteAtPosition(int position) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		if (position == 1) {
			Node temp = head;
			while (temp.nextNode != head) {
				temp = temp.nextNode;
			}
			if (head == temp) { // Only one node in the list
				head = null;
			} else {
				temp.nextNode = head.nextNode;
				head = head.nextNode;
			}
			display();
		} else {
			Node temp = head;
			int count = 1;
			while (count < position - 1 && temp != null) {
				temp = temp.nextNode;
				count++;
			}
			if (temp == null || temp.nextNode == head) {
				System.out.println("Invalid position");
				return;
			}
			Node toDelete = temp.nextNode;
			temp.nextNode = toDelete.nextNode;
			display();
		}
	}

	public static void deleteByKey(int key) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		Node prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			if (temp.nextNode == head) { // Only one node in the list
				head = null;
			} else {
				while (temp.nextNode != head) {
					temp = temp.nextNode;
				}
				temp.nextNode = head.nextNode;
				head = head.nextNode;
			}
			display();
			return;
		}

		// Search for the key to be deleted, keep track of the previous node as well
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.nextNode;
			if (temp == head) { // Key not found in the list
				System.out.println("Key not found in the list");
				return;
			}
		}

		// If key is found, delete the node
		prev.nextNode = temp.nextNode;
		display();
	}


	// Method to delete all nodes with a given key
	public static void deleteAllByKey(int key) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		Node prev = null;
		boolean found = false;

		do {
			if (temp.data == key) {
				found = true;
				if (prev == null) { // Key found at the head
					Node lastNode = head;
					while (lastNode.nextNode != head) {
						lastNode = lastNode.nextNode;
					}
					if (head == lastNode) { // Only one node in the list
						head = null;
					} else {
						lastNode.nextNode = head.nextNode;
						head = head.nextNode;
					}
					temp = head;
				} else {
					prev.nextNode = temp.nextNode;
					temp = prev.nextNode;
				}
			} else {
				prev = temp;
				temp = temp.nextNode;
			}
		} while (temp != head);

		if (found) {
			System.out.println("All nodes with key " + key + " have been deleted");
			display();
		} else {
			System.out.println("Key not found in the list");
		}
	}



	public static void main(String[] args) {
		head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);
		Node fourth = new Node(30);

		//forward reference
		head.nextNode = first;
		first.nextNode = second;
		second.nextNode = third;
		third.nextNode = fourth;
		fourth.nextNode=head;

		display();
		deleteAtPosition(4);
		deleteByKey(20);
		deleteAllByKey(30);

	}

}
