package recursionarray;

public class linearsearch {
    public static void main(String[] args) {

    }
    static boolean linear(int []arr,int s,int target) {
        if(s==arr.length) {
            return false;
        }
            return arr[s]==target || linear(arr,s+1,target);
        }
    static int linear2(int []arr,int s,int target) {
        if(s==arr.length) {
            return -1;
        }
        if(arr[s]==target){
            return s;
        }
        return linear2(arr,s+1,target);
    }
}
