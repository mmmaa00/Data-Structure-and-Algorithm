package Hw4_18000949.Ex1;

import java.util.Iterator;


public class TestEx12 {
    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack<>();
        stack.push("Anh");
        stack.push("Minh");
        stack.push("Là");
        stack.push("Mình");
        stack.push("Bạn");
        stack.push("Hello");
        System.out.print("Input: ");
        Iterator<String> output = stack.iterator();
        while(output.hasNext())
            System.out.print(output.next() + " ");
        System.out.println();
        System.out.print("Top: ");
        System.out.println(stack.top());            
        System.out.print("IsEmpty: ");
        System.out.println(stack.isEmpty());
        System.out.print("Pop: ");            
        System.out.println(stack.pop());
        System.out.print("After pop: ");
        Iterator<String> output2 = stack.iterator();
        while(output2.hasNext())
            System.out.print(output2.next() + " ");
        System.out.println();
        System.out.print("Top: ");
        System.out.println(stack.top()); 

    }
}
