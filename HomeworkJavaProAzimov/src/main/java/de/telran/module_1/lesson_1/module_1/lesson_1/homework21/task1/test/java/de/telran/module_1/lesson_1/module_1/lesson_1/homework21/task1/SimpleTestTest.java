package de.telran.module_1.lesson_1.module_1.lesson_1.homework21.task1;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class SimpleTestTest {
    private static int[] arr1;
    private static int[] arr2;

    @BeforeAll
    static void setUpAll(){
        System.out.println("--BeforeAll--");
        arr1 = new int[]{1, 2, 5, 5, 8, 9, 7, 10};
        arr2 = new int[]{1, 0, 6, 15, 6, 4, 7, 0};
    }
    @Test
    void findCommonElementsTest() {

        int[] expVal = {1, 7};
        int[] actualVal = SimpleTest.findCommonElem(arr1, arr2);
        assertEquals(expVal.length, actualVal.length);
    }

    @Test
    void removeDuplicates() {

        int[] exp = {1, 2, 5, 8, 9, 7, 10};
        int[] actualVal = SimpleTest.removeDuplicates(arr1);
        assertArrayEquals(exp,actualVal);
    }


    @Test
    void findSecondLargest() {

        int exp = 9;
        int actualVal = SimpleTest.findSecondLargest(arr1);
        assertEquals(exp,actualVal);
    }

    @Test
    void findSecondSmallest() {

        int expVal = 2;
        int actualVal = SimpleTest.findSecondSmallest(arr1);
        assertEquals(expVal,actualVal);
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("--AfterAll--");
        SimpleTest.resetArray(arr1);
        SimpleTest.resetArray(arr2);
    }

}