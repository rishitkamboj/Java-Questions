package December.arrays.easy;

import java.util.Arrays;

public class moveZeroEnd {

   static public void moveZeroEnd(int[] nums) {
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }

        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,1,0,45};
        moveZeroEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

}
