// 14-9-24

package Day009_ArrayList;

import java.util.Scanner;

public class SingleNumber {
    static int singleNumber(int[] numbs) {
        int ans = numbs[0];
        for(int i = 1; i < numbs.length; i++)
            ans ^= numbs[i];

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("size: ");
        int size = input.nextInt();

        System.out.print("input: ");
        int[] numbs = new int[size];
        for(int i = 0; i < size; i++)
            numbs[i] = input.nextInt();

        System.out.println("\noutput: " + singleNumber(numbs));
    }
}
