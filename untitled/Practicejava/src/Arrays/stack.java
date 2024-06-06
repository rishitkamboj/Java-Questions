package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class stack {
    public static String clearStars(String s) {
    Stack<Character> st = new Stack<Character>();
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '*') {
            st.pop();
        }
        else {
            st.push(s.charAt(i));
        }
    }
    StringBuilder sb = new StringBuilder();
    while (!st.isEmpty()) {
        sb.append(st.pop());
    }
return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(clearStars("aab*"));
    }
}
