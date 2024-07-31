package striverAtoZ.BINARYSEARCH.on1DARRAYS;

public class minimuminSorted {
    public static void main(String[] args) {
        System.out.println(minimum(new int[]{4,5,6,7,0,1,2}));
    }

    // index of the minimum element is the number of times arrays has been rotated
    public static int minimum(int arr[]){
        int min=Integer.MAX_VALUE;
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[s]<arr[e]){
                min=Math.min(arr[s],min);
                break;
            }
            if(arr[s]<arr[mid]){
                min=Math.min(arr[s],min);
                s=mid+1;
            }
            else{
                min=Math.min(arr[mid],min);
                e=mid-1;
            }
        }
        return min;

    }
}
