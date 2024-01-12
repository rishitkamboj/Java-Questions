package recursionEASY;

public class sumofdigits {
    public static void main(String[] args) {

        System.out.println(sumdig(123));

                }
     static int sumdig(int n){
        if(n<10){
            return n;
        }
        return sumdig(n/10)+sumdig(n%10);
     }
    }

