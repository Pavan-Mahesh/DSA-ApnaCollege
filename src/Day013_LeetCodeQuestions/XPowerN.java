package Day013_LeetCodeQuestions;

public class XPowerN {
    static double getPow(double x, int n) {
        if(n < 0) {
            x = 1 / x;
            n = -n;
        }

        int binForm = n;
        double ans = 1;
        while(binForm > 0) {
            if(binForm % 2 == 1)
                ans *= x;
            x *= x;
            binForm /= 2;
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 3, n = -5;
        System.out.println(getPow(x, n));
    }
}
