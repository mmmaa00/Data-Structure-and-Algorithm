package Hw4_18000949.Ex4;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

//Bài 2.3: Palindrome Check Using Queue
public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Queue queue = new LinkedList();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverse = "";
        while(!queue.isEmpty())
            reverse = reverse + queue.remove();
        if(inputString.equals(reverse))
            System.out.println(inputString + " is a palindrome");
        else    
            System.out.println(inputString + " is not a palindrome");
    }
    
}
