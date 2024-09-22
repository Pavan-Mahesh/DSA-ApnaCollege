// 22-9-24

package Day014_LeetCodeQuestions;

public class ContainerWithMostWater {
    static int bruteForceApproach(int[] height) {
        int max = 0;
        for(int i = 0; i < height.length - 1; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int h = Math.min(height[i], height[j]);
                int w = j - i;
                int area = h * w;
                max = Math.max(area, max);
            }
        }

        return max;
    }

    static int optimalApproach(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        while(i < j) {
            int h = Math.min(height[i], height[j]);
            int w = j - i;
            int area = h * w;
            max = Math.max(area, max);
            if(height[i] < height[j])
                i++;
            else
                j--;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(bruteForceApproach(height));
        System.out.println(optimalApproach(height));
    }
}
