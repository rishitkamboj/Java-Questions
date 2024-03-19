package LeetCode_questions;

import java.util.ArrayList;

public class rotatebyDplaces {
}
public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
    int n=arr.size();
    k=k%n;
    if(k>n){
        return arr;
    }
    rotator(nums,0,n-k-1);
    rotator(nums,n-k,n-1);
    rotator(nums,0,n-1);
    return arr;
}
static void rotator(ArrayList<Integer> nums,int s,int e){
    while(s<=e){
        int temp=nums.get(s);
      nums.set(s,nums.get(e));
      nums.set(e,temp);
        s++;
        e--;
    }
