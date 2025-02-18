package JANUARY.Recursion;

import java.util.ArrayList;
import java.util.List;

public class subseQuence {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        int arr[]={1,2,3};
        subsequence(0,arr,list);
    }



    static void subsequence(int ind, int arr[], List<Integer> list){
        if(ind==arr.length){
            System.out.println(list);
            return;
        }
        // take case
        list.add(arr[ind]);
        subsequence(ind+1,arr,list);
        // not take
        list.remove(list.size()-1);
        subsequence(ind+1,arr,list);
    }
}
