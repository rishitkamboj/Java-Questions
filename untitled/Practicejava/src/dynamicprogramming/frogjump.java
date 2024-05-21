//package dynamicprogramming;
//
//public class frogjump {
//    public int minimumEnergy(int arr[],int N){
//        int dp[]=new int[N+1];
//        Arrays.fill(dp,-1);
//return min(arr,N-1,dp);
//    }
//    int min(int arr[],int N,int dp[]){
//        if(N==0){
//            return 0;
//        }
//        if(dp[N]!=-1){
//            return dp[N];
//        }
//        int left=min(arr,N-1,dp)+Math.abs(arr[N]-arr[N-1]);
//        int right=Integer.MAX_VALUE;
//        if(N>1){
//             right=min(arr,N-2,dp)+Math.abs(arr[N]-arr[N-2]);
//        }
//        return dp[N]=Math.min(left,right);
//    }
//
//    int min2(int arr[],int N){
//                 int dp[]=new int[N];
//                 dp[0]=0;
//
//                 for(int i=1;i<N;i++){
//                     int first=dp[i-1]+Math.abs(arr[i-1]-arr[i]);
//                     int second=Integer.MAX_VALUE;
//                     if(i>1){
//                         second=dp[i-2]+Math.abs(arr[i-2]-arr[i]);
//                     }
//                     dp[i]=Math.min(first,second);
//                 }
//                 return dp[N-1];
//    }
//    int min23(int arr[],int N){
//      int prev=0;
//      int prev2=0;
//      for(int i=1;i<N;i++){
//          int first=prev+Math.abs(arr[i-1]-arr[i]);
//          int second=Integer.MAX_VALUE;
//          if(i>1){
//              second=prev2+Math.abs(arr[i-2]-arr[i]);
//          }
//          int cur=Math.min(first,second);
//          prev2=prev;
//          prev=cur;
//      }
//      return prev;
//    }
//
//    }
//}
