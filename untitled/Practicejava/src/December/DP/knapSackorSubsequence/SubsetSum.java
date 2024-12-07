package December.DP.knapSackorSubsequence;

public class SubsetSum {


//    public boolean canPartition(int[] nums) {
//        int n=nums.length;
//        int sum=0;
//        for(int i:nums){
//            sum+=i;
//        }
//        if(sum%2!=0){
//            return false;
//        }
//        int target=sum/2;
//        // Boolean dp[][]=new Boolean[n+1][target+1];
//        // return memo(nums,n,target,dp);
//        return tabulation(nums,n,target);
//    }
    public boolean memo(int arr[],int n,int target,Boolean dp[][]){
        if(target==0){
            return true;
        }
        if(n<=0){
            return false;
        }
        if(dp[n][target]!=null){
            return dp[n][target];
        }
        boolean pick=false;
        if(target>=arr[n-1]){
            pick=memo(arr,n-1,target-arr[n-1],dp);
        }
        boolean notpick=memo(arr,n-1,target,dp);

        return dp[n][target]=pick||notpick;
    }

    public boolean tabulation(int arr[],int n,int target){
        boolean dp[][]=new boolean[n+1][target+1];

        for(int i=0;i<=target;i++){
            dp[0][i]=false;
        }

        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }


        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                boolean notpick=dp[i-1][j];
                boolean pick=false;
                if(j>=arr[i-1]){
                    pick=dp[i-1][j-arr[i-1]];
                }
                dp[i][j]=notpick||pick;
            }
        }
        return dp[n][target];

    }

}
