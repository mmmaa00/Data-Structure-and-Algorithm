package Hw4_18000949.Ex2;

import java.util.Iterator;
import java.util.Random;

public class TestEx21 {
    public static void output(Iterator output) {
        while(output.hasNext())
            System.out.println(output.next());
    }
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.enqueue("Data");
        queue.enqueue("Structure");
        queue.enqueue("And");
        queue.enqueue("Algorithms");
        queue.enqueue("Lecture");
        queue.enqueue("4b");
        queue.enqueue("Stack");
        queue.enqueue("Queue");
        Iterator<String> output = queue.iterator();
        output(output);
        System.out.print("Top: ");
        System.out.println(queue.dequeue());
        queue.enqueue("2020");
        System.out.println("After enqueue: ");
        Iterator<String> test = queue.iterator();
        output(test);
        System.out.print("Top: ");
        System.out.println(queue.dequeue());

        // dùng Random tạo array
        // ArrayQueue<Integer> queue1 = new ArrayQueue<>();
        // Random random = new Random();
        // for (int i = 0; i < random.nextInt(10); i++) {
        //     queue1.enqueue(random.nextInt());
        // }
        // Iterator<Integer> output1 = queue1.iterator();
        // while(output1.hasNext())
        //     System.out.println(output1.next());
    }
    
}
