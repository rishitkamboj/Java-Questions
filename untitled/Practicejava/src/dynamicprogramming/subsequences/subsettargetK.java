package dynamicprogramming.subsequences;

public class subsettargetK {

    static boolean subset(int index,int target,int[]arr){
        if(target==0){
            return true;
        }
        if(index==0){
            return arr[0]==target;
        }
         boolean notTaken=subset(index-1,target,arr);
        boolean taken=false;
        if(arr[index]<=target){
            taken=subset(index-1,target-arr[index],arr);
        }
        return notTaken||taken;
    }
    static boolean subset(int index,int target,int[]arr,int[][]dp){
        if(target==0){
            return true;
        }
        if(index==0){
            return arr[0]==target;
        }
        if(dp[index][target]!=-1){
            return dp[index][target]==1;
        }
        boolean notTaken=subset(index-1,target,arr);
        boolean taken=false;
        if(arr[index]<=target){
            taken=subset(index-1,target-arr[index],arr);
        }
        dp[index][target]=notTaken||taken?1:0;
        return notTaken||taken;
    }

    boolean subsettabul(int n,int k,int arr[]){
        boolean dp[][]=new boolean[n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(arr[0]<=k){
            dp[0][arr[0]]=true;
        }
        for(int ind=1;ind<n;ind++){
            for(int tar=1;tar<=k;tar++){
                boolean notTaken=dp[ind-1][tar];
                boolean taken=false;
                if(arr[ind]<=tar){
                    taken=dp[ind-1][tar-arr[ind]];
                }
                dp[ind][tar]=notTaken||taken;
            }
        }
        return dp[n-1][k];
    }


}
