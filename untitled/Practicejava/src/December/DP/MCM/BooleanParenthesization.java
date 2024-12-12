package December.DP.MCM;

public class BooleanParenthesization {




    static  int solve(String s,int i,int j,boolean isTrue){
        if(i>j){
            return 0;
        }
        if(i==j){
            if(isTrue && s.charAt(i)=='T'){
                return  1;
            }
            else if(!isTrue && s.charAt(i)=='F'){
                return 1;
            }
            return 0;
        }

        int ans=0;
        for(int k=i+1;k<j;k=k+2){

            int lt=solve(s,i,k-1,true);
            int lf=solve(s,i,k-1,false);
            int rt=solve(s,k+1,j,true);
            int rf=solve(s,k+1,j,false);

            if(s.charAt(k)=='&'){
                if (isTrue) {
                    ans=ans+(lt*rt);
                }
                else{
                    ans=ans+(lt*rf)+(lf*rt)+(lf*rf);
                }
            }
            if(s.charAt(k)=='|'){
                if(isTrue){
                    ans=ans+(lt*rf)+(lf*rt)+(lt*rt);
                }
                else{
                    ans=ans+(lf*rf);
                }
            }
            else{

                if(isTrue){

                    ans=ans+(lt*rf)+(lf*rt);
                }
                else{
                    ans=ans+(lt*rt)+(lf*rf);
                }
            }
        }
        return ans;
    }
    static  int solve(String s,int i,int j,boolean isTrue,int [][][]dp){
        if(i>j){
            return 0;
        }
        if(i==j){
            if(isTrue && s.charAt(i)=='T'){
                return  1;
            }
            else if(!isTrue && s.charAt(i)=='F'){
                return 1;
            }
            return 0;
        }
        if(dp[i][j][isTrue?1:0]!=-1){
            return dp[i][j][isTrue?1:0];
        }
        int ans=0;
        for(int k=i+1;k<j;k=k+2){
            int lt=solve(s,i,k-1,true,dp);
            int lf=solve(s,i,k-1,false,dp);
            int rt=solve(s,k+1,j,true,dp);
            int rf=solve(s,k+1,j,false,dp);

            // int lt=0;
            // if(dp[i][k-1][1]!=-1){
            //     lt=dp[i][k-1][1];
            // }
            // else{
            //     lt=solve(s,i,k-1,true,dp);
            //   // dp[i][k-1][1]=lt;
            // }

            // int lf=0;
            // if(dp[i][k-1][0]!=-1){
            //     lf=dp[i][k-1][0];
            // }
            // else{
            //     lf=solve(s,i,k-1,false,dp);
            //   //  dp[i][k-1][0]=lf;
            // }


            // int rt=0;
            // if(dp[k+1][j][1]!=-1){
            //     rt=dp[k+1][j][1];
            // }
            // else{
            //     rt=solve(s,k+1,j,true,dp);
            //   // dp[k+1][j][1]=rt;
            // }


            // int rf=0;
            // if(dp[k+1][j][0]!=-1){
            //     rf=dp[k+1][j][0];
            // }
            // else{
            //     rf=solve(s,k+1,j,false,dp);
            //  //   dp[k+1][j][0]=rf;
            // }

//            int lt=solve(s,i,k-1,true,dp);
//            int lf=solve(s,i,k-1,false,dp);
//            int rt=solve(s,k+1,j,true,dp);
//            int rf=solve(s,k+1,j,false,dp);

//  int lt = dp[i][k - 1][1] != -1 ? dp[i][k - 1][1] : solve(s, i, k - 1, true, dp);
//         int lf = dp[i][k - 1][0] != -1 ? dp[i][k - 1][0] : solve(s, i, k - 1, false, dp);
//         int rt = dp[k + 1][j][1] != -1 ? dp[k + 1][j][1] : solve(s, k + 1, j, true, dp);
//         int rf = dp[k + 1][j][0] != -1 ? dp[k + 1][j][0] : solve(s, k + 1, j, false, dp);
            if(s.charAt(k)=='&'){
                if (isTrue) {
                    ans=ans+(lt*rt);
                }
                else{
                    ans=ans+(lt*rf)+(lf*rt)+(lf*rf);
                }
            }
            if(s.charAt(k)=='|'){
                if(isTrue){
                    ans=ans+(lt*rf)+(lf*rt)+(lt*rt);
                }
                else{
                    ans=ans+(lf*rf);
                }
            }
            else if(s.charAt(k)=='^'){

                if(isTrue){

                    ans=ans+(lt*rf)+(lf*rt);
                }
                else{
                    ans=ans+(lt*rt)+(lf*rf);
                }
            }
        }
        return dp[i][j][isTrue?1:0]=ans;
    }





}
