package Hw4_18000949.Ex3;

import java.util.Scanner;
import java.util.Stack;
//Bài 1.3: Use Stack To Check
public class TestEx13 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        if(bracketMatching(inputString)) {
            System.out.println("String is a valid expression");
            // System.out.println("Values: " + calculator(inputString));

            //Hàm tính biểu thức mình có viết nhưng đang bị lỗi in ra sai kết quả.
        }
        else {
            System.out.println("String is not a valid expression");
        }
    }

    public static boolean bracketMatching(String string) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char s = string.charAt(i);
            if(s == '(' || s == '[' || s == '{') {
                stack.push(s);
                continue;
            }
            else if(s == ')' || s == ']' || s == '}') {
                if(stack.isEmpty())
                    return false;
                else {
                    char check = stack.pop();
                    if(check == s)
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // public static int calculator(String str) {
    //     char[] tokens = str.toCharArray();
    //     //Lưu số trong biểu thức
    //     Stack<Integer> numbers = new Stack<Integer>();

    //     //Lưu các phép tính trong biểu thức
    //     Stack<Character> operators = new Stack<Character>();
    //     for (int i = 0; i < tokens.length; i++) {
    //         if(tokens[i] == ' ')
    //             continue;
    //         else if(tokens[i] >= '0' && tokens[i] <= '9') {
    //             //Lấy hết tất cả các chữ số của số có 2 chữ số trở lên
    //             StringBuffer number = new StringBuffer();
    //             while(i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {
    //                 number.append(tokens[i++]);
    //             }
    //             numbers.push(Integer.parseInt(number.toString()));
    //         }
    //         else if(tokens[i] == '(')
    //             operators.push(tokens[i]);
    //         else if(tokens[i] == ')') {
    //             while(operators.peek() != '(')
    //                 numbers.push(ops(operators.pop(), numbers.pop(), numbers.pop()));
    //             operators.pop();
    //         }
    //         else if(tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
    //             while(!operators.isEmpty() && precedence(tokens[i],operators.peek()))
    //                 numbers.push(ops(operators.pop(), numbers.pop(), numbers.pop()));
    //             operators.push(tokens[i]);
    //         }
    //     }
    //     while(!operators.isEmpty())
    //         numbers.push(ops(operators.pop(), numbers.pop(), numbers.pop()));
    //     return numbers.pop();
    // }

    // public static boolean precedence(char a, char b) {
    //     if(a == '(' || b == ')')
    //         return false;
    //     else if((a == '*' || a == '/') && (b == '+' || b == '-'))
    //         return false;
    //     return true;
    // }

    // public static int ops(char op, int a, int b) {
    //     switch(op) {
    //         case '+':
    //             return a + b;
    //         case '-':
    //             return a - b;
    //         case '*':
    //             return a * b;
    //         case '/':
    //             if(b == 0)
    //                 throw new UnsupportedOperationException("Cannot divide by 0");
    //             return a/b;
    //     }
    //     return 0;
    // }
}
