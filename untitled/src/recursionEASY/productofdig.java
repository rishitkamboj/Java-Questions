package recursionEASY;

public class productofdig {
    public static void main(String[] args) {
        System.out.println(proddig(123));
    }
    static int proddig(int n){
        if(n<10){
            return n;
        }
        return proddig(n/10)*proddig(n%10);
    }
}
