package com.sample;

public class SecondBiggest {
	  public static Integer findSecondLargest(int[] arr) {
	        if (arr == null || arr.length < 2) return null;

	        int max = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > max) {
	                second = max;
	                max = num;
	            } else if (num > second && num < max) {
	                second = num;
	            }
	        }

	        return (second == Integer.MIN_VALUE) ? null : second;
	    }

	    public static void main(String[] args) {
	        int[] data1 = {12, 35, 1, 10, 34, 1};
	        
	        System.out.println(findSecondLargest(data1)); 
	       
	    }
}
