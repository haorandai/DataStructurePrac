package Sorting;

/**
 * @author: Haoran Dai
 * @email: haorand16@gmail.com
 * @date: 2/20/24 17:20
 * @description: Selection Sort Algorithm Implementation
 * Time Complexity: O(n^2)
 */
public class C01_SelectionSort {
    public static void main(int[] arr) {
        if (arr == null || arr.length < 2) return;
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
