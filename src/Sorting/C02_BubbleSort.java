package Sorting;

/**
 * @author: Haoran Dai
 * @email: haorand16@gmail.com
 * @date: 2/20/24 17:40
 * @description: some desc
 *
 */
public class C02_BubbleSort {
    public static void main(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
