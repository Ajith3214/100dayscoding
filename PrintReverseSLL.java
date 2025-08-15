package com.sample;
	class Node{
	 int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class PrintReverseSLL {

	    public static void printReverse(Node head) {
	        if (head == null) {
	            return; // base case
	        }
	        printReverse(head.next); // recurse to end
	        System.out.print(head.data + " "); // print on unwind
	    }

	    public static void main(String[] args) {
	        // Create linked list: 1 -> 2 -> 3 -> 4
	        Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);

	        System.out.println("List in reverse:");
	        printReverse(head);
	    }   

}
