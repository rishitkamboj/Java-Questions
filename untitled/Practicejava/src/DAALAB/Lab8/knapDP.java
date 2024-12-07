package DAALAB.Lab8;

public class knapDP {

    public static void main(String[] args) {
        int wt[]={3,4,6,5};
        int val[]={2,3,1,4};
        System.out.println(knapsack(wt,val,8,3));
    }


  static  int knapsack(int wt[],int val[],int W,int ind){
        if(ind==0){
            if(W>=wt[ind]){
                return val[ind];
            }
            else{
              return 0;}
        }
        int  take=Integer.MIN_VALUE;
        if(W>=wt[ind]){
         take=val[ind]+knapsack(wt,val,W-wt[ind],ind-1);}
        int nottake= knapsack(wt, val, W, ind - 1);
        return Math.max(take,nottake);

        // O(2^n);
    }



    int knapsack(int wt[],int val[],int W,int ind,int dp[][]){
        if(ind==0){
            if(W>=wt[0]){
                return val[0];
            }
            return 0;
        }
        if(dp[ind][W]!=-1){
            return dp[ind][W];
        }
        int take=Integer.MIN_VALUE;
        if(W>=wt[ind]){
       take=val[ind]+knapsack(wt,val,W-wt[ind],ind-1);}

        int nottake=0+knapsack(wt,val,W,ind-1);
        return dp[ind][W]=Math.max(take,nottake);

        // O(2^n);
    }

    int knapSACK(int wt[],int val[],int W){
        int n=wt.length;
        int dp[][]=new int[n][W+1];



        for(int i=wt[0];i<=W;i++){
            dp[0][i]=val[0];
        }
//        for(int i=0;i<=W;i++){
//            if(i>=wt[0]){
//                dp[0][i]=val[0];
//            }
//        }
        for(int ind=1;ind<n;ind++){
            for(int w=0;w<=W;w++){

                int notTake=dp[ind-1][w];
                int take=Integer.MIN_VALUE;

                if(w>=wt[ind]){
                    take=val[ind]+dp[ind-1][W-wt[ind]];
                }
                dp[ind][w]=Math.max(take,notTake);
            }
        }
        return dp[n-1][W];
    }

}
