package December.arrays.hard;

public class majorityElement {



    //method 1-- count elements
    // method 2-- hashing
    // method 3-- Moore's Voting Algo with modifications
    int[] majorityEle(int[] nums) {
        int el1=-1;
        int el2=-1;
        int c1=0;
        int c2=0;

        for(int i=0;i<nums.length;i++){
            if(c1==0 && nums[i]!=el2){
                c1=1;
                el1=nums[i];
            }
            else if(c2==0 && nums[i]!=el1){
                c2=1;
                el2=nums[i];
            }
            else if(nums[i]==el1){
                c1++;
            }
            else if(nums[i]==el2){
                c2++;

            }
            else{
                c1--;
                c2--;
            }
        }
        return new int[]{c1,c2};
    }
}
