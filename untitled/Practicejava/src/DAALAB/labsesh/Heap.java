package DAALAB.labsesh;

public class Heap {
    int arr[];
    int n;

    Heap() {
        arr = new int[100];
        n=0;
    }



    int parent(int i){
        return i-1/2;
    }
    int left(int i){
        return 2*i+1;
    }
    int right(int i){
        return 2*i+2;
    }

    void insert(int el){
        if(n==100){
            System.out.println("Heap full");
            return;
        }
        arr[n++]=el;
        upheap(n-1);
    }
    void upheap(int i){
        if(i==0){
            return;
        }
        int parent=parent(i);
        if(arr[parent]<arr[i]){
            int temp=arr[i];
            arr[i]=arr[parent];
            arr[parent]=temp;
            upheap(parent);
        }
    }
    int delete(){
        if(n==0){
            System.out.println("Heap empty");
            return -1;
        }
        int rem=arr[0];
        arr[0]=arr[n-1];
        n--;
        downheap(0);
        return rem;
    }

    void downheap(int i){
        if(i==n){
            return;
        }
        int temp=i;
        int left=left(i);
        int right=right(i);
        if(left<n && arr[left]<arr[i]){
            temp=arr[left];
        }
        if(right<n && arr[right]<arr[i]){
            temp=arr[right];
        }
        if(temp!=i){
            int el=arr[i];
            arr[i]=arr[temp];
            arr[temp]=el;
            downheap(temp);
        }
    }

}
