package Hw4_18000949.Ex2;

import java.util.Iterator;
import java.util.Random;

public class TestEx22 {
    public static void output(Iterator<Integer> iterator) {
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
    public static void main(String[] args) {
        // Random
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        Random random = new Random();
        int n = random.nextInt(10);
        System.out.println("Size: " + n);
        for (int i = 0; i < n; i++) {
            queue.enqueue(random.nextInt());
        }
        Iterator<Integer> output = queue.iterator();
        output(output);
        System.out.print("Top: ");
        System.out.println(queue.dequeue());
        System.out.println("After enqueue: ");
        Iterator<Integer> test = queue.iterator();
        output(test);
        queue.enqueue(2020);
        System.out.print("Top: ");
        System.out.println(queue.dequeue());
    }
    
}
