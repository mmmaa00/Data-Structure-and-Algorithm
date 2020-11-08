package Hw5_18000949;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Hw5_18000949.LinkedBinaryTree.Node;

// Print vertical tree
public class BinaryTreePrinter {
    public static <E> StringBuilder printNode(Node<E> root) {
		int maxLevel = BinaryTreePrinter.maxLevel(root);
		StringBuilder output = new StringBuilder("");
		printNodeInternal(output, Collections.singletonList(root), 1, maxLevel);
		return output;
    }

    private static <E> void printNodeInternal(StringBuilder output, List<Node<E>> list, int level, int maxLevel) {
		if (list.isEmpty() || BinaryTreePrinter.isAllElementsNull(list))
	    	return;
		int floor = maxLevel - level;
		int endgeLines = (int) Math.pow(2, Math.max(floor - 1, 0));
		int firstSpaces = (int) Math.pow(2, floor) - 1;
		int betweenSpaces = (int) Math.pow(2, floor + 1) - 1;
		BinaryTreePrinter.printWhitespaces(output, firstSpaces);

		// Create new list<Node> to easier to print
		List<Node<E> > newNodes = new ArrayList<>();
		for (Node<E> node : list) {
	    	if (node != null) {
				output.append(node.getElement());
				System.out.print(node.getElement());
				newNodes.add(node.getLeft());
				newNodes.add(node.getRight());
			} 
			else {
				newNodes.add(null);
				newNodes.add(null);
				output.append(" ");
				System.out.print(" ");
	    	}
	    BinaryTreePrinter.printWhitespaces(output, betweenSpaces);
		}
		output.append(String.format("\n"));
		System.out.println("");

		for (int i = 1; i <= endgeLines; i++) {
	    	for (int j = 0; j < list.size(); j++) {
				BinaryTreePrinter.printWhitespaces(output, firstSpaces - i);
				if (list.get(j) == null) {
		    		BinaryTreePrinter.printWhitespaces(output, endgeLines + endgeLines + i + 1);
		    		continue;
				}
				if (list.get(j).getLeft() != null) {
		    		output.append("/");
		    		System.out.print("/");
				}
				else
		    		BinaryTreePrinter.printWhitespaces(output, 1);
				BinaryTreePrinter.printWhitespaces(output, i + i - 1);
				if (list.get(j).getRight() != null) {
		    		output.append("\\");
		    		System.out.print("\\");
				}
				else
		    		BinaryTreePrinter.printWhitespaces(output, 1);
				BinaryTreePrinter.printWhitespaces(output, endgeLines + endgeLines - i);
	    	}
	    output.append(String.format("\n"));
	    System.out.println("");
		}
		printNodeInternal(output, newNodes, level + 1, maxLevel);
	}
    private static void printWhitespaces(StringBuilder output, int count) {
		for (int i = 0; i < count; i++) {
	    	output.append(" ");
	    	System.out.print(" ");
		}
    }

    private static <E> int maxLevel(Node<E> root) {
		if (root == null)
	    	return 0;
		return Math.max(BinaryTreePrinter.maxLevel(root.getLeft()), BinaryTreePrinter.maxLevel(root.getRight())) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
		for (Object object : list)
	    	if (object != null)
				return false;
		return true;
    }
}
