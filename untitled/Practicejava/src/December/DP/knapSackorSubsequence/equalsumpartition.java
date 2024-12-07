package December.DP.knapSackorSubsequence;

public class equalsumpartition {


    boolean equalSum(int arr[],int n,int target,Boolean dp[][]){
        if(target==0){
            return true;
        }
        if(n<=0){
            return false;
        }
        if(dp[n][target]!=null){
            return dp[n][target];
        }
        boolean notpick=equalSum(arr,n-1,target,dp);
        boolean pick=false;
        if(target>=arr[n-1]){
            pick=equalSum(arr,n-1,target-arr[n-1],dp);
        }
        return dp[n][target]=pick||notpick;
    }

    boolean callEqualSum(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        Boolean dp[][]=new Boolean[n+1][target+1];
      return equalSum(arr,n,target,dp);
    }

    boolean tabulation(int arr[]){
        int n=arr.length;
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean dp[][]=new boolean[n+1][target+1];
            for(int i=0;i<=n;i++ ){
                dp[i][0]=true;
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=target;j++){
                        boolean notpick=dp[i-1][j];
                        boolean pick=false;
                        if(j>=arr[i-1]){
                            pick=dp[i-1][j-arr[i-1]];
                        }
                        dp[i][j]=pick||notpick;
                }
            }
            return dp[n][target];
    }
}
