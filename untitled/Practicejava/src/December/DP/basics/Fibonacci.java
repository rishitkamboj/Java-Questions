package December.DP.basics;
import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 5;
        System.out.println("Plain Recursion Result: " + fiboRecur(n));


        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println("Memoization Result: " + fiboMemo(n, dp));


        System.out.println("Optimised result: "+fiboOpti(n));
    }


    public static int fiboRecur(int n) {
        if (n <= 1) {
            return n;
        }
        return fiboRecur(n - 1) + fiboRecur(n - 2);
    }


    public static int fiboMemo(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = fiboMemo(n - 1, dp) + fiboMemo(n - 2, dp);
    }

    public static int fiboTabu(int n){
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int fiboOpti(int n){
       int a=0;
       int b=1;

        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
