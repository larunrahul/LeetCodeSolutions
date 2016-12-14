package com.learning.leetcode.solutions;

import com.learning.leetcode.elements.ListNode;

public class ListSum {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
       int carry = 0;
       ListNode result = new ListNode(0);
       ListNode current = result;
       while(l1 != null || l2 != null){
    	   int sum = 0;
           if(l1 != null){
               sum+= l1.val;
               l1 = l1.next;
           }
           if(l2 != null){
               sum+= l2.val;
               l2 = l2.next;
           }
           if(carry != 0){
        	   sum = sum+carry;
           }
           carry = sum/10;
           current.next = new ListNode(sum%10);
           current = current.next;
       }
       if(carry != 0){
    	   current.next = new ListNode(carry);
       }
       return result.next;
   }
	
   public static void main(String[] args) {
	   ListNode one = new ListNode(2);
	   one.next = new ListNode(4);
	   one.next.next = new ListNode(8);
	   ListNode two = new ListNode(5);
	   two.next = new ListNode(6);
	   two.next.next = new ListNode(4);
	   two.next.next.next = new ListNode(9);
	   System.out.println(one);
	   System.out.println(two);
	   System.out.println(new ListSum().addTwoNumbers(one, two));
	}

}
