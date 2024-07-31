package striverAtoZ.BINARYSEARCH.on1DARRAYS;


import java.util.Arrays;

public class firstlastoccurence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstLast(new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(firstLast2(new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5}, 2)));

    }



    public static int[] firstLast(int arr[],int x){
        int first=-1;
        int last=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                first=i;
                break;
            }
        }
        if(first==-1){
            return new int[]{-1,-1};
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x){
                last=i;
                break;
            }
        }
        return new int[]{first,last};
    }

    public static int[] firstLast2(int arr[],int x){
        int first=-1;
        int last=-1;
        int n=arr.length;

        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                first=mid;
                e=mid-1;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(first==-1){
            return new int[]{-1,-1};
        }
        s=0;
        e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
               last=mid;
               s=mid+1;
            }
            else if(arr[mid]>x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return new int[]{first,last};
    }
    // count no of occurense is last-first+1

}
