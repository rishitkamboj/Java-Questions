package December.arrays.medium;

public class maximumsubArray {


    // method 1 generate all subarrays and find sum of individual elements
    // method 2 if the sum is negative drop it

    int maxSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int sI=-1;
        int eI=-1;
        int ans=-1;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
               ans=i;
            }
            if(sum>max){
              max=sum;
              sI=ans;
              eI=i;
            }

            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
