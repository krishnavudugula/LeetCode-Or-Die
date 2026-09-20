//48. Rotate Image
import java.util.*;
public class RotateImage {
    public static int[][] rotate(int[][] matrix){
        //Transpose of Matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse (after transpose)
        for(int i=0; i<matrix.length; i++){
            int left = 0;
            int right = matrix.length - 1;
            while (left < right){

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int result[][] = rotate(matrix);
        // System.out.println(Arrays.toString(matrix)); --> This Prints Reference Address

        for(int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }

}
