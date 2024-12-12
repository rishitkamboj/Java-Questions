package December.DP.MCM;

public class MCM {



    int recursion(int arr[],int i,int j){
        if(i>=j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=recursion(arr,i,k)+recursion(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);

            if(temp<min){
                min=temp;
            }
        }
        return min;
    }




    static int recursion(int arr[],int i,int j,int dp[][]){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=recursion(arr,i,k,dp)+recursion(arr,k+1,j,dp)+(arr[i-1]*arr[k]*arr[j]);

            if(temp<min){
                min=temp;
            }
        }
        return dp[i][j]=min;
    }
}
