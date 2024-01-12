package strivercourse.binarysearch;

public class minimuminrotatedsortedArray {
    public static void main(String[] args) {

    }

    static int MINinSORTED(int arr[]){
        int s=0,e=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[s]<=arr[e]){
                ans=Math.min(ans,arr[s]);
                break;
            }
            if(arr[s]<=arr[mid]){
                ans=Math.min(ans,arr[s]);
                s=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                e=mid-1;
            }


        }    return ans;
    }



    static int timesarrayisrotated(int arr[]){
        int s=0,e=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(arr[s]<=arr[e]){

                if(arr[s]<ans){
                    index=s;
                    ans=arr[s];}

                break;
            }
            if(arr[s]<=arr[mid]){
                if(arr[s]<ans){
                    index=s;
                    ans=arr[s];}

                s=mid+1;
            }
            else{

                if(arr[mid]<ans){
                    index=mid;
                    ans=arr[mid];}
                e=mid-1;
            }


        }    return index;
    }

}
