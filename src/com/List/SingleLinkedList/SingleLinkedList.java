package com.List.SingleLinkedList;

public class SingleLinkedList {
    private static class ListNode {
        private final int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    ListNode head = null;

    int listLength() {
        if(head == null)
            return 0;
        ListNode current = head;
        int count = 0;
        while(current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null)
            current = current.next;
        current.next = newNode;
    }

    void insert(int position, int data) {
        if(position <= 0 || position > listLength()+1) {
            display();
            System.out.println(position + " is invalid position, can't insertion of " + data);
            return;
        }
        ListNode newNode = new ListNode(data);
        if(position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position-1) {
                previous = previous.next;
                count++;
            }
            newNode.next = previous.next;
            previous.next = newNode;
        }
    }

    ListNode deleteFirst() {
        if(head == null)
            return null;
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    ListNode deleteLast() {
        if(head == null || head.next == null)
            return head;
        ListNode previous = head;
        ListNode current = head.next;
        while(current.next != null) {
            previous = previous.next;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    ListNode delete(int position) {
        if(position <= 0 || position > listLength())
            return null;

        if(position == 1) {
            ListNode temp = head;
            head = head.next;
            return temp;
        } else {
            ListNode previous = head;
            int count = 1;
            while(count < position-1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            return current;
        }
    }

    boolean search(int key) {
        ListNode current = head;
        while(current != null) {
            if(current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        sll.insertFirst(10);
        sll.insertFirst(28);
        sll.insert(2, 35);
        sll.insertLast(40);
        sll.insert(4, 84);
        sll.insertLast(72);
        sll.insert(5, 61);
        sll.display();

        ListNode deleted;
        deleted = sll.delete(6);
        System.out.println(deleted == null ? "can't perform deletion" : "Deleted: " + deleted.data);
        deleted = sll.delete(3);
        System.out.println(deleted == null ? "can't perform deletion" : "Deleted: " + deleted.data);
        deleted = sll.deleteFirst();
        System.out.println(deleted == null ? "can't perform deletion" : "Deleted: " + deleted.data);
        deleted = sll.deleteLast();
        System.out.println(deleted == null ? "can't perform deletion" : "Deleted: " + deleted.data);
        sll.display();

        int key;
        key = 70;
        System.out.println(key + (sll.search(70) ? " found" : " not found"));
        key = 35;
        System.out.println(key + (sll.search(35) ? " found" : " not found"));
    }
}
