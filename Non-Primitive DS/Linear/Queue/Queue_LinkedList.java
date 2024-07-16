
class Node {

	int data;
	Node nextNode;
	
	Node(int data){
		this.data=data;
	}
}

//First In First Out(FIFO) or Last In Last Out(LILO)
public class Queue_LinkedList {

	private static Node head=null;
	private static Node tail=null;

	public static void enQueue(int data) {

		Node newNode = new Node(data);
		if(head==null) {
			head=tail=newNode;
			display();
			return;
		}
		tail.nextNode=newNode;
		tail=newNode;
		display();
	}
	
	public static void deQueue() {
		if(head==null) {
			System.out.println("Queue is Empty");
			return ;
		}
		
		if(head==tail) {
			head=tail=null;
			System.out.println("Now Queue became Empty\n");
			return;
		}
		head=head.nextNode;
		display();
	}
	
	public static void getFront() {
		if(head==null) {
			System.out.println("Queue is Empty");
			return ;
		}
		System.out.println(head.data);
	}

	public static void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.nextNode;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		enQueue(10);
		enQueue(20);
		deQueue();
		deQueue();
		enQueue(10);
		enQueue(20);
		getFront();
	}

}
