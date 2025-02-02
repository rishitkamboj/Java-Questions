package December.arrays.medium;

public class nextPermu {
    public void nextPermutation(int[] arr) {
        int index=-1;

        int n=arr.length;

        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            rev(arr,0,n-1);
            return;
        }


        for(int i=n-1;i>index;i--){
            if(arr[i]>arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        rev(arr,index+1,n-1);
    }
    public void rev(int arr[],int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
