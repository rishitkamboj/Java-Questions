package December.arrays.hard;

import java.util.*;

public class threeSum {

    // method 1 -- three for loops
    // method 2 -- HASHING
    // method 3 -- Sorting

    int[] threeSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
           HashSet<Integer> set = new HashSet<Integer>();
            for(int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
            if(set.contains(target-sum)) {
                return new int[]{nums[i],nums[j],target-sum};
            }
            set.add(sum);
            }
        }
        return new int[]{-1,-1,-1};
    }
    int[] threeSumOpti(int[] nums, int target) {
        Arrays.sort(nums);
        //Set<List<Integer>> ans=new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int j=i+1;
            int k=nums.length-1;
            while(j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) {
//                    List<Integer> a=Arrays.asList(nums[i],nums[j],nums[k]);
//                    a.sort(null);
//                    ans.add(a);
                    return new int[]{nums[i],nums[j],nums[k]};
                }
                if(sum < target) {
                    j++;
                }
                else{
                    k--;
                }
            }
        }
//        List<List<Integer>> a=new ArrayList<List<Integer>>(ans);
//        return a;
        return new int[]{-1,-1,-1};
    }
}
