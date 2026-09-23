//27. Remove Element
public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,2,5};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}
