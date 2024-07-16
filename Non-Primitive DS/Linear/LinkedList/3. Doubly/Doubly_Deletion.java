class Node {
	
	int data;
	Node previousNode;
	Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
}

public class Doubly_Deletion {

	private static Node head;
	
	public static void display() {
		Node cNode=head;

		while(cNode!=null) {
			System.out.println(cNode.data);
			cNode=cNode.nextNode;
		}
		System.out.println();
	}
	
	public static int nodeCounter() {
		Node cNode=head;
		int counter=0;
		while(cNode!=null) {
			cNode=cNode.nextNode;
			counter++;
		}
		return counter;
	}

	public static void deleteAtPosition(int position) {
		if(position<1) {
			System.out.println("Invalid position specified\n");
			return;
		}
	    if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (position == 1) {
	        head = head.nextNode;
	        if (head != null) {
	            head.previousNode = null;
	        }
	        display();
	        return;
	    }

	    Node current = head;
	    int count = 1;
	    while (count < position && current != null) {
	        current = current.nextNode;
	        count++;
	    }

	    if (current == null) {
	        System.out.println("Invalid position specified");
	        System.out.println("List has only " + nodeCounter() + " Nodes");
	        int i = nodeCounter() + 1;
	        System.out.println("You can delete nodes from position 1 to " + i);
	        return;
	    }

	    Node previous = current.previousNode;
	    Node nextNode = current.nextNode;

	    if (previous != null) {
	        previous.nextNode = nextNode;
	    }
	    if (nextNode != null) {
	        nextNode.previousNode = previous;
	    }

	    display();
	}
	
	// Method to delete a node with a given key in the doubly linked list
    public static void deleteByKey(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            if (current.data == key) {
            	Node previous = current.previousNode;
            	Node nextNode = current.nextNode;

                if (previous != null) {
                    previous.nextNode = nextNode;
                } else {
                    head = nextNode;
                }

                if (nextNode != null) {
                    nextNode.previousNode = previous;
                }

                System.out.println("Node with key " + key + " deleted");
                display();
                return;
            }
            current = current.nextNode;
        }

        System.out.println("Node with key " + key + " not found");
    }
    
    public static void deleteAllByKey(int key) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        Node prev = null;
        boolean found = false;

        while (current != null) {
            if (current.data == key) {
                found = true;
                if (prev == null) { // If the node to delete is the head
                    head = current.nextNode;
                    if (head != null) {
                        head.previousNode = null;
                    }
                    current = head; // Move to the next node after deletion
                } else {
                    prev.nextNode = current.nextNode;
                    if (current.nextNode != null) {
                        current.nextNode.previousNode = prev;
                    }
                    current = prev.nextNode; // Move to the next node after deletion
                }
            } else {
                prev = current;
                current = current.nextNode;
            }
        }

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
		Node fourth = new Node(20);
		
		//forward reference
		head.nextNode=first;
		first.nextNode=second;
		second.nextNode=third;
		third.nextNode=fourth;
		fourth.nextNode=null;
		
		//Reverse Reference
		third.previousNode=second;
		second.previousNode=first;
		first.previousNode=head;
		head.previousNode=null;
		
		display();
		deleteAtPosition(0);
//		deleteByKey(20);
		deleteAllByKey(20);
		
		
	}
}
