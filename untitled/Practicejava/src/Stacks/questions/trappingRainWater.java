package Stacks.questions;

public class trappingRainWater {
    int method1(int arr[]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int j=i;
            int left=0;
            int right=0;

            while(j>=0){
                left=Math.max(left,arr[j]);
                j--;
            }
            j=i;
            while(j<n){
                right=Math.max(right,arr[j]);
                j++;
            }
            sum+=Math.min(left,right)-arr[i];
        }
        return sum;
    }
    int method2(int arr[]){
       int n=arr.length;
       int sum=0;
       int prefix[]=new int[n];
       prefix[0]=arr[0];
       for(int i=1;i<n;i++){
           prefix[i]=Math.max(prefix[i-1],arr[i]);
       }
       int suffix[]=new int[n];
       suffix[n-1]=arr[n-1];
       for(int i=n-2;i>=0;i--){
           suffix[i]=Math.max(suffix[i+1],arr[i]);
       }
       for(int i=0;i<n;i++){
            sum+=Math.min(prefix[i],suffix[i])-arr[i];
       }
       return sum;
    }

    int method3(int arr[]){
       int n=arr.length;
       int sum=0;
       int left=arr[0];
       int right=arr[n-1];
       int i=0;
       int j=n-1;
       while(i<j){
           if(left<=right){
               sum+=left-arr[i];
               i++;
               left=Math.max(left,arr[i]);
           }
           else{
               sum+=right-arr[i];
               j--;
               right=Math.max(right,arr[j]);
           }
       }
       return sum;
    }
}
