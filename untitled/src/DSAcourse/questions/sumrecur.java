package DSAcourse.questions;

public class sumrecur {
    public static void main(String[] args) {
        System.out.println("Sum of first 10 integers "+sum(10));
    }
    static long sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
