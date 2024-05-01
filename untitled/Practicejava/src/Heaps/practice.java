package Heaps;

public class practice {
    public static void main(String[] args) {
        Heaps heap = new Heaps();
        heap.insert(2);
        heap.insert(3);
        heap.insert(1);
        heap.insert(-1);
        System.out.println(heap.remove());
        heap.arr[0]=5;
        System.out.println(heap.minheapcheck(0));
    }
}

class Heaps{
    int arr[];
    int n;

    Heaps(){
        arr=new int[100];
        n=0;
    }


     void insert(int x){
        if(n==arr.length-1){
            System.out.println("Cant insert more elements");
            return;
        }
        arr[n++]=x;
        upheap(n-1);
     }
     void upheap(int n){
        if(n==0){
            return;
        }
        int parent=(n-1)/2;
        if(arr[parent]>arr[n]){
          swap(parent,n);
            upheap(parent);
        }

     }

     int remove(){
        if(n==0){
            System.out.println("No elements in heap");
            return -1;
        }
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=0;
        n--;
        downheap(0);

        return temp;
     }
     void downheap(int i){
        if(i==n-1){
            return;
        }
        int min=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]<arr[i]){
         min=left;
        }
        if(right<n && arr[right]<arr[min]){
            min=right;
        }
        if(min!=i){
           swap(min,i);
           downheap(min);
        }
     }
     void swap(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
     }


     boolean minheapcheck(int root){
         if (root < 0  || root==arr.length-1) {
             return false;
         }

       int left=2*root+1;
         int right=2*root+2;

         if(arr[left]<arr[root] || arr[right]<arr[root]){
             return false;
         }


          minheapcheck(left) ;
     minheapcheck(right);
     return true;

     }

     void maxify(int root){
        if(root==n-1){
            return;
        }
        int largest=root;
        int left=2*root+1;
        int right=2*root+2;
        if(left<n && arr[left]>arr[root]){
            largest=left;
        }
        if(right<n && arr[right]>arr[root]){
            largest=right;
        }
        if(largest!=root){
            swap(largest,root);
            maxify(largest);
        }
     }
     void convert(){
        for(int i=(n-2)/2;i>=0;i--){
            maxify(i);
        }
     }



}
