package December.DP.MCM;

import java.util.Objects;

public class PalindromePartioning {
    int recursion(String s,int i,int j){
        if(i>=j || isPalin(s,i,j)){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=recursion(s,i,k)+recursion(s,k+1,j)+1;

            if(temp<min){
                min=temp;
            }
        }
        return min;
    }

    int recursion(String s,int i,int j,int dp[][]){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if( isPalin(s,i,j)){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){

            int left=0;
            if(dp[i][k]!=-1){
                left=dp[i][k];
            }
            else{
                left=recursion(s,i,k,dp);
                dp[i][k]=left;
            }
            int right=0;

            if(dp[k+1][j]!=-1){
                right=dp[k+1][j];
            }
            else{
                right=recursion(s,k+1,j,dp);
                dp[k+1][j]=right;
            }



            int temp=left+right+1;

            if(temp<min){
                min=temp;
            }
        }
        return dp[i][j]=min;
    }






    boolean isPalin(String s,int i,int j,Boolean palin[][]){
        if(i==j){
            return true;
        }
        if(palin[i][j]!=null){
            return palin[i][j];
        }
        while(i<j && j>=0 && i!=j){
            if(s.charAt(i)!=s.charAt(j)){
                return palin[i][j]=false;
            }
            i++;
            j--;
        }
        return palin[i][j]=true;
    }
    boolean isPalin(String s,int i,int j){
        if(i==j){
            return true;
        }

        while(i<j && j>=0 && i!=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }



}
