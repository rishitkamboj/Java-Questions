package ADLAB.lab0;

public class checkPalin {
    public static void main(String[] args) {
        System.out.println("IS string abba a palindrome= "+isPalindrome("abba"));
    }



    static boolean isPalindrome(String x) {
        String y=reverseString(x);

        return y.equals(x);
    }

    static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}