package Hw4_18000949.Ex4;

import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

import java.util.LinkedList;
//Palindrome Check Using Stack And Queue
public class Palindrome1 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        if(isPalindrome(inputString))
            System.out.println(inputString + " is a palindrome");
        else    
            System.out.println(inputString + " is not a palindrome");
    }
    public static boolean isPalindrome(String string) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();
        String str = new String();
        for (int i = 0; i < string.length(); i++) {
            str = "" + string.charAt(i);
            queue.add(str);
            stack.push(str);
        }
        while(!queue.isEmpty()) {
            if(!queue.remove().equals(stack.pop()))
                return false;
        }
        return true;
    }
}
