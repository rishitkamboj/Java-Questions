package December.DP.knapSackorSubsequence;

public class countsubsetswithgivensum {

    int countSub(int arr[],int target,int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            if(target==0 && arr[0]==0){
                return 2;
            }
            if(target==0 || arr[0]==target){
                return 1;
            } return 0;
        }
        int notpick=countSub(arr,target,n-1);
        int pick=0;
        if(target>=arr[n-1]){
            pick=countSub(arr,target-arr[n-1],n-1);
        }
        return pick+notpick;
    }
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
}
