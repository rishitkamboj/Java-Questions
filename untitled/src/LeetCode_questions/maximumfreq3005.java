package LeetCode_questions;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int ans=0;
        int max=Integer.MIN_VALUE;

        for(int i:nums){
            freq[i]++;
        }
        for(int i:freq){
            max=Math.max(i,max);
        }
        for(int i:nums){
            if(freq[i]==max){
                ans++;
            }

        }
        return ans;
    }
}