package Hw5_18000949;

//Ex 2.1
public class ExpressionTree<E> extends LinkedBinaryTree {
    public void preorderPrint(Node<E> p) {
	//pre-order traversal of tree with root p
		if(p == null) 
			return;
		System.out.print(p.getElement() + " ");
		preorderPrint(p.getLeft());
		preorderPrint(p.getRight());
	}
	
    public void postorderPrint(Node<E> p) {
	//post-order traversal of tree with root p
		if(p == null) 
			return;
		postorderPrint(p.getLeft());
		postorderPrint(p.getRight());
		System.out.print(p.getElement() + " ");
	}
	
    public void inorderPrint(Node<E> p) {
	//in-order traversal of tree with root p
		if(p == null)
			return;
	    inorderPrint(p.getLeft());
		System.out.print(p.getElement() + " ");
    	inorderPrint(p.getRight());
	}
	
	public static void main(String[] args) {
		ExpressionTree<String> expression = new ExpressionTree<>();
		LinkedBinaryTree<String, Node<String>> tree = new LinkedBinaryTree<>();
	    tree.addRoot("A");
	    Node<String> root = tree.root();
	    // Add child of root
	    tree.addLeft(root, "B");
		tree.addRight(root, "C");

	    // Add child of root.left
	    Node<String> node = root.getLeft();
	    tree.addLeft(node, "D");
		tree.addRight(node, "E");
		
		Node<String> node1 = node.getLeft();
		tree.addLeft(node1, "H");
		tree.addRight(node1, "I");

		Node<String> node2 = node.getRight();
		tree.addLeft(node2, "K");

	    // Add child of root.right
	    node = root.getRight();
	    tree.addLeft(node, "F");
		tree.addRight(node, "G");
		
        System.out.println("\nPre-order traversal of tree with root p");
        expression.preorderPrint(tree.getRoot());
        System.out.println();
        System.out.println("********************************");

        System.out.println("\nPost-order traversal of tree with root p");
        expression.postorderPrint(tree.getRoot());
        System.out.println();
        System.out.println("********************************");

        System.out.println("\nIn-order traversal of tree with root p");
        expression.inorderPrint(tree.getRoot());
        System.out.println();
        System.out.println("********************************");

	}
}