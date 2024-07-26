package DAALAB.lab1;

import java.util.ArrayList;

public class prefixsum {

    public static int[] prefix(int arr[]){
        int n=arr.length;
        int ans[]=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
        ans[i]=ans[i-1]+arr[i];
        }
        ArrayList<Integer> list=new ArrayList<>();
        return ans;

    }
}
