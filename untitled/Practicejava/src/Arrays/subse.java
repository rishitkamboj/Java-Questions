package Arrays;

import java.util.*;

public class subse {


    public static void main(String[] args) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
         int arr[]={1,2,3,4};

         takeorNot(0,arr,list,ans);

        System.out.println(ans);

    }

    public static void takeorNot(int index,int arr[],List<Integer> list,List<List<Integer>>ans){
         if(index==arr.length){
             ans.add(new ArrayList<>(list));
             return;
         }
         //pick
        list.add(arr[index]);
         takeorNot(index+1,arr,list,ans);
         //notpick
        list.remove(list.size()-1);
        takeorNot(index+1,arr,list,ans);
    }
}
