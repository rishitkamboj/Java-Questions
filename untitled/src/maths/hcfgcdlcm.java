package maths;

public class hcfgcdlcm {
    public static void main(String[] args) {
        System.out.println("Hcf = " +hcf(2,4));
        System.out.println("LCM = " + lcm(2,7));
    }
    static int hcf(int a,int b) {
        if(a==0) {
            return b;
        }
        return hcf(b%a,a);
    }
    static int lcm(int a,int b ){
        return a*b/hcf(a,b);
    }
}
