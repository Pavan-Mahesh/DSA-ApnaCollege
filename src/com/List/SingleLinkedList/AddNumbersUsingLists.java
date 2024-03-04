package com.List.SingleLinkedList;

import java.util.Scanner;

public class AddNumbersUsingLists {
    private static class ListNode {
        private final int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    ListNode head = null;

    void makeList(int num) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(num != 0) {
            tail.next = new ListNode(num % 10);
            tail = tail.next;
            num = num / 10;
        }
        this.head = dummy.next;
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
            tail = tail.next;
            if(num1 != null) num1 = num1.next;
            if(num2 != null) num2 = num2.next;
        }
        if(carry == 1)
            tail.next = new ListNode(carry);
        this.head = dummy.next;
    }

    void displayNumber(ListNode current) {
        if (current != null) {
            displayNumber(current.next);
            System.out.print(current.data);
        }
    }
    void displayNumber() {
        displayNumber(this.head);
        System.out.println();
    }

    void display() {
        ListNode current = this.head;
        System.out.print("head");
        while(current != null) {
            System.out.print(" --> " + current.data);
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.println();

        AddNumbersUsingLists num1 = new AddNumbersUsingLists();
        num1.makeList(a);
        AddNumbersUsingLists num2 = new AddNumbersUsingLists();
        num2.makeList(b);

        System.out.println("num1: " + a);
        num1.display();
        System.out.println();
        System.out.println("num2: " + b);
        num2.display();
        System.out.println();

        AddNumbersUsingLists result = new AddNumbersUsingLists();
        result.addTwoNumbers(num1.head, num2.head);
        System.out.print("result: ");
        result.displayNumber();
        result.display();
    }
}
