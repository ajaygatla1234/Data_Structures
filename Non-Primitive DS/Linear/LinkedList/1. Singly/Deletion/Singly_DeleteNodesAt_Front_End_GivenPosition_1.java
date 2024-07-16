
class Node {

	int data; // Data stored in the node

	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

//In this code we are passing the particular head node as an argument and performing on it
//in deleteAtGivenPosition method, we are deleting the particular key value, not by using position
public class Singly_DeleteNodesAt_Front_End_GivenPosition_1 {
    
    // Deleting the Node at Front (head Node)
    public static Node deleteAtFront(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }
        head = head.nextNode;
        return head;
    }

    // Deleting the Node at End
    public static Node deleteAtEnd(Node head) {
        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }
        if (head.nextNode == null) {
            head = null;
            return null;
        }
        Node current = head;
        while (current.nextNode.nextNode != null) {
            current = current.nextNode;
        }
        current.nextNode = null;
        return head;
    }

    // Deleting the Node at given Position
    public static Node deleteAtGivenPosition(Node head, int key) {
        if (head == null) {
            System.out.println("List is Empty");
            return null;
        }
        if (head.data == key) {
            return head.nextNode;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.nextNode;
        }
        if (temp == null) {
            System.out.println("Key not found in the list");
            return head;
        }
        prev.nextNode = temp.nextNode;
        return head;
    }

    // Traverse and display the Nodes
    public static void display(Node node) {
        if (node == null) {
            System.out.println("List is Empty");
            return;
        }
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.nextNode;
        }
        System.out.println();
    }

    // Driver Method
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

        System.out.println("\n\nDeletion at Front");
        head = deleteAtFront(head);
        display(head);

        System.out.println("\n\nDeletion at End");
        head = deleteAtEnd(head);
        display(head);

        System.out.println("\n\nDeletion of Node with data 30");
        head = deleteAtGivenPosition(head, 30);
        display(head);
        
        System.out.println("\n\nDeletion of Node with data 100 (non-existent)");
        head = deleteAtGivenPosition(head, 100);
        display(head);
    }
}