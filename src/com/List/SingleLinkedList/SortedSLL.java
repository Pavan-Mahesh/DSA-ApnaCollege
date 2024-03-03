package com.List.SingleLinkedList;

public class SortedSLL {
    private static class ListNode {
        private final int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    ListNode head = null;

    void display() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void insertInSortedOrder(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        if(temp != null)
            temp.next = newNode;
        else
            head = newNode;
    }

    void removeDuplicates() {
        if(head == null)
            return;
        ListNode current = head;
        while(current.next != null) {
            if(current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }
    }

    public static void main(String[] args) {
        SortedSLL obj = new SortedSLL();
        obj.insertInSortedOrder(10);
        obj.insertInSortedOrder(27);
        obj.insertInSortedOrder(27);
        obj.insertInSortedOrder(1);
        obj.insertInSortedOrder(46);
        obj.insertInSortedOrder(38);
        obj.insertInSortedOrder(17);
        obj.insertInSortedOrder(46);
        obj.insertInSortedOrder(27);
        obj.insertInSortedOrder(5);
        obj.display();

        obj.removeDuplicates();
        obj.display();
    }
}
