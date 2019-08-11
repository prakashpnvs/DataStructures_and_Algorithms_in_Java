package Algorithms.Sorting;

public class InsertionSort {

    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            int index = i;

            while(index > 0 && arr[index-1] > temp) {
                arr[index] = arr[index-1];
                index--;
            }

            arr[index] = temp;
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 8, 1, 2, 4, 6, 5, 7, 9, 0, 10, -20, -50, -30, -40};
        InsertionSort.sort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.println("arr[" + i + "] = " + nums[i]);
        }
    }

}
