// 7-9-24

package Day005_Functions;

public class Fibonacci {
    static int nthFibo(int n) {
        if(n <= 1)
            return n;

        int t1 = 0, t2 = 1;
        for(int i = 0; i < n - 1; i++) {
            t2 = t2 + t1;
            t1 = t2 - t1;
        }

        return t2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthFibo(n));
    }
}
