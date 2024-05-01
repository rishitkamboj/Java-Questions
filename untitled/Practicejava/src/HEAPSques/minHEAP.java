package HEAPSques;

public class minHEAP {

    int arr[];
    int n;

    minHEAP(){
        arr=new int[100];
        n=0;
    }

    void insert(int i){
        if(n==arr.length-1){
            System.out.println("Cant insert heap full");
        }
        arr[n++]=i;
        upheap(n-1);
    }
    void swap(int i,int j,int arr[]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void upheap(int i){
        if(i==0){
            return ;
        }
        int parent=(i-1)/2;
      if(arr[i]>arr[parent]){
          swap(i,parent,arr);
      }
      upheap(parent);
    }


    int remove(){
        int temp=arr[0];
        arr[0]=arr[n-1];
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
        else if(right<n && arr[right]<arr[i]){
            min=right;
        }
        if(min!=i){
            swap(min,i,arr);
            downheap(min);
        }
    }


    public static void main(String[] args) {
        minHEAP obj=new minHEAP();
        obj.insert(10);
        obj.insert(2);
        obj.insert(30);
        obj.insert(400);
        System.out.println(obj.remove());
    }

}
