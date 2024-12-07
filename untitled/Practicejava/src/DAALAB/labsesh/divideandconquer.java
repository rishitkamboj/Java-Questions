package DAALAB.labsesh;

public class divideandconquer {


    int binarysearch(int s,int e,int arr[],int tar){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==tar){
            return mid;
        }
        else if(arr[mid]>tar){
            return binarysearch(s,mid-1,arr,tar);
        }
        return binarysearch(mid+1,e,arr,tar);
    }

    int ternarysearch(int s,int e,int arr[],int tar){
        if(s>e){
            return -1;
        }
        int mid1=s+(e-s)/3;
        int mid2=e-(e-s)/3;

        if(arr[mid1]==tar){
            return mid1;
        }
        else if(arr[mid2]==tar){
            return mid2;
        }
        else if(arr[mid1]>tar){
            return ternarysearch(s,mid1-1,arr,tar);
        }
        else if(arr[mid1]<tar && arr[mid2]>tar){
            return ternarysearch(mid1+1,mid2-1,arr,tar);
        }
        return ternarysearch(mid2+1,e,arr,tar);
    }

    void mergesort(int s,int e,int arr[]){
        if(s>e){
            return;
        }
        int mid=s+(e-s)/2;
        mergesort(s,mid,arr);
        mergesort(mid+1,e,arr);
        merge(s,mid,e,arr);
    }
    void merge(int s,int m,int e,int arr[]){
        int temp[]=new int[e-s+1];
        int i=0;
        int j=m=1;
        int k=0;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
            }
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=e){
            temp[k++]=arr[j++];
        }
        for(int l=0;l<k;l++){
            arr[l+s]=temp[l];
        }
    }


    void quicksort(int s,int e,int arr[]){
        if(s>e){
            return;
        }
        int pivot=quick(s,e,arr);
        quicksort(s,pivot-1,arr);
        quicksort(pivot+1,e,arr);
    }

    int quick(int s,int e,int arr[]){
      int i=s+1;
      // for HIGH i=s and j=e-1 key arr[e]
      int j=e;
      int key=arr[s];

      while(i<=j){
           while(i<=e && arr[i]<=key){
               i++;
           }
           while(j>=s && arr[j]>=key){
               j++;
           }

           if(i<j){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
      }

      // here i and e will be swapped and i will be returned
      int temp=arr[s];
      arr[s]=arr[j];
      arr[j]=temp;
      return j;

    }

    void insertionsort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
    }



}
