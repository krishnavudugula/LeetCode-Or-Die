//1389. Create Target Array in the Given Order
public class CreateTargetArrintheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0;

        for(int i=0; i<nums.length; i++){

            //shift elements to the right
            for(int j=size; j>index[i]; j--){
                target[j] = target[j-1];
            }

            //Insert
            target[index[i]] = nums[i];

            size++;
        }
        return target;
    }
}
