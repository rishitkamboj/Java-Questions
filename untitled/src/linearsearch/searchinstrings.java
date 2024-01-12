package linearsearch;

public class searchinstrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
        System.out.println(search2(name, target));

    }

    static boolean search(String str, char ch) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                return true;
            }

        }
        return false;
    }

    static boolean search2(String given, char ch) {
        if (given.length() == 0) {
            return false;
        }
        for (char s : given.toCharArray()) {
            if (s == ch) {
                return true;
            }
        }
        return false;
    }
}