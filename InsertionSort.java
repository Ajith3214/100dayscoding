package com.sample;

import java.util.Arrays;

public class InsertionSort {
	 public static void insertionSort(int[] arr) {
	        for (int i = 1; i < arr.length; i++) {
	            int key = arr[i];  // Element to insert
	            int j = i - 1;

	            // Move elements greater than key one position ahead
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j--;
	            }

	            // Place the key at its correct position
	            arr[j + 1] = key;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {9, 5, 1, 4, 3};

	        System.out.println("Original: " + Arrays.toString(arr));
	        insertionSort(arr);
	        System.out.println("Sorted:   " + Arrays.toString(arr));
	    }

}
