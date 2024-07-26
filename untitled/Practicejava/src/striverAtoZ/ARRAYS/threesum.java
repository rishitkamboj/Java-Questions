package striverAtoZ.ARRAYS;

import java.util.*;

public class threesum {

    public static List<List<Integer>> triplet(int n, int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }}
            List<List<Integer>> result = new ArrayList<>(set);
            return result;
        }



    public static List<List<Integer>> triplet2(int n, int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            HashSet<Integer> t=new HashSet<>();
            for(int j = i+1; j < n; j++){
                int rem=-(arr[i]+arr[j]);
                if(t.contains(rem)){
                    List<Integer> temp= Arrays.asList(arr[i],arr[j],rem);
                    temp.sort(null);
                    set.add(temp);
                }
                t.add(rem);
            }}
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }



    public static List<List<Integer>> triplet3(int n, int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
       for(int i=0;i<arr.length; i++){
           int j=i+1;
           int k=n-1;
           while(j<k){
               int sum=arr[i]+arr[j]+arr[k];
               if(sum==0){
                   List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k]);
                   temp.sort(null);
                   set.add(temp);
                   j++;
                   k--;
               }
               else if(sum<0){
                   j++;
               }
               else{
                   k--;
               }

           }
       }
       List<List<Integer>> result = new ArrayList<>(set);
       return result;
    }




}
