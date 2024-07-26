package striverAtoZ.ARRAYS;

import java.util.*;

public class foursum {


    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Long> set = new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                   long sum=nums[i]+nums[j]+nums[k];
                   long diff=target-sum;
                    if(set.contains(diff)){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],(int)diff);
                        list.sort(null);
                        result.add(list);
                    }
                    set.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(result);
    }
    public List<List<Integer>> fourSum2(int[] nums, int target) {

        Set<List<Integer>> result = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        list.sort(null);
                        result.add(list);
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }

return new ArrayList<>(result);
    }




}
