package Hw5_18000949;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import Hw5_18000949.LinkedBinaryTree.Node;

public class Ex13 {

    private static final int COUNT = 10;

    public static void main(String[] args) throws IOException {
	    LinkedBinaryTree<Integer, Node<Integer>> tree = new LinkedBinaryTree<>();
	    tree.addRoot(1);
	    Node<Integer> root = tree.root();
	    // Add child of root
	    tree.addLeft(root, 5);
	    tree.addRight(root, 3);

	    // Add child of root.left
	    Node<Integer> node = root.getLeft();
	    tree.addLeft(node, 8);
	    tree.addRight(node, 6);

	    // Add child of root.right
	    node = root.getRight();
	    tree.addLeft(node, 2);
	    tree.addRight(node, 7);

	    // Print vertical tree
	    // Return vertical tree to write file
	    StringBuilder output = BinaryTreePrinter.printNode(root);
	    String content = output.toString();

	    System.out.println();
	    System.out.println();
	    System.out.println();
	    // Print horizontal tree
	    print2D(root);

	    try {
	        FileWriter fw = new FileWriter("./src/output.txt");
	        BufferedWriter buffer = new BufferedWriter(fw);
	        buffer.write(content);
	        buffer.close();
	    } catch(Exception e) {
	        System.out.println(e);
	    }
    }

    public static void print2D(Node<Integer> root){
	    print2DUtil(root, 0);
    }

    private static void print2DUtil(Node<Integer> node, int space){
	    if(node != null) {
	        // Increase distance between levels
	        space += COUNT;

	        // Process right child first
	        print2DUtil(node.getRight(), space);

	        // Print current node after space
	        // count
	        System.out.print("\n");

	        for (int i = COUNT; i < space; i++)
		        System.out.print(" ");
            System.out.print(node.getElement() + "\n");
	        print2DUtil(node.getLeft(), space);
	    }
    }
}
