package recursionEASY;

public class count2 {
    public static void main(String[] args) {
        System.out.println(count(120));


    }
   static  int count(int n)
   {
       return helper(n,0);
   }

    static int helper(int n,int c) {
        if(n==0) { return c;}
        c++;
        return helper(n/10,c);

    }
}
