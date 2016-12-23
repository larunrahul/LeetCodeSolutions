package com.learning.leetcode.solutions;

/**
 * https://leetcode.com/problems/reverse-string/
 * @author rahul
 *
 */
public class ReverseString {
	
	String input;
	
	public ReverseString(String input){
		this.input = input;
	}
	public String reverseString() {
        char[] inputTokens = input.toCharArray();
        int start = 0;
        int end = inputTokens.length-1;
        while(start < end){
        	inputTokens[start] = (char)(inputTokens[start]^inputTokens[end]);
        	inputTokens[end] = (char)(inputTokens[end]^inputTokens[start]);
        	inputTokens[start] = (char)(inputTokens[end]^inputTokens[start]);
        	start += 1;
        	end -= 1;
        }
        return String.valueOf(inputTokens);
    }

	public static void main(String[] args) {
		System.out.println(new ReverseString("hello world").reverseString());
	}

}
