package dynamicprogramming.subsequences;

public class countsubsequenceswithsumK {
    class Solution{

        public int perfectSum(int arr[],int n, int sum)
        {

        }

        public int recur(int ind,int sum,int arr[]){
            if(sum==0){
                return 1;
            }
            if(ind==0){
                return (sum==arr[ind])?1:0;
            }
            int notpick=recur(ind-1,sum,arr);
            int pick=0;
            if(arr[ind]<=sum){
                pick=recur(ind+1,sum-arr[ind],arr);
            }
            return pick+notpick;
        }
        public int recurdp(int ind,int sum,int arr[],int dp[][]){
            if(sum==0){
                return 1;
            }
            if(ind==0){
                return (sum==arr[ind])?1:0;
            }
            if(dp[ind][sum]!=-1){
                return dp[ind][sum];
            }
            int notpick=recurdp(ind-1,sum,arr,dp);
            int pick=0;
            if(arr[ind]<=sum){
                pick=recurdp(ind+1,sum-arr[ind],arr,dp);
            }
            return dp[ind][sum]=pick+notpick;
        }

        public int tabulation(int []arr,int sum){
            int n=arr.length;
            int dp[][]=new int[n][sum+1];

            for(int i=0;i<n;i++){
                dp[i][0]=1;
            }
            if(arr[0]<=sum){
                dp[0][arr[0]]=1;
            }
            for(int i=1;i<n;i++){
                for(int j=1;j<sum+1;j++){
                    int notpick=dp[i-1][j];
                    int pick=0;
                    if(arr[i]<=j){
                        pick=dp[i-1][j-arr[i]];
                    }

                    dp[i][j]=notpick+pick;
                }
            }
return dp[n-1][sum];
        }












    }






}
