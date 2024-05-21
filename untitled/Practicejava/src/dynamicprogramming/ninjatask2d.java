package dynamicprogramming;
import java.util.*;

public class ninjatask2d {
    public int maximumPoints(int points[][],int N){
 int dp[][]=new int[N][4];
 for(int i=0;i<N;i++){
     Arrays.fill(dp[i],-1);
 }
return 1;
    }



    public int day(int points[][],int N){
        int dp[][]=new int[N][4];

    dp[0][0]=Math.max(points[0][1],points[0][2]);
    dp[0][1]=Math.max(points[0][0],points[0][2]);
    dp[0][2]=Math.max(points[0][1],points[0][0]);
    dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));

    for(int i=1;i<N;i++){
        for(int last=0;last<4;last++){
            dp[i][last]=0;
            int maxi=0;
            for(int j=0;j<3;j++){
                if(j!=last){
                    int point=points[i][j]+dp[i-1][j];
                    dp[i][last]=Math.max(dp[i][last],point);
                }
            }
        }
    }
return dp[N-1][3];

    }















    public int day(int day,int last,int points[][]){
        if(day==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    max=Math.max(max,points[day][i]);
                }
            }
            return max;
        }
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int task=points[day][i]+day(day-1,i,points);
max=Math.max(max,task);
            }
        }
        return max;
    }
    public int day(int day,int last,int points[][],int dp[][]){
        if(day==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    max=Math.max(max,points[day][i]);
                }
            }
            return max;
        }
        if(dp[day][last]!=-1){
            return dp[day][last];
        }
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int task=points[day][i]+day(day-1,i,points);
                max=Math.max(max,task);
            }
        }
        return dp[day][last]=max;
    }
}
