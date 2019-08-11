package Algorithms.Sorting;

public class SelectionSort {

    public static void sort(int[] arr) {
        for(int i =0; i<arr.length; i++) {
            int index = i;
            int minValue = arr[i];
            for(int j = i; j<arr.length; j++) {
                if(arr[j] < minValue) {
                    minValue = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = minValue;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 8, 1, 2, 4, 6, 5, 7, 9, 0, 10};
        SelectionSort.sort(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.println("arr[" + i + "] = " + nums[i]);
        }
    }

}
