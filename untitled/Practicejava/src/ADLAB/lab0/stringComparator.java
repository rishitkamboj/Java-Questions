package ADLAB.lab0;

public class stringComparator {
    public static void main(String[] args) {
        System.out.println(StringCompare("aba","ab"));
    }

    public static  int StringCompare(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }
        }
        if(i==str1.length() && j==str2.length()){
            return 0;
        }
        if(str1.length()<str2.length()){
            return -1;
        }
        return 1;
    }

    public int stringCompare(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int len = Math.min(len1, len2);

        for (int i = 0; i < len; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }

}
