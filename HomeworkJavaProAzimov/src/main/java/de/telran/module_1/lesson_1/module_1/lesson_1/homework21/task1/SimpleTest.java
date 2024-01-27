package de.telran.module_1.lesson_1.module_1.lesson_1.homework21.task1;

import java.util.Arrays;

public class SimpleTest {


//    1.Напишите программу на Java для поиска общих элементов между двумя массивами целых чисел
    public static int[] findCommonElem(int[] arr1, int[] arr2) {
        int[] elem = new int[Math.min(arr1.length,arr2.length)];
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            int currElem = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (currElem == arr2[j]) {
                    elem[count++] = currElem;
                }
            }
        }
        return Arrays.copyOf(elem,count);
    }

//    2.Напишите программу на Java для удаления повторяющихся элементов из массива.
    public static int[] removeDuplicates(int[] arr){
        int n = arr.length;
        if (n <= 1) {
            return arr;
        }
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        int[] uniqueArr = Arrays.copyOf(arr,j + 1);
        return uniqueArr;
    }

//    3.Напишите программу на Java для поиска второго по величине элемента в массиве.

    public static int findSecondLargest(int[] arr){
        int n = arr.length;
        if (n < 2)return -1;

        int firstLargestEl = Integer.MIN_VALUE;
        int secondLargestEl = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargestEl){
                secondLargestEl = firstLargestEl;
                firstLargestEl = arr[i];
            } else if (arr[i] > secondLargestEl && arr[i] != firstLargestEl) {
                secondLargestEl = arr[i];
            }
        }
        return secondLargestEl;
    }

//    4. Напишите программу Java для поиска второго наименьшего элемента в массиве.

    public static int findSecondSmallest(int[] arr){
        int n = arr.length;
        if (n < 2) return -1;

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest =Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != firstSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
