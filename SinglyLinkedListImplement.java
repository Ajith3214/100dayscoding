package com.sample;

class Node{
 int data;
 Node next;

 Node(int data) {
     this.data = data;
     this.next = null;
 }
}

public class SinglyLinkedListImplement {
 private Node head;


 public void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
         return;
     }
     Node current = head;
     while (current.next != null) {
         current = current.next;
     }
     current.next = newNode;
 }

 public void insertAtBeginning(int data) {
     Node newNode = new Node(data);
     newNode.next = head;
     head = newNode;
 }
 public void delete(int data) {
     if (head == null) return;

     if (head.data == data) {
         head = head.next;
         return;
     }
     Node current = head;
     while (current.next != null && current.next.data != data) {
         current = current.next;
     }

     if (current.next != null) {
         current.next = current.next.next;
     }
 }
 
 public void display() {
     Node current = head;
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("null");
 }

 public static void main(String[] args) {
     SinglyLinkedListImplement list = new SinglyLinkedListImplement();

     list.insert(10);
     list.insert(20);
     list.insert(30);

     System.out.println("Initial List:");
     list.display();
     
     list.insertAtBeginning(5);
     System.out.println("After inserting 5 at beginning:");
     list.display();

     list.delete(20);
     System.out.println("After deleting 20:");
     list.display();
 }
}
