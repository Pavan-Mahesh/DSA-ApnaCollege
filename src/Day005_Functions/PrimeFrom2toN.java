// 7-9-24

package Day005_Functions;

public class PrimeFrom2toN {
    static void printPrimes(int numb) {
        for(int i = 2; i < numb; i++) {
            boolean flag = false;
            for(int j = 2; j * j <= i; j++) {
                if(i % j == 0) {
                    flag = true;
                    break;
                }
            }

            if(!flag)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 35;
        printPrimes(n);
    }
}
