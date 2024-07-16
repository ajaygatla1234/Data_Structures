

class Node {
	
	int data;
	Node previousNode;
	Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
}


public class SinglyCircular_Insertion {
	
	private static Node head;
	
	//This method used to count the number of nodes
	public static int nodeCounter() {
		Node cNode=head;
		int counter=0;
		while(cNode!=null) {
			cNode=cNode.nextNode;
			counter++;
		}
		return counter;
	}
	
	public static void display() {
		Node cNode=head;

		while(cNode!=null) {
			System.out.println(cNode.data);
			cNode=cNode.nextNode;
		}
		System.out.println();
	}
	
	public static void displayFromTail1() {
		Node temp = head;
	    // Move temp to the last node
	    while (temp.nextNode != null) {  //if we use temp!=null, at the end of the loop temp=null surpassing the last node, so we cannot traverse if it is null
	        temp = temp.nextNode;
	    }
	    // Now temp points to the last node
	    while (temp != null) {
	        System.out.println(temp.data);
	        temp = temp.previousNode;
	    }
	    System.out.println();
	}
	
	public static void displayFromTail2(Node third) {
		Node temp = third;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.previousNode;
		}
		System.out.println();
	}
	
	public static void insertAtGivenPosition(int position, int data) {
		Node newNode = new Node(data);
		
		//for adding the node at head
		if(position==1) {
			newNode.nextNode=head;
			head=newNode;
			display();
			return;
		}
		
		else {
			Node previous=head;
			int count=1;
			while(count<position-1&&previous.nextNode!=null) {
				previous=previous.nextNode;
				count++;
			}
			if (count != position - 1) {
				System.err.println("Invalid position specified");
				System.out.println("List has only "+nodeCounter()+" Nodes");
				int i=nodeCounter()+1;
				System.out.println("You can Add upto "+i+" Nodes, Including "+i+" as Last node");
				return;
			}
			
			Node currentNode = previous.nextNode;
			previous.nextNode=newNode;
			newNode.nextNode=currentNode;
			display();
		}
		
	}

	
	public static void main(String[] args) {
		head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);
		
		//forward reference
		head.nextNode=first;
		first.nextNode=second;
		second.nextNode=third;
		third.nextNode=null;
		
		//Reverse Reference
		third.previousNode=second;
		second.previousNode=first;
		first.previousNode=head;
		head.previousNode=null;
		
		displayFromTail1();
		displayFromTail2(third);
		display();
		insertAtGivenPosition(2, 5);
		insertAtGivenPosition(100, 76);
		insertAtGivenPosition(0, 0);
		
	}

}
