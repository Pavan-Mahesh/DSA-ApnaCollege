// 7-9-24

package Day005_Functions;

public class BinomialCoefficient {
    static int factorial(int numb) {
        int fact = 1;
        while(numb > 0) {
            fact *= numb;
            numb--;
        }

        return fact;
    }

    static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        int n = 6, r = 3;
        System.out.println(n + "C" + r + ": " + nCr(n, r));
    }
}
