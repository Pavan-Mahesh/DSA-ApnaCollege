package com.Array;

import java.util.Scanner;

public class AddTwoNumbers {

    static int numLen(int num){
        int len = 0;
        while(num != 0) {
            num /= 10;
            len++;
        }
        return len;
    }
    static int[] makeNumArray(int num) {
        int len = numLen(num);
        int[] digits = new int[len];
        for(int idx = 0; idx < len; idx++) {
            digits[idx] = num % 10;
            num /= 10;
        }
        return digits;
    }

    static int[] addition(int[] num1, int[] num2) {
        int[] result = new int[Math.max(num1.length, num2.length) + 1];
        int carry = 0, idx1 = 0, idx2 = 0, i = 0;
        while(idx1 < num1.length || idx2 < num2.length) {
            int x = idx1 < num1.length ? num1[idx1] : 0;
            int y = idx1 < num2.length ? num2[idx2] : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            result[i] = sum % 10;
            idx1++;
            idx2++;
            i++;
        }
        result[i] = carry;
        return result;
    }

    static void printArray(int[] digits) {
        int len = digits.length;
        len = len - ((digits[len-1] == 0) ? 1 : 0);
        System.out.print("[");
        for(int i=0; i<len; i++)
            System.out.print(digits[i] + ((i != len-1) ? ", " : ""));
        System.out.println("]");
    }

    static void getNumber(int[] digits) {
        int len = digits.length;
        len = len - ((digits[len-1] == 0) ? 1 : 0);
        for(int idx = len-1; idx >= 0; idx--)
            System.out.print(digits[idx]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.println();

        int[] num1 = makeNumArray(a);
        System.out.println("num1: " + a);
        printArray(num1);
        int[] num2 = makeNumArray(b);
        System.out.println("num1: " + b);
        printArray(num2);

        int[] result = addition(num1, num2);
        System.out.print("result: ");
        getNumber(result);
        printArray(result);
    }
}
