package DAALAB.Lab8;

public class minmax {
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;

    public static void minmaxx(int s,int e,int arr[]){
        if(s==e){
            max=min=arr[s];
            return;
        }
        else if(s==e-1){
            if(arr[s]<arr[e]){
                min=arr[s];
                max=arr[e];
                return;
            }
        }
        else{
            int mid=s+(e-s)/2;
            minmaxx(s,mid,arr);
            int min1=min;
            int max1=max;
            minmaxx(mid+1,e,arr);
            if(min1<min){
                min=min1;
            }
            if(max1>max){
                max=max1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,2,19,93,2,1};
        minmaxx(0,5,arr);
        System.out.println("Min ele is "+min+" Max ele is "+max);
    }
}
