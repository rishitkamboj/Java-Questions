package recursionEASY;

import java.util.Random;

public class reversenum2 {
    public static void main(String[] args) {
//        System.out.println(re2(123));
        Random r=new Random();
        int n=r.nextInt();
        n%=10;
        Math.abs(n+=1);

        System.out.println(n);
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
    // sometimes you might need some additional variables in the
    // argument, then just make another function
}
