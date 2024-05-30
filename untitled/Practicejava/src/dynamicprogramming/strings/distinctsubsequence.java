package dynamicprogramming.strings;

public class distinctsubsequence {
    public static void main(String[] args) {
        String s ="1101";
        System.out.println(Integer.parseInt(s));
    }
    public int numDistinct(String s, String t) {
return 1;
    }

    private int helprecur(String s,String t,int i,int j){

if(j<0){
    return 1;
}
if(i<0){
    return 0;
}
        if(s.charAt(i)==t.charAt(j)){
            return helprecur(s,t,i-1,j-1)+helprecur(s,t,i-1,j);
        }
        else{
            return helprecur(s,t,i-1,j);
        }
    }
    private int helprecurdp(String s,String t,int i,int j,int dp[][]){

        if(j<0){
            return 1;
        }
        if(i<0){
            return 0;
        }
        if(dp[i][j]!=-1){
                return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=helprecurdp(s,t,i-1,j-1,dp)+helprecurdp(s,t,i-1,j,dp);
        }
        else{
            return dp[i][j]=helprecurdp(s,t,i-1,j,dp);
        }
    }


    private int tabulation(String s,String t){
        int n=s.length();
        int m=t.length();

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        // for(int i=0;i<m+1;i++){
        //     dp[0][i]=0;
        // }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }



}
