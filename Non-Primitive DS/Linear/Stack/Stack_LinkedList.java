class Node {

	public int data;
	public Node nextNode;
	
	public Node(int data){
		this.data=data;
	}
}


//Last In First Out(LIFO) or First In Last Out(FILO)
public class Stack_LinkedList {

	static Node head;
	
	public static void push(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			display();
			return;
			
		}
		newNode.nextNode=head;
		head=newNode;
		display();
	}
	
	public static void pop() {
		if(head==null) {
			System.out.println("Underflow");
			return;
		}
		head=head.nextNode;
		display();
	}
	
	public static void peek() {
		if(head==null) {
			System.err.println("Stack is Empty");
			return;
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
		push(10);
		push(20);
		push(30);
		pop();
		pop();
		pop();
		peek();
	}
	
}
