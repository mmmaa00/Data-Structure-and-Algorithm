package Hw5_18000949;

//Ex 1.2

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {

    public static class Node<E> {
	    private E element;
	    private Node<E> parent;
	    private Node<E> left;
	    private Node<E> right;
    
	    public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
	        element = e;
	        parent = above;
	        setLeft(leftChild);
	        setRight(rightChild);
	    }

    	public Node() {
	    }

	    public Node<E> getRight() {
	        return right;
	    }

	    public void setRight(Node<E> right) {
	        this.right = right;
	    }

	    public Node<E> getLeft() {
	        return left;
	    }

	    public void setLeft(Node<E> left) {
	        this.left = left;
	    }

	    public E getElement() {
	        return element;
	    }
    }

    private Node<E> root;
    private int n;

    public Node<E> getRoot(){
	    return root;
    }

    public Node<E> addRoot(E element){
	    if(!isEmpty()) {
	        System.out.println("Root đã tồn tại");
	        return root;
        }
        else {
            root = new Node<>(element, null, null, null);
	        n++;
	        return root;
        }
    }

    // Add element to left child node of p if empty
    public Node<E> addLeft(Node<E> p, E element){
	    if(p == null)
	        return null;
	    if(p.getLeft() != null)
	        return p.getLeft();
        Node<E> node = new Node<>(element, p, null, null);
	    p.setLeft(node);	// add left to parent
	    n++;
        return node;
    }

    // Add element to right child node of p if empty
    public Node<E> addRight(Node<E> p, E element){
	    if(p == null)
	        return null;
	    if(p.getRight() != null)
	        return p.getRight();
        Node<E> node = new Node<>(element, p, null, null);
	    p.setRight(node);	// add right to parent
        n++;
        return node;
    }

    // Set element to node p
    public void set(Node<E> p, E element) {
	    if(p == null)
	        return;
	    p.element = element;
    }

    @Override
    public T root() {
	    return (T) root;
    }

    @Override
    public int size() {
	    return n;
    }

    @Override
    public boolean isEmpty() {
	    return root == null;
    }

    @Override
    public int numChildren(T p) {
	    if(p == null)
	        return 0;
        if(p instanceof Node) {
	        int count = 0;
	        Node node = (Node) p;

	        if(node.getLeft() != null)
		        count++;
	        if(node.getRight() != null)
		        count++;
            return count;
	    }
        return 0;
    }

    @Override
    public T parent(T p) {
	    if(p == null)
	        return null;
	    if(p instanceof Node) {
	        Node node = (Node) p;
	        return (T) node.parent;
	    }
	    return null;
    }

    @Override
    public T left(T p) {
	    if(p == null)
	        return null;

	    if(p instanceof Node) {
	        Node node = (Node) p;
            return (T) node.getLeft();
	    }
	    return null;
    }

    @Override
    public T right(T p) {
	    if(p == null)
	        return null;
	    if(p instanceof Node) {
	        Node node = (Node) p;
	        return (T) node.getRight();
	    }
	    return null;
    }

    @Override
    public T sibling(T p) {
	    if(p == null)
	        return null;
	    if(p instanceof Node) {
	        Node node = (Node) p;
	        if(node.parent.getLeft().equals(node))
		        return (T) node.parent.getRight();
	        else return (T) node.parent.getLeft();
	    }
        return null;
	}
	
	public static void main(String[] args) {
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

		System.out.println("Size: " + tree.size());
		System.out.println("isEmpty: " + tree.isEmpty());
	}
}
