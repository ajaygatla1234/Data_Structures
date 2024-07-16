class Node {

	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
	
}

public class BinaryTree {

    static Node root;

    public static void insert(int data) {
        root = insertRecursion(root, data);
    }

    public static Node insertRecursion(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            if (root.left == null) {
                root.left = new Node(data);
            } else if (root.right == null) {
                root.right = new Node(data);
            } else {
                // If both left and right children are already occupied,
                // we recursively try to insert into the left child.
                root.left = insertRecursion(root.left, data);
            }
        }
        return root;
    }

    public static void inOrder() {
        inOrderRecursion(root);
    }

    public static void inOrderRecursion(Node root) {
        if (root != null) {
            inOrderRecursion(root.left);
            System.out.println(root.data + " ");
            inOrderRecursion(root.right);
        }
    }

    public static void main(String[] args) {
        insert(2);
        insert(5);
        insert(7);
        insert(8);
        insert(12);
        insert(15);
        inOrder();
    }

}
