package Graphvacations;

import java.util.*;

class PairP
{
    String first;
    int second;

    PairP(String first, int second){
        this.first = first;
        this.second = second;
    }
}

public class wordladder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<PairP> queue = new LinkedList<>();
        queue.add(new PairP(beginWord,1));
        Set<String> set = new HashSet<>();
        for(String word : wordList){
            set.add(word);
        }
        set.remove(beginWord);
while(!queue.isEmpty()){
    PairP pair = queue.remove();
    String word = pair.first;
    int length = pair.second;
    if(word.equals(endWord)){return length;}
    for(int i=0;i<word.length();i++){
        for(char ch = 'a'; ch <= 'z'; ch++){
            char replacedarr[]=word.toCharArray();
            replacedarr[i]=ch;
            String replace=new String(replacedarr);
            if(set.contains(replace)){
                set.remove(replace);
                queue.add(new PairP(word,length+1));
            }
        }
    }
}
return 0;
    }
}
