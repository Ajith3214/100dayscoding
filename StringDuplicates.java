package com.sample;

public class StringDuplicates {
	  public static void printDuplicateLetters(String str) {
	        if (str == null || str.isEmpty()) return;

	        int[] freq = new int[256]; // ASCII size, can use 26 if only lowercase a-z

	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                ch = Character.toLowerCase(ch);
	                freq[ch]++;
	            }
	        }

	        for (int i = 0; i < freq.length; i++) {
	            if (freq[i] > 1) {
	                System.out.println((char) i + " : " + freq[i]);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        printDuplicateLetters("Programming in Java");
	    }

}
