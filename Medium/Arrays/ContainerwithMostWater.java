//11. Container With Most Water
import java.util.*;
public class ContainerwithMostWater {
    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length -1;
        int max = 0;

        while(left < right){
            int h1 = height[left];
            int h2 = height[right];

            int length = Math.min(h1, h2);

            int b = right - left;

            int area = length * b;

            max = Math.max(max,area);

            if(h1<h2){
                left++;
            }
            else if(h1>h2){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] height = new int[n];

        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println(maxArea(height));
    }
}
