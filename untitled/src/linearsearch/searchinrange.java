package linearsearch;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr={18,12,-7,3,14,28};
        int target=14;
        int start=1,end=4;
        System.out.println(linearSearch(arr,target,start,end));
    }

    static int linearSearch(int[] arr,int target, int start,int end) {
        if(arr.length==0) { return -1;}
        for(int i=start;i<=end;i++) {
            //check for element at every index
            int element=arr[i];
            if(element==target) { return i;}

        }
        return -1;
    }
}
