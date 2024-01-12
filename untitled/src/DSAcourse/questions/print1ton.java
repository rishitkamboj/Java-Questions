package DSAcourse.questions;

public class print1ton {
    public static void main(String[] args) {
        pr1n(10);
    }
    static void pr1n(int n){
        if(n<1){
            return;
        }
// just put sout statement above it will print n to 1
        pr1n(n-1);
        System.out.print(n+" ");
    }
}
