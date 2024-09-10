// 9-9-24

package Day006_BinaryNumberSystem;

public class Conversion {
    static int decimalToBinary(int decNumb) {
        int biNumb = 0;
        int pow = 1;
        while(decNumb > 0) {
            biNumb += (decNumb % 2) * pow;
            decNumb /= 2;
            pow *= 10;
        }

        return biNumb;
    }

    static int binaryToDecimal(int biNumb) {
        int deci = 0;
        int pow = 1;
        while(biNumb > 0) {
            deci += (biNumb % 10) * pow;
            biNumb /= 10;
            pow *= 2;
        }

        return deci;
    }

    public static void main(String[] args) {
        int decNumb = 42;
        System.out.println(decNumb + ": " + decimalToBinary(decNumb));

        int biNumb = 110101;
        System.out.println(biNumb + ": " + binaryToDecimal(biNumb));
    }
}
