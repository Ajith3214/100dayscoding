package com.sample;

import java.util.Arrays;

public class SelectionSort {
	 public static void selectionSort(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            int minPos = i;

	            // Find the smallest element from i to end
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[j] < arr[minPos]) {
	                    minPos = j;
	                }
	            }

	            // Swap elements
	            int temp = arr[i];
	            arr[i] = arr[minPos];
	            arr[minPos] = temp;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {29, 10, 14, 37, 13};

	        System.out.println("Original: " + Arrays.toString(arr));
	        selectionSort(arr);
	        System.out.println("Sorted:   " + Arrays.toString(arr));
	    }

}
