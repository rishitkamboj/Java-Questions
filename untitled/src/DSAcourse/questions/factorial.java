package DSAcourse.questions;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = "+fact(5));
    }
    static long fact(int n){
        if(n<1){
            return 1;
        }
        return n*fact(n-1);
    }
}
