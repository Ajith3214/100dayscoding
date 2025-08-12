package com.sample;

public class ReverseWords {
	public static String reverseWords(String str) {
        if (str == null || str.trim().isEmpty()) return str;

        String[] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello world from Java")); 
        System.out.println(reverseWords("   multiple   spaces   here   ")); 
    }

}
