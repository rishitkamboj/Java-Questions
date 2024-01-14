package LeetCode_questions;

import java.util.Arrays;

public class twostringsareclose1657 {
    public static void main(String[] args) {

    }
    public boolean closeStrings(String word1, String word2) {
        int []hash1=new int[26];
        int []hash2=new int[26];

        for(int i=0;i<word1.length();i++){
           hash1[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            hash2[word2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(hash1[i]==0 && hash2[i]!=0){
                return false;
            }
            if(hash2[i]==0 && hash1[i]!=0){
                return false;
            }
        }
        Arrays.sort(hash1);
        Arrays.sort(hash2);


        return Arrays.equals(hash1, hash2);
    }
}
