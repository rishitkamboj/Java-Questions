package JANUARY.Recursion;

import java.util.List;

public class countSubswithK {




    static int subsequence(int ind, int arr[],int k){
        if(k==0){

            return 1 ;
        }

        if(ind==arr.length || k<0 ){
            return 0;
        }



      int left=  subsequence(ind+1,arr,k-arr[ind]);
        // not take

         int right= subsequence(ind+1,arr,k);


         return left+right;
    }
}
