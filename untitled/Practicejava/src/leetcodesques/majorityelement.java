package leetcodesques;

public class majorityelement {
    class Solution {
        public int majorityElement(int[] nums) {
            int el=0;
            int count=0;

            for(int i=0;i<nums.length;i++){
                if(count==0){
                    count=1;
                    el=nums[i];
                }
                else if(el==nums[i]){
                    count++;
                }
                else{
                    count--;
                }
            }
            int c = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == el) c++;
            }

            if (c > (nums.length/ 2)) return el;
            return -1;

        }
    }
}
