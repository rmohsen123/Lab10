import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.Test;

public class testSelectionSort {

    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    public void testPositive(){
        SelectionSort sorter = new SelectionSort();
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] expected = new int[5];
        expected[0] = 2;
        expected[1] = 7; 
        expected[2] = 8;
        expected[3] = 9;
        expected[4] = 10;

        int[] sorted = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, sorted);
    }

    public void testNegative(){
        SelectionSort sorter = new SelectionSort();
        int[] arr = new int[]{-8, -9, -7, -10, -1};
        int[] expected = new int[]{-10, -9, -8, -7, -1};
        int[] sorted = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, sorted);
    }

    public void testMixed(){
        SelectionSort sorter = new SelectionSort();
        int[] arr = new int[]{8, -9, 1, 10, -2};
        int[] expected = new int[]{-9, -2, 1, 8, 10};
        int[] sorted = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, sorted);
    }

    public void testDuplicates(){
        SelectionSort sorter = new SelectionSort();
        int[] arr = new int[]{8, 8, -2, -2, 8};
        int[] expected = new int[]{-2, -2, 8, 8, 8};
        int[] sorted = sorter.basicSelectionSort(arr);
        assertArrayEquals(expected, sorted);
    }
}
