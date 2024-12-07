package December.DP.knapSackorSubsequence;

public class KnapSack01 {


    public int recurKnap(int wt[],int val[],int W,int n){
        if(n==0 || W==0){
            return 0;
        }
//        if(n>=1){
//                if(W>=wt[n-1]){
//                    return val[n-1];
//                }
//                return 0;
//        }
        int notPick= recurKnap(wt, val, W, n - 1);
        int pick=Integer.MIN_VALUE;
        if(W>=wt[n-1]){
            pick=val[n-1]+recurKnap(wt,val,W-wt[n-1],n-1);
        }
        return Math.max(notPick,pick);
    }
}
