package leetcodesques;

public class stringprefix2000 {
    public static String reversePrefix(String word, char ch) {
        if(word.equals("")){
            return word;
        }
        int length=word.length();
        int index=word.indexOf(ch);
       StringBuilder sb=new StringBuilder();
       sb.append(word.substring(0,(index+1)));
       sb.reverse();
       sb.append(word, (index+1), length);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }
}
