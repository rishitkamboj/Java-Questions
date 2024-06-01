package dynamicprogramming.lis;

import java.util.*;

public class largestdivisiblesubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
                 int n=nums.length;
                 Arrays.sort(nums);
                 int dp[]=new int[n];
                 Arrays.fill(dp,1);
                 int hash[]=new int[n];
                 for(int i=0;i<n;i++){
                     hash[i]=i;
                     for(int j=0;j<i;j++){
                         if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                             dp[i]=dp[j]+1;
                             hash[i]=j;
                         }
                     }
                 }
                 int ans=-1;
                 int last=-1;
                 for(int i=0;i<n;i++){
                     if(dp[i]>ans){
                         ans=dp[i];
                         last=i;
                     }
                 }
                 HashSet<Integer> set=new HashSet<>();

                 set.toArray();
                 List<Integer>  list=new ArrayList<>();
                 list.add(nums[last]);
                 while(hash[last]!=last){
                     last=hash[last];
                     list.add(nums[last]);
                 }
                 return list;
    }
}
