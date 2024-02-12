package oopslab;

/*
WAP in JAVA to create two arrays with some values init. Use a function call merge which receives two arrays from the main function,
 now in merge function it should merge both the arrays and display the result in ascending order

*/

public class mergearray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={5,6,7,8};
        merge(arr,arr2);



    }
    public static void merge(int arr1[],int arr2[]){
        int arr3[]=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else if(arr2[j]<arr1[i]){
                    arr3[k++]=arr2[j++];
                }
            else{
                arr3[k++]=arr1[i++];
                j++;
            }

            }
while(i<arr1.length){
    arr3[k++]=arr1[i++];
}
        while(j<arr2.length){
            arr3[k++]=arr2[j++];
        }


        for(int a:arr3){
            System.out.print(a+" ");
        }


        }
    }

