package December.DP.knapSackorSubsequence;

public class subsetwithgivendiff {

    int tabulation(int arr[],int target){
        int n=arr.length;
        int dp[][]=new int[n+1][target+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                int pick=0;
                if(j>=arr[i-1]){
                    pick=dp[i-1][j-arr[i-1]];
                }
                int notpick=dp[i-1][j];

                dp[i][j]=pick+notpick;
            }
        }
        return dp[n][target];
    }

    int countdiff(int arr[],int target){
        int n=arr.length;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum-target<0){
            return 0;
        }
        if((sum-target)%2!=0){
            return 0;
        }
        int tar=(sum+target)/2;
        return tabulation(arr,tar);
    }
}
