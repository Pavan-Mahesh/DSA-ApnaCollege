package com.List.DoubleLinkedList;
import java.util.Scanner;
public class AddNumbersUsingLists {
    private static class ListNode {
        private final int data;
        private ListNode next;
        private ListNode prev;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    ListNode head = null;
    ListNode tail = null;

    void makeList(int num) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(num != 0) {
            tail.next = new ListNode(num % 10);
            if(tail != dummy)
                tail.next.prev = tail;
            tail = tail.next;
            num = num / 10;
        }
        this.head = dummy.next;
        this.tail = tail;
    }

    void addTwoNumbers(ListNode num1, ListNode num2) {
        // given non null lists
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;
        while(num1 != null || num2 != null) {
            int x = (num1 != null) ? num1.data : 0;
            int y = (num2 != null) ? num2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            if(tail != dummy)
                tail.next.prev = tail;
            tail = tail.next;
            if(num1 != null) num1 = num1.next;
            if(num2 != null) num2 = num2.next;
        }
        if(carry == 1) {
            tail.next = new ListNode(carry);
            tail.next.prev = tail;
            tail = tail.next;
        }
        this.head = dummy.next;
        this.tail = tail;
    }

    void reverseDisplay() {
        ListNode current = tail;
        System.out.print("tail");
        while(current != null) {
            System.out.print(" --> " + current.data);
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();

        AddNumbersUsingLists num1 = new AddNumbersUsingLists();
        num1.makeList(a);
        AddNumbersUsingLists num2 = new AddNumbersUsingLists();
        num2.makeList(b);

        System.out.println("num1:");
        num1.reverseDisplay();
        System.out.println("num2:");
        num2.reverseDisplay();

        AddNumbersUsingLists result = new AddNumbersUsingLists();
        result.addTwoNumbers(num1.head, num2.head);
        System.out.println("result:");
        result.reverseDisplay();
    }
}
