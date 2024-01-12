package linearsearch;

public class findmaxandmin {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
    static int max(int [] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        } return max;
    }
    static int min(int [] arr) {
        int min=arr[0];
       for(int i:arr) {
           if(i<min) { min=i;
        }
    }return min;
} }
