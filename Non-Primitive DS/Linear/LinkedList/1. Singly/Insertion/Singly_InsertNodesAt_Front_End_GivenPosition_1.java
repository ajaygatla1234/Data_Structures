
class Node {

	int data; // Data stored in the node

	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

//In this code only insertAtFront method have return type
public class Singly_InsertNodesAt_Front_End_GivenPosition_1 {

    // Inserting Node at Front
    public static Node insertAtFront(Node head, int data) {
        // creating new node and assign data value to add it as Front node
        Node newNode = new Node(data);

        // assigning this newNode's next as current head node
        newNode.nextNode = head;

        // re-assigning head to this newNode
        head = newNode;

        return head;
    }

    // Inserting Node at End
    public static void insertAtEnd(Node head, int data) {
        // check if the given node is null
        if (head == null) {
            System.out.println("The given head node cannot be null");
            return;
        }

        // create new node and assign data value to add it as End node
        Node newNode = new Node(data);

        // Assign head node to current Node
        Node currentNode = head;

        // Traverse the list until current node is null
        while (currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }

        currentNode.nextNode = newNode;
    }

    // Inserting Node at Given Position
    public static Node insertAtGivenPosition(Node head, int position, int value) {
        // create new node and assign data value to add it as Given node
        Node newNode = new Node(value);

        // check if the given node is null
        if (head == null) {
            System.out.println("The given head node cannot be null");
            return head;
        }

        // condition for adding the Node at front end (Already insertAtFront() method is present)
        // but using this condition with respect to, adding of Node at given position
        if (position == 1) {
            newNode.nextNode = head;
            head = newNode;
            return head;
        }

        // condition for other Position Nodes
        Node previous = head;
        int count = 1;

        while (count < position - 1 && previous.nextNode != null) {
            previous = previous.nextNode;
            count++;
        }

        Node currentNode = previous.nextNode;
        previous.nextNode = newNode;
        newNode.nextNode = currentNode;

        return head;
    }

    // Traverse the Nodes
    public static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.nextNode;
        }
        System.out.println();
    }

    // Driver Method
    public static void main(String[] args) {
        // Adding the Nodes
        Node head = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);

        // Adding references among nodes
        head.nextNode = secondNode;
        secondNode.nextNode = thirdNode;
        thirdNode.nextNode = null;

        System.out.print("Given Node : \n");
        display(head);

        System.out.println("Data added at Front Node");
        head = insertAtFront(head, -10);
        display(head);

        System.out.println("Data added at End Node");
        insertAtEnd(head, 40);
        display(head);

        System.out.println("Data added at Given Position Node");
        head = insertAtGivenPosition(head, 2, 0);
        display(head);
    }
}
