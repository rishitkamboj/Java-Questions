package LeetCode_questions;

import java.util.HashMap;
import java.util.Map;

public class customsortstring791 {

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


public static String customSortString2(String order, String s) {
    int[] map = new int[26];
    for (int i = 0; i < s.length(); i++) {
        map[s.charAt(i) - 'a']++;
    }
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < order.length(); i++) {
        for (int j = 0; j < map[order.charAt(i) - 'a']; j++) {
            result.append(order.charAt(i));
        }
        map[order.charAt(i) - 'a'] = 0;
    }

    for (int i = 0; i < 26; i++) {
        for (int j = 0; j < map[i]; j++) {
            result.append((char) ('a' + i));
        }
    }

    return result.toString();
}}










