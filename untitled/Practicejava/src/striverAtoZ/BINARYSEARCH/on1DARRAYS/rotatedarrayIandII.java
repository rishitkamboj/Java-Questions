package striverAtoZ.BINARYSEARCH.on1DARRAYS;

import org.w3c.dom.ls.LSOutput;

public class rotatedarrayIandII {
    public static void main(String[] args) {
        System.out.println(rotatedArrayI(new int[]{7,8,9,1,2,3,4,5,6},1));
    }

    public static int rotatedArrayI(int arr[],int x){
        int s=0;
        int n=arr.length;
        int e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                return mid;
            }
            if (arr[s]<=arr[mid]) {
                if(arr[s]>=x && arr[mid]<=x){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(arr[mid]<=x && arr[e]>=e){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }

    public static int rotatedArrayII(int arr[],int x){
        int s=0;
        int n=arr.length;
        int e=n-1;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[s]==arr[mid] && arr[e]==arr[mid]){
                s++;
                e--;
                continue;
            }
            if (arr[s]<=arr[mid]) {
                if(arr[s]>=x && arr[mid]<=x){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            else{
                if(arr[mid]<=x && arr[e]>=e){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }
            }
        }
        return -1;
    }
}
