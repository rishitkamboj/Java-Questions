package dynamicprogramming;

public class frogwithkjumps {
    public int minimizeCost(int arr[],int N,int K){
return 1;
    }
    int ans(int arr[],int N,int K){
        if(N==0){
            return 0;
        }
        int min=Integer.MIN_VALUE;
        for(int i=1;i<=K;i++){
            if(N-i>=0){
                int jump=ans(arr,N-i,K)+Math.abs(arr[N]-arr[N-i]);
                min=Math.min(min,jump);
            }
        }
        return min;
    }
    int ans2(int arr[],int N,int K,int dp[]){
        if(N==0){
            return 0;
        }
        if(dp[N]!=-1){
            return dp[N];
        }
        int min=Integer.MIN_VALUE;
        for(int i=1;i<=K;i++){
            if(N-i>=0){
                int jump=ans2(arr,N-i,K,dp)+Math.abs(arr[N]-arr[N-i]);
                min=Math.min(min,jump);
            }
        }
        return dp[N]=min;
    }

    int ans3(int []arr,int N,int K){
        int dp[]=new int[N];
        dp[0]=0;
        for(int i=1;i<N;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=K;j++){
                if(i-j>=0){
                    int jump=dp[i-j]+Math.abs(arr[i]-arr[i-j]);
                    min=Math.min(min,jump);
                }
            }
            dp[i]=min;

        }
        return dp[N-1];
    }



}
