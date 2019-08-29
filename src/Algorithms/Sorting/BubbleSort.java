package Algorithms.Sorting;

public class BubbleSort {

    public static void sort(int[] arr) {

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    swap(arr, i);
                    sorted = false;
                }
            }
        }


    }

    private static void swap(int[] arr, int i) {
        int min = arr[i + 1];
        arr[i + 1] = arr[i];
        arr[i]     = min;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 8, 1, 2, 4, 6, 5, 7, 9, 0, 10, 12, 11};
        BubbleSort.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("arr[" + i + "] = " + nums[i]);
        }
    }

}
