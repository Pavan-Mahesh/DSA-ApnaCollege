// 16-9-24

package Day010_QuestionsOnArrays;

public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int st = 0; st < arr.length; st++) {
            for (int ed = st; ed < arr.length; ed++) {
                System.out.print("[");
                for (int i = st; i <= ed; i++)
                    System.out.print(arr[i] + ",");
                System.out.print("\b] ");
            }
            System.out.println();
        }
    }
}
