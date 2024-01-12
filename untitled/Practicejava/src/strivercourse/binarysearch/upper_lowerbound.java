package strivercourse.binarysearch;

public class upper_lowerbound {
    public static void main(String[] args) {
int first=-1,last=-1;
        int arr[]={1,2,3,4,5,6,6,7,8,9};
        int tar=5;
    int lb=lower(arr,tar);
//    if((lb==arr.length) || (lb!=tar)){
//
//    }
        if(arr[lb]==tar){
            first=lb;
            last=lb;
        }

   last=upper(arr,tar)-1;


    }
















    static int lower(int arr[],int tar){
        int s=0;
        int e=arr.length-1;
        int n=arr.length;

        while(s<=e) {
            int mid=s+(e-s)/2;
           if(arr[mid]==tar){
               return mid;
           }
           else if(arr[mid]<tar){
               s=mid+1;
           }
           else{
               n=mid;
               e=mid-1;
           }}

return n;        }


   static int upper(int arr[],int tar){
        int s=0;
        int e=arr.length-1;
        int n=arr.length;

        while(s<=e) {
            int mid=s+(e-s)/2;

            if(arr[mid]>tar){
                n=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }}

        return n;        }
}





