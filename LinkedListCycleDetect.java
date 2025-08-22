package com.sample;

 class ListNode {
	  int val;
	    ListNode next;

	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}

	 public class LinkedListCycleDetect {
	    public static boolean hasCycle(ListNode head) {
	        if (head == null || head.next == null) {
	            return false;
	        }

	        ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;           // move by 1
	            fast = fast.next.next;      // move by 2

	            if (slow == fast) {         // cycle detected
	                return true;
	            }
	        }

	        return false; // no cycle
	    }

	    public static void main(String[] args) {
	        // Example usage:
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(4);
	        head.next.next.next.next = head.next; // creates a cycle

	        System.out.println("Has cycle? " + hasCycle(head)); // Output: true
	    }
	

}

