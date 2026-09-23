//1299. Replace Elements with Greatest Element on Right Side
import java.util.*;
public class ReplaceElements {
    public static int[] replaceElements(int[] arr){
       int max = -1;

       for(int i=arr.length-1; i>=0; i--){
            int current = arr[i];
            arr[i] = max;
            max = Math.max(max, current);
       }
       return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
