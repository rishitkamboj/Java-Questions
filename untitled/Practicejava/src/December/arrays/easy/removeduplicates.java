package December.arrays.easy;

public class removeduplicates {

    // one method is create hasharray then check the elements which has frequency 2 those r duplicates
    // second method use hashset
    // third method check wala

    public int removeDuplic(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}
