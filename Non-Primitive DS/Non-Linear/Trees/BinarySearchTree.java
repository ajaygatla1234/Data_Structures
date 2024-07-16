class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
	
}

public class BinarySearchTree {

	static Node root;
	
	public static void insert(int data) {
		
		root=insertRecursion(root, data);
		 	
	}
	
	public static Node insertRecursion(Node root, int data) {
		if(root==null) {
			root=new Node(data);
		}
		else if(data<root.data) {
			root.left=insertRecursion(root.left, data);
		}
		else if(data>root.data){
			root.right=insertRecursion(root.right, data);
		}
		
		return root;
	}
	
	public static void inOrder() {
		
		inOrderRecursion(root);
	}
	
	public static void inOrderRecursion(Node root) {
		if(root!=null) {
			inOrderRecursion(root.left);
			System.out.println(root.data+" ");
			inOrderRecursion(root.right);

		}
	}

	
	public static void main(String[] args) {
		insert(8);
		insert(7);
		insert(12);
		insert(15);
		insert(2);
		insert(5);
		inOrder();
	}

}
