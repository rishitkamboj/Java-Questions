package recursionpractice;

public class print5times {
    public static void main(String[] args) {

    }

   static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("HELLO");
        print(n-1);
    }
    static void onetoN(int n){
        if(n==0){
            return;
        }
        onetoN(n-1);
        System.out.println(n);
    }
    static void ntoone(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
       ntoone(n-1);

    }

   static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;
    }

    static int sumofdigits(int n){
        if(n<10){
            return n;
        }
        return sumofdigits(n/10)+(n%10);
    }



}
