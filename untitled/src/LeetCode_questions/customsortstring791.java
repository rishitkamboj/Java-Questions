package LeetCode_questions;

import java.util.HashMap;

public class customsortstring791 {
}
public static String customSortString(String order, String s) {
    StringBuilder a=new StringBuilder();
    HashMap<Character,Integer> mp=new HashMap<>();
    for(char ch:s.toCharArray()){
        mp.put(ch,mp.getOrDefault(ch,0)+1);
    }
    for(char ch: order.toCharArray()){
        if(mp.containsKey(ch)){
            int c=mp.get(ch);
            while(c>0){
                a.append(ch);
                c--;
            }
            mp.remove(ch);
        }
    }


    for (Map.Entry<Character, Integer> e : mp.entrySet()) {
        char c = e.getKey();
        int count = e.getValue();
        while (count > 0) {
            a.append(c);
            count--;
        }
    }


    return a.toString();

}