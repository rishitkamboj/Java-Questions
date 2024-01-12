package linearsearch;

public class linearsearch {
    public static void main(String[] args) {
 int[] nums={2,3,4,5,6,7,9,10};
 int target =3;
        System.out.println(linearSearch(nums,target));
    }
  // search in the array: if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr,int target) {
        if(arr.length==0) { return -1;}
        for(int i=0;i<arr.length;i++) {
           //check for element at every index
           int element=arr[i];
           if(element==target) { return i;}

        }
        return -1;
    }
}
