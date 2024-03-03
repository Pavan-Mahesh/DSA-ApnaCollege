package com.List.SingleLinkedList;

public class MergeSortedLists {
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

    static ListNode mergeLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0); // assuming 0 is not a key
        ListNode tail = dummy;

//        with-out using dummy node we can achieve the same by doing the following
//        but throws an NullException when a or b is null

//        ListNode head = null;
//        if(a.data < b.data) {
//            head = a;
//            a = a.next;
//        } else {
//            head = b;
//            b = b.next;
//        }
//        ListNode tail = head;

        while(a != null && b != null) {
            if(a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if(a != null)
            tail.next = a;
        else
            tail.next = b;

        return dummy.next; // return null is both a and b are null
    }

    public static void main(String[] args) {
        MergeSortedLists sll1 = new MergeSortedLists();
        sll1.insertInSortedOrder(1);
        sll1.insertInSortedOrder(5);
        sll1.insertInSortedOrder(8);
        sll1.insertInSortedOrder(10);
        sll1.display();

        MergeSortedLists sll2 = new MergeSortedLists();
        sll2.insertInSortedOrder(3);
        sll2.insertInSortedOrder(6);
        sll2.insertInSortedOrder(9);
        sll2.display();

        MergeSortedLists mergedList = new MergeSortedLists();
        mergedList.head = mergeLists(sll1.head, sll2.head);
        mergedList.display();
    }
}
