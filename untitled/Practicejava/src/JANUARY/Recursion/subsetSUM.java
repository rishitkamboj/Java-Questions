package JANUARY.Recursion;

import java.util.List;

public class subsetSUM {




    public void subset(int ind,int N,int sum,int arr[] ,List<Integer>ans){
        if(ind==N){
            ans.add(sum);
        }

        //take
        subset(ind+1,N,sum+arr[ind],arr,ans);
        subset(ind+1,N,sum,arr,ans);
    }

    
}
