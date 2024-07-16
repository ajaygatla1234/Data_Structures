
class Node {

	int data; // Data stored in the node

	Node nextNode; // Reference to the next node in the linked list

	// Constructor to create a node with given data and initially set the next node as null
	public Node(int data) {
		this.data = data;
		this.nextNode = null;  // Optional as it's set to null by default
	}
}

//we are performing deletion directly on head
//in deleteAtGivenPosition method, we are deleting the particular position, irrespective of key value
public class Singly_DeleteNodesAt_Front_End_GivenPosition_2 {

    private static Node head = null;

    public static void deleteHead() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.nextNode;
        display();
    }

    public static void deleteTail() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (head.nextNode == null) {
            head = null;
            System.out.println("List became empty because it has only one Node & that got deleted Now");
            display();
            return;
        }

        Node currentNode = head;
        while (currentNode.nextNode.nextNode != null) {
            currentNode = currentNode.nextNode;
        }
        currentNode.nextNode = null;
        display();
    }

    public static void deleteAtGivenPosition(int position) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        if (position < 1 || position > nodeCounter()) {
            System.out.println("Invalid position specified");
            System.out.println("List has " + nodeCounter() + " Nodes");
            return;
        }

        if (position == 1) {
            head = head.nextNode;
            display();
            return;
        }

        Node previousNode = head;
        for (int i = 1; i < position - 1; i++) {
            previousNode = previousNode.nextNode;
        }

        previousNode.nextNode = previousNode.nextNode.nextNode;
        display();
    }

    public static void display() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }
        System.out.println();
    }

    public static int nodeCounter() {
        Node currentNode = head;
        int counter = 0;
        while (currentNode != null) {
            currentNode = currentNode.nextNode;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        head = new Node(10);
        Node first = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);

        head.nextNode = first;
        first.nextNode = second;
        second.nextNode = third;
        third.nextNode = null;

        display();

        deleteHead();
        deleteTail();
        deleteAtGivenPosition(3);
        deleteAtGivenPosition(3);
    }

}