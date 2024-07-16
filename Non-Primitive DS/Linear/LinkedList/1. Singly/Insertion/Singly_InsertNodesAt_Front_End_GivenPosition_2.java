
class Node {

	int data; // Data stored in the node

	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

// In this code methods don't have return type
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

        // create new node and assign data value to add it as End node
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        // Assign head node to current Node
        Node currentNode = head;

        // Traverse the list until current node's next is null
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }

        currentNode.nextNode = newNode;
    }

    // Inserting Node at Given Position
    public static void insertAtGivenPosition(int position, int value) {

        // create new node and assign data value to add it as Given node
        Node newNode = new Node(value);

        if (position <= 0) {
            System.err.println("Invalid position specified");
            return;
        }

        // condition for adding the Node at front end (Already insertAtFront() method is present)
        // but using this condition with respect to, adding of Node at given position
        if (position == 1) {
            newNode.nextNode = head;
            head = newNode;
            return;
        }

        Node previous = head;
        int count = 1;

        while (count < position - 1 && previous.nextNode != null) {
            previous = previous.nextNode;
            count++;
        }

        if (count != position - 1) {
            System.err.println("Invalid position specified");
            return;
        }

        Node currentNode = previous.nextNode;
        previous.nextNode = newNode;
        newNode.nextNode = currentNode;
    }

    // Traverse the Nodes
    public static void display() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.nextNode;
        }
        System.out.println();
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

        System.out.print("Given Node : \n");
        display();

        System.out.println("\nData added at Front Node");
        insertAtFront(-10);
        display();

        System.out.println("\nData added at End Node");
        insertAtEnd(40);
        display();

        System.out.println("\nData added at Given Position Node");
        insertAtGivenPosition(2, 0);
        display();
    }
}
