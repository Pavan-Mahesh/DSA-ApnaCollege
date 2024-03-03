package com.List.SingleLinkedList;

public class MoreOnSLL {
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

    void insert(int data) {
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

    ListNode reverseList() {
        if(head == null)
            return null;
        ListNode current = head;
        ListNode previous = null;
        ListNode next; // null
        while(current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    ListNode middleNode() {
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        // when the "fast" reaches the end of the list "slow" will be at the middle
        while(fast != null && fast.next != null) {
            slow = slow.next; // travels 1 node
            fast = fast.next.next; // travels 2 nodes
        }
        return slow;
    }

    ListNode nodeFromLast(int position) {
        if(head == null)
            return null;
        ListNode reference = head;
        ListNode main = head;
        // setting offset between "reference" and "main" such that
        // when reference is at null the main will be at result
        int offset = 0;
        while(offset < position) {
            reference = reference.next;
            offset++;
        }
        while(reference != null) {
            main = main.next;
            reference = reference.next;
        }
        return main;
    }

    void deleteGivenKey(int key) {
        if(head == null) return;
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if(current == null) return;
        if(temp == null)
            head = current.next;
        else
            temp.next = current.next;
    }

    public static void main(String[] args) {
        MoreOnSLL obj = new MoreOnSLL();
        obj.insert(15);
        obj.insert(34);
        obj.insert(57);
        obj.insert(28);
        obj.insert(68);
        obj.insert(76);
        obj.insert(22);
        obj.display();

        int pos = 5;
        System.out.println(pos + " node from end: " + obj.nodeFromLast(pos).data);

        System.out.println("middle node: " + obj.middleNode().data);

        System.out.println("After reversing: ");
        obj.head = obj.reverseList();
        obj.display();

        obj.deleteGivenKey(76);
        obj.deleteGivenKey(57);
        obj.deleteGivenKey(28);
        obj.display();
    }
}
