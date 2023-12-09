package de.telran.javaProff.summary.simpleStackQueue;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(7);
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack);
        stack.add(3);
        System.out.println(stack);


    }
}
