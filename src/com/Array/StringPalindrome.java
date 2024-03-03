package com.Array;

public class StringPalindrome {
    boolean isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int i = 0, j = ch.length-1;
        while(i < j) {
            if(ch[i] != ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
    void demo() {
        String word = "malayalam";
        System.out.println(word);
        if(isPalindrome(word))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }

    public static void main(String[] args) {
        StringPalindrome obj = new StringPalindrome();
        obj.demo();
    }
}
