package striverAtoZ.BINARYSEARCH.on1DARRAYS;

public class floor {

    public int floor(int arr[],int x){
        int ans=-1;
        int s=0;
        int e=arr.length-1;
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(arr[mid]<=x){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}
