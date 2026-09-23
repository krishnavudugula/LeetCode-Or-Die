//941 Valid Mountain Array.
public class ValidMoutainArray {
    public static boolean validMountainArray(int[] arr){
        if(arr.length < 3){
            return false;
        }
        int i = 0;

        //Mountain Going UP
        while(i < arr.length - 1 && arr[i] < arr[i+1]){
            i++;
        }

        if(i==0 || i == arr.length - 1){
            return false;
        }
        //Coming Down
        while(i< arr.length - 1 && arr[i] > arr[i+1]){
            i++;
        }
        return i == arr.length - 1;   
    }
}
