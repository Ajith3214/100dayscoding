package com.sample;

//Node class for Doubly Linked List
class Node2 {
 int data;
 Node2 prev;
 Node2 next;

 Node2(int data) {
     this.data = data;
     this.prev = null;
     this.next = null;
 }
}

//Doubly Linked List implementation
public class DoubleLinkedListImplement {
 private Node2 head;

 // Insert at end
 public void insert(int data) {
     Node2 newNode = new Node2(data);

     if (head == null) {
         head = newNode;
         return;
     }

     Node2 current = head;
     while (current.next != null) {
         current = current.next;
     }

     current.next = newNode;
     newNode.prev = current;
 }

 // Insert at beginning
 public void insertAtBeginning(int data) {
     Node2 newNode = new Node2(data);

     if (head == null) {
         head = newNode;
         return;
     }

     newNode.next = head;
     head.prev = newNode;
     head = newNode;
 }

 // Delete a node by value
 public void delete(int data) {
     if (head == null) return;

     Node2 current = head;

     // If head node is to be deleted
     if (current.data == data) {
         head = current.next;
         if (head != null) head.prev = null;
         return;
     }

     while (current != null && current.data != data) {
         current = current.next;
     }

     if (current == null) return; // Not found

     if (current.next != null) {
         current.next.prev = current.prev;
     }

     if (current.prev != null) {
         current.prev.next = current.next;
     }
 }

 // Display forward
 public void displayForward() {
     Node2 current = head;
     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.next;
     }
     System.out.println("null");
 }

 // Display backward
 public void displayBackward() {
     if (head == null) return;

     Node2 current = head;
     while (current.next != null) {
         current = current.next;
     }

     while (current != null) {
         System.out.print(current.data + " <-> ");
         current = current.prev;
     }
     System.out.println("null");
 }

 // Main method for testing
 public static void main(String[] args) {
     DoubleLinkedListImplement list = new DoubleLinkedListImplement();

     list.insert(10);
     list.insert(20);
     list.insert(30);

     System.out.println("Forward:");
     list.displayForward();

     System.out.println("Backward:");
     list.displayBackward();

     list.insertAtBeginning(5);
     System.out.println("After inserting 5 at beginning:");
     list.displayForward();

     list.delete(20);
     System.out.println("After deleting 20:");
     list.displayForward();
 }
}
