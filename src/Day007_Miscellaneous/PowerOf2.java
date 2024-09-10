// 10-9-24

package Day007_Miscellaneous;

public class PowerOf2 {
    public static void main(String[] args) {
        int numb = (int)(Math.random() * 10);

        // using loops
        {
            int pow = 1;
            while(numb > pow) {
                pow *= 2;
            }

            if(numb == pow)
                System.out.println(numb + " is a power of 2");
            else
                System.out.println(numb + " is not a power of 2");
        }

        // using bitwise operators
        {
            if(numb > 0 && (numb & (numb - 1)) == 0)
                System.out.println(numb + " is a power of 2");
            else
                System.out.println(numb + " is not a power of 2");
        }
    }
}
