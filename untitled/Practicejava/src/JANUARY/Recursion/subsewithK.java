package JANUARY.Recursion;

import java.util.List;

public class subsewithK {




 // print all subse with sum K
    static void subsequence(int ind, int arr[],int k, List<Integer> list){
        if(k==0){
            System.out.println(list);
            return;
        }

        if(ind==arr.length || k<0 ){
            return;
        }


        list.add(arr[ind]);
        subsequence(ind+1,arr,k-arr[ind],list);
        // not take
        list.remove(list.size()-1);
        subsequence(ind+1,arr,k,list);
    }


    // print any one subsequence with sum K
}
