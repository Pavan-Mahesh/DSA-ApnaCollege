package Day006_BinaryNumberSystem;

import java.util.Arrays;

public class SignedNumbers {
    static int getBinaryLength(int deciNumb) {
        int len = 1; // extra bit
        int pow = 1;
        while(deciNumb >= pow) {
            len++;
            pow *= 2;
        }

        return len;
    }

    static void complement(int[] biNumb) {
        // 1's complement
        for(int i = 1; i < biNumb.length; i++)
            biNumb[i] = biNumb[i] ^ 1;

        // add 1
        int carry = 0;
        int idx = biNumb.length - 1;
        do {
            if(biNumb[idx] == 1) {
                biNumb[idx] = 0;
                carry = 1;
            } else {
                biNumb[idx] = 1;
                carry = 0;
            }
            idx--;
        } while(carry == 1);
    }

    static int[] decimalToBinary(int decNumb) {
        int len = getBinaryLength(Math.abs(decNumb));

        int[] biNumb = new int[len];
        if(decNumb < 0) {
            biNumb[0] = 1;
            decNumb = -decNumb;
        }

        for(int i = len - 1; i > 0; i--) {
            biNumb[i] = decNumb % 2;
            decNumb /= 2;
        }

        if(biNumb[0] == 1)
            complement(biNumb);

        return biNumb;
    }

    public static void main(String[] args) {
        int decNumb = 12;
        System.out.println("+" + decNumb + ": " + Arrays.toString(decimalToBinary(decNumb)));
        System.out.println("-" + decNumb + ": " + Arrays.toString(decimalToBinary(-decNumb)));
    }
}
