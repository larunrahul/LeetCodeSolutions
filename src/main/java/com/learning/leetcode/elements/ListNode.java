package com.learning.leetcode.elements;

public class ListNode {
	public int val;
    public ListNode next;
    
    public ListNode(int x){ 
    	val = x; 
    }
    
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	ListNode current = this;
    	while(current != null){
    		sb.append(current.val+"\t");
    		current = current.next;
    	}
    	return sb.toString();
    }
}
