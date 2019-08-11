package Algorithms.Sorting;

public class BubbleSort {

    public static void sort(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j + 1] < arr[j]) {
                    int min = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = min;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 8, 1, 2, 4, 6, 5, 7, 9, 0, 10, 12, 11};
        BubbleSort.sort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.println("arr[" + i + "] = " + nums[i]);
        }
    }

}
