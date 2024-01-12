package DSAcourse.questions;

public class back1ton {
    public static void main(String[] args) {
        System.out.println("Fibo of 4th term is "+fibo(4));
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
