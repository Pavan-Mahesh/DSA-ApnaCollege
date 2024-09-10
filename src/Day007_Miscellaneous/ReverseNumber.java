// 10-9-24

package Day007_Miscellaneous;

public class ReverseNumber {
    public static void main(String[] args) {
        int numb = 1432;

        int rev = 0;
        int temp = numb;
        while(temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp /= 10;
        }

        System.out.println(numb + " : " + rev);
    }
}
