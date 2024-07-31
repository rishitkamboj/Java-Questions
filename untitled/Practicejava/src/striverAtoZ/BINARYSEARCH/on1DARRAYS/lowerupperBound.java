package striverAtoZ.BINARYSEARCH.on1DARRAYS;

public class lowerupperBound {


    public int[] lowerUpper(int arr[],int tar){
        int upper=-1;
        int lower=-1;
        int s=0;
        int e=arr.length-1;
        //lower bound is the element greater than equal to the the tar

        //lower bound is only the insert position
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[mid]>=tar){
                lower=mid;
              e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        s=0;
        e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;


            if(arr[mid]>tar){
                upper=mid;
               e=mid-1;
            }
            else{

                s=mid+1;
            }
        }return new int[]{lower,upper};
    }
}
