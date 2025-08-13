package com.sample;

import java.util.LinkedList;

public class InsertNodeatnSLL {
	class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Insert at n-th position (1-indexed)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // Case 1: Insert at head
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node before the desired position
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null || current.next == null) {
                break; // stop early if end reached
            }
            current = current.next;
        }

        // Insert the node
        newNode.next = current.next;
        current.next = newNode;
    }

    // Print linked list
//    public void printList() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
  
    public static void main(String[] args) {
        InsertNodeatnSLL list1 = new InsertNodeatnSLL();

        list1.insertAtPosition(10, 1); 
        list1.insertAtPosition(20, 2); 
        list1.insertAtPosition(15, 2); 
        list1.insertAtPosition(5, 1);  

        list1.printList();
    }
	
}

