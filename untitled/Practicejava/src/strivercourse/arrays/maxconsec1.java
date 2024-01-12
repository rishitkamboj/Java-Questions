package strivercourse.arrays;

public class maxconsec1     {
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,0,1,1,1,1};
        System.out.println(max1(arr));
    }
    static int max1(int arr[]){
int max=0,count=0;
        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]==0){
                count=0;
                continue;
            }
        if(arr[i]==1){
            count++;
        }
            if(max<count){
                max=count;
            }
        }
        return max;
    }
}
