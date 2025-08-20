package com.sample;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleRemover {

   
    public static void removeCycle(ListNode head) {
        if (head == null) return;

        HashSet<ListNode> visited = new HashSet<>();
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
           
            if (visited.contains(curr)) {
                prev.next = null; 
                return;
            }

            visited.add(curr);
            prev = curr;
            curr = curr.next;
        }
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < 20) { 
            System.out.print(temp.val + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        removeCycle(head); 
        printList(head);   
    }
}
