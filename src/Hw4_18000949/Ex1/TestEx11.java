package Hw4_18000949.Ex1;

import java.util.Iterator;

public class TestEx11 {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(5);
        stack.push(11);
        stack.push(7);
        stack.push(0);
        stack.push(2000);
        System.out.print("Input: ");
        Iterator<Integer> output = stack.iterator();
        while(output.hasNext())
            System.out.print(output.next() + " ");
        System.out.println();
        System.out.print("Size: ");
        System.out.println(stack.size());
        System.out.print("Top: ");
        System.out.println(stack.top());
        System.out.print("IsEmpty: ");
        System.out.println(stack.isEmpty());
        System.out.print("Pop: ");
        System.out.println(stack.pop());
        System.out.print("After pop: ");
        Iterator<Integer> output2 = stack.iterator();
        while(output2.hasNext())
            System.out.print(output2.next() + " ");
        System.out.println();
    }
    
}
