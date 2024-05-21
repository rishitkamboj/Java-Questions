package dynamicprogramming;
import java.util.*;

public class fibonacci {


    public static int fibonacci(int n,int dp[]) {
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

     return dp[n]= fibonacci(n-1,dp)+fibonacci(n-2,dp);

    }
    public static int fibonacci2(int n) {
      int dp[]=new int[n+1];
      dp[0]=0;
      dp[1]=1;
      for(int i=2;i<=n;i++){
          dp[i]=dp[i-1]+dp[i-2];
      }
      return dp[n];
    }
    public static int fibonacci3(int n) {
      int a=0;
      int b=1;
      for(int i=2;i<=n;i++){
          int c=a+b;
          a=b;
          b=c;
      }
      return b;
    }

    public static void main(String[] args) {
//        int []dp=new int[6];
//        Arrays.fill(dp,-1);
//        System.out.println(fibonacci(5,dp));
      //  System.out.println(fibonacci2(3));
        System.out.println(fibonacci2(5));

    }
}
