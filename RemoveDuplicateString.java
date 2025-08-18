package com.sample;

public class RemoveDuplicateString {
	  public static String removeDuplicates(String str) {
	        boolean[] seen = new boolean[256]; 
	        StringBuilder sb = new StringBuilder();

	        for (char c : str.toCharArray()) {
	            if (!seen[c]) {
	                seen[c] = true;
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        String input = "programming";
	        System.out.println(removeDuplicates(input));  
	    }

}
