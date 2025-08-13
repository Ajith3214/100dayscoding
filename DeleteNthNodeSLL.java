package com.sample;


	public class DeleteNthNodeSLL {
	  
	    static class Node {
	        int data;
	        Node next;
	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node head;

	  
	    public void deleteAtPosition(int position) {
	        if (head == null) return; // empty list

	     
	        if (position <= 1) {
	            head = head.next;
	            return;
	        }

	        Node current = head;
	        for (int i = 1; i < position - 1; i++) {
	            if (current == null || current.next == null) {
	                return; 
	            }
	            current = current.next;
	        }

	        
	        if (current.next != null) {
	            current.next = current.next.next;
	        }
	    }

	    
	    public void printList() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data);
	            if (temp.next != null) System.out.print(" -> ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        DeleteNthNodeSLL list = new DeleteNthNodeSLL();

	        
	        list.head = new Node(5);
	        list.head.next = new Node(10);
	        list.head.next.next = new Node(15);
	        list.head.next.next.next = new Node(20);
	        list.head.next.next.next.next = new Node(30);

	        list.printList(); 
	        list.deleteAtPosition(1); 
	        list.printList(); 

	        list.deleteAtPosition(3); 
	        list.printList(); 

	        list.deleteAtPosition(10); 
	        list.printList(); 
	    }
	}



