package de.telran.javaProff.summary.simpleStackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mandarin");
        queue.add("Peach");
        queue.add("Cherry");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.size());

        queue.element();
        System.out.println(queue);

        queue.offer("Mango");
        System.out.println(queue);
    }
}
