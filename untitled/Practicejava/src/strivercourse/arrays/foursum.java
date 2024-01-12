package strivercourse.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class foursum {
    public static void main(String[] args) {

    }







    static List<List<Integer>> foursum(int arr[],int target){

        List<List<Integer>> ans=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(i!=0&& arr[i]==arr[i-1]){ continue;}
            for(int j=i+1;j< arr.length;j++){
                if(j!=i+1 && arr[j]==arr[j-1]){ continue;}
            int k=j+1;
            int l= arr.length-1;
            while(k<l){
                long sum=arr[i];
                sum+=arr[j];
                sum+=arr[k];
                sum+=arr[l];

             if(sum==target){
             List<Integer>temp=Arrays.asList(arr[i],arr[j],arr[k]);
             ans.add(temp);
             k++;
             l--;
             while(k<l && arr[k]==arr[k-1]){ k++;}
                 while(k<l && arr[l]==arr[l+1]){ l--;}

            }


                else if(sum<target){
                    k++;
                }
                else{
                    l--;
                }

        }}}
        return ans;} }

