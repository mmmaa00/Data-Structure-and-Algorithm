package Hw5_18000949;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Ex 2.2 
public class ExpressionTreePrinter<E> extends LinkedBinaryTree {

    // Check token is operand use regex
    static boolean isOperand(String token) {
        Pattern regexFind = Pattern.compile("\\d+");
        Matcher matcher = regexFind.matcher(token);
        return matcher.matches();
    }
        
    static boolean operatorPriority(String currentOperator, String lastOperator) {
        if(lastOperator == null)
            return true;
        if(currentOperator.equals("*") || currentOperator.equals("/"))
            return true;
        else {
            if(lastOperator.equals("*") || currentOperator.equals("/"))
                return false;
            return true;
        }
    }
    static boolean isParenthesis(String e) {
        return e.equals("(") || e.equals(")");
    }

    //check operator
    public boolean isOperator(String c) {
        if(c == "+" || c == "-" || c == "*" || c == "/" || c == "^") {
            return true;
        }
        return false;
    }

    //inorder traversal
    public void inorder(Node<String> t) {
        if(t != null) {
            inorder(t.getLeft());
            System.out.print(t.getElement() + " ");
            inorder(t.getRight());
        }
    } 

    //postorder traversal
    public void postorder(Node<String> t) {
        if(t != null) {
            inorder(t.getLeft());
            inorder(t.getRight());
            System.out.print(t.getElement() + " ");
        }
    } 

    //preorder traversal
    public void preorder(Node<String> t) {
        if(t != null) {
            System.out.print(t.getElement() + " ");
            inorder(t.getLeft());
            inorder(t.getRight());
        }
    } 
    //Postfix expression
    public Node<String> postfixConstructTree(String[] postfix) {
        Stack<Node<String>> stack = new Stack<>();
        Node<String> t, t1, t2;
        for (int i = 0; i < postfix.length; i++) {
            //operand -> push into stack
            if (!isOperator(postfix[i])) {
                t = new Node(postfix[i],null, null, null);
                stack.push(t);
            } 
            //operator
            else{ 
                t = new Node(postfix[i], null, null, null);
                t1 = stack.pop();     
                t2 = stack.pop();
 
                // make them children
                t.setRight(t1);
                t.setLeft(t2);

                stack.push(t);
            }
        }
        t = stack.peek();
        stack.pop();
        return t;
    }

    //Convert infix to postfix array
    public String[] infixToPostfix(String[] tokens) {
        List<String> postfix = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        for(String token: tokens)
	        if(isOperand(token))
		        postfix.add(token);
	        else if(token.equals("("))
		        stack.push(token);
	        else if(token.equals(")")) {
		        while(!stack.peek().equals("("))
		            postfix.add(stack.pop());
		        stack.pop();
	        } else {	// isOperator
		        if(!stack.isEmpty() && isOperator(stack.peek()))
		            if(operatorPriority(stack.peek(), token)) {
			            String operator = stack.pop();
			        postfix.add(operator);
		            }
		        stack.push(token);
	        }

	    while(!stack.isEmpty())
	        postfix.add(stack.pop());
	    return postfix.toArray(new String[0]);
    }

    //Convert prefix to postfix array
    public String[] prefixToPostfix(String[] tokens) {
        Stack<String> stack = new Stack<>();
    
        // Read from right to left
        for(int i = tokens.length - 1; i >= 0; i--)
            if(isOperator(tokens[i])) {
                String e1 = stack.pop();
                String e2 = stack.pop();
                String temp = e1 + " " + e2 + " " + tokens[i];
                stack.push(temp);
            } else
                stack.push(tokens[i]);
        return stack.peek().split(" ");
    }


    public static void main(String[] args) {
        ExpressionTreePrinter et = new ExpressionTreePrinter();
        String[] infixTokens = {"(", "6", "/", "2", "+", "3", ")", "*", "(", "7", "-", "4", ")"};
	    String[] postfixTokens = {"6", "2", "/", "3", "+", "7", "4", "-", "*"};
	    String[] prefixTokens = {"*", "+", "/", "6", "2", "3", "-", "7", "4"};
        
        // Convert infix to postfix array
	    String[] newPostfix = et.infixToPostfix(infixTokens);
	    LinkedBinaryTree<String, Node<String>> tree = new LinkedBinaryTree<>();
        Node<String> root = et.postfixConstructTree(newPostfix);
        System.out.println("Infix:");
        et.inorder(root);
        System.out.println();
        System.out.println("********************************");
    }
}