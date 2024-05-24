package dynamicprogramming.subsequences;

public class partitiontwoABSOLUTEdiff {

}
class Sol {
    public int minimumDifference(int[] arr) {
        int total=0;
        for(int i:arr){
            total+=i;
        }
        int n=arr.length;
        int k=total;
        boolean dp[][]=new boolean[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=k){
            dp[0][k]=true;
        }
        for(int ind=1;ind<n;ind++){
            for(int tar=1;tar<=k;tar++){
                boolean notTaken=dp[ind-1][tar];
                boolean taken=false;
                if(arr[ind]<=tar){
                    taken=dp[ind-1][tar-arr[ind]];
                }
                dp[ind][tar]=notTaken||taken;
            }
        }

        int min=Integer.MAX_VALUE;
        for(int s1=0;s1<=total;s1++){
            if(dp[n-1][s1]){
                min=Math.min(min,Math.abs((total-s1)-s1));
            }
        }
        return min;

    }
}