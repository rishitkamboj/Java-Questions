package recursionEASY;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palin(1231));
    }
    static boolean palin(int n ){
        return
                (n==re2(n));
    }
    static int re2(int n) {
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n<10){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);

    }
}
