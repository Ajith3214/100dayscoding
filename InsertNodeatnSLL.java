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

   
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

       
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

       
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null || current.next == null) {
                break; // stop early if end reached
            }
            current = current.next;
        }

      
        newNode.next = current.next;
        current.next = newNode;
    }


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

