
public class Stack_Array {

	int[] arr;
	int top;
	
	Stack_Array(int size) {
		arr=new int[size];
		top=-1;
	}
	
	public void push(int element) {
		if(top==arr.length-1) {
			System.out.println("Overflow");
			return;
		}
		top++;
		arr[top]=element;
		System.out.println(element+" Pushed");
	}
	
	int pop() {
		if(top==-1) {
			System.out.println("Underflow");
			return -1;
		}
		int temp=arr[top];
		top--;
		return temp;
	}
	
	void display() {
		System.out.println("Stack is");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Stack_Array stack = new Stack_Array(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println("Popped "+stack.pop());
		System.out.println("Popped "+stack.pop());
		System.out.println("Popped "+stack.pop());
		System.out.println("Popped "+stack.pop());
		System.out.println("Popped "+stack.pop());
		
		stack.push(60);
		
		stack.display();
	}
}