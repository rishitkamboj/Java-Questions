package December.arrays.medium;

public class majorityElement {


    // method 1 ,, pick one element and run a for loop for that and count
    // method 2 HASHING
    // method 3 Moore Voting Algo

    int majorityEle(int[] nums) {
        int count = 0;
        int element = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                element = nums[i];
                count=1;
            }
            if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        // keep a check for the element

        return element;
    }
}
