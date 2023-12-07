package de.telran.module_1.lesson_1.module_1.lesson_1.homework8.task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class SimpleArrayAndLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);

        int sum = 0;
        for (int value : arrayList) {
            sum += value;
        }
        System.out.println(sum);

//  ==========================================================================

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        double num = 0;
        for (int val : list) {
            num += val;
        }
        double average = num / list.size();
        System.out.println("Среднее значение элементов -->> " + average);
    }
}

//================================================================================



