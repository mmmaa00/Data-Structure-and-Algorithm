package Hw5_18000949;

//Ex 2.3

public class EvaluateTree extends LinkedBinaryTree {
    // Evaluate tree

    static boolean isOperator(String e) {
        return e.equals("+") || e.equals("-") || e.equals("*") || e.equals("/") || e.equals("^");
    }
    public static int Evaluate(Node<String> root){
        if(root == null)
            return 0;
        if(root.getLeft() == null && root.getRight() == null)
            return Integer.parseInt(root.getElement());
    
        int left_sum = Evaluate(root.getLeft());
        int right_sum = Evaluate(root.getRight());
    
        if(isOperator(root.getElement()))
            switch(root.getElement()) {
                case "+":
                    return left_sum + right_sum;
                case "-":
                    return left_sum - right_sum;
                case "*":
                    return left_sum * right_sum;
                case "/":
                    return left_sum / right_sum;
            }
        return 0;
    }
}
