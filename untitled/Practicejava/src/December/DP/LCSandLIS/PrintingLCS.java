package December.DP.LCSandLIS;

public class PrintingLCS {


    public static void main(String[] args) {
        //printing lcs
        String s1="adebc";
        String s2="dcadb";
        int n=s1.length();
        int m=s2.length();
     String s=   tabulationLCS(s1,n,s2,m);
        System.out.println("LCS is "+s);
    }
    // we need to find LCS first then with LCS we will do


  static   String tabulationLCS(String s1,int n,String s2,int m){
        int[][] dp =new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    continue;
                }
                int l1=dp[i-1][j];
                int l2=dp[i][j-1];
                dp[i][j]=Math.max(l1,l2);
            }
        }
        int len=dp[n][m];
       return LCS(n,m,s1,s2,dp);
    }

   static String LCS(int n,int m,String s1,String s2,int dp[][]){
        int i=n;
        int j=m;

        StringBuilder str=new StringBuilder();
        while(i>0 && j>0 ){
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                str.append(s1.charAt(i - 1));
                i--;
                j--;

            } else if (dp[i - 1][j] > dp[i][j - 1]) {

                i--;

            } else {

                j--;

            }
        }

        return str.reverse().toString();
    }
}
