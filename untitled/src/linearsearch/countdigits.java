package linearsearch;

public class countdigits {
    public static void main(String[] args) {
        System.out.println(digits(123));
    }
    static int digits(int num) {
        String s=num+"";
        return s.length();
    }
}
