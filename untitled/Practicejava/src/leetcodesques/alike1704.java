package leetcodesques;

import java.util.Locale;

public class alike1704 {
    public static void main(String[] args) {

    }
    public boolean halvesAreAlike(String s) {
        int c1=0;
        int c2=0;
        String str=s.toLowerCase();

        for (int i=0;i<s.length()/2;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                c1++;
            }
        }
        for (int i=s.length()/2;i<s.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                c2++;
            }
        }
        return c1==c2;
    }
}
