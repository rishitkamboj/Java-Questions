package DSAcourse.questions;

public class countdigits {
    public static void main(String[] args) {
        System.out.println(count(1234));
    }
    static int count(int n){
        if(n<1){
            return 0;
        }
        return 1+count(n/10);
    }
}
