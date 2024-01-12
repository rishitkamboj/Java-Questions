package strivercourse.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {

    }



    //BRUTE FORCE APPROACH FOR TYPE 1
static String sum1(int arr[],int sum){
    for (int i = 0; i < arr.length ; i++) {
        for (int j = i+1; j < arr.length; j++) {

            if((arr[i]+arr[j])==sum){
                return "YES";
            }
        }
    }
     return "No";}



    static int[] sum11(int arr[],int sum){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if((arr[i]+arr[j])==sum){
                    return new int[]{i,j};
                }
            }
        }  return new int[]{-1,-1};}



// BETTER SOLUTION FOR TYPE1
    static String sum2(int arr[],int sum) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
             int a=arr[i];
             int more=sum-a;
             if(mpp.containsKey(more)){
                 return "YES";
             }
             mpp.put(arr[i],i);

        }
           return "NO";
    }


    static int[] sum22(int arr[],int sum) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            int more=sum-a;
            if(mpp.containsKey(more)){
                return new int[]{i,mpp.get(more)};
            }
            mpp.put(arr[i],i);

        }
        return new int[]{-1,-1};
    }





    // OPTIMAL APPROACH or without HashMap two pointersss
    static String sum3(int arr[],int target){
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return "YES";
            }
            else if(sum<target){left++;}
            else{right--;}

        }
        return "NO";
    }


















}
