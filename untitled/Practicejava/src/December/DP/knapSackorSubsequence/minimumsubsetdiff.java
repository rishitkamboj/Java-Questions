package December.DP.knapSackorSubsequence;

public class minimumsubsetdiff {


    public int minimumsub(int arr[]){
         int n=arr.length;

         int sum=0;
         for(int i=0;i<n;i++){
             sum+=arr[i];
         }
         boolean[][] dp=new boolean[n+1][sum+1];

         for(int i=0;i<=n;i++){
             dp[i][0]=true;
         }
         for(int i=1;i<=n;i++){
             for(int j=1;j<=sum;j++){
                 boolean notpick=dp[i-1][j];
                 boolean pick=false;
                 if(j>=arr[i-1]){
                     pick=dp[i-1][j-arr[i-1]];
                 }
                 dp[i][j]=pick||notpick;
             }
         }

          int min=Integer.MAX_VALUE;
         for(int i=0;i<=sum/2;i++){
             if(dp[n][i]){
                 int diff=Math.abs(sum-2*i);
                 min=Math.min(min,diff);
             }
         }
         return min;
    }
}
