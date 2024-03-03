package com.List.DoubleLinkedList;

public class DoubleLinkedList {
    private class newNode {
        int data;
        newNode prev;
        newNode next;
        newNode(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }
    private newNode head = null;
    private newNode tail = null;

    void insertFirst(int data) {
        newNode node = new newNode(data);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    void display() {
        if(head == null)
            return;

        newNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
        current = tail;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertFirst(53);
        dll.insertFirst(62);
        dll.insertFirst(20);
        dll.insertFirst(37);
        dll.insertFirst(19);

        dll.display();
    }
}
