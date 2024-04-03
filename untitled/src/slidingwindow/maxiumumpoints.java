package slidingwindow;

public class maxiumumpoints {

    public int maxpoints(int arr[],int k){
        int l=0;
        int r=0;
        int max=0;

        for (int i = 0; i < k; i++) {
            l+=arr[i];
        }
        max=l;
        int right=arr.length-1;
        for(int i=k-1;k>=0;k--){
            l-=arr[i];
            r+=arr[right--];
            max=Math.max(l+r,max);
        }
        return max;
    }
}
