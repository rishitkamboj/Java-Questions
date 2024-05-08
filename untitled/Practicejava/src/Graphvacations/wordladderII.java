package Graphvacations;

import OOPS.lecture4.A;

import java.util.*;

public class wordladderII {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
          Set<String> set = new HashSet<>();
        set.addAll(wordList);
        Queue<ArrayList<String>> queue = new LinkedList<>();
        ArrayList<String> ls = new ArrayList<>();
        ls.add(beginWord);
        queue.add(ls);
        ArrayList<String> usedonlevel = new ArrayList<>();
       List<List<String>> result = new ArrayList<>();
int level=0;
        while (!queue.isEmpty()) {
            ArrayList<String> vector = queue.poll();
            if(vector.size()>level){
                level++;
                for(String word : usedonlevel){
                    set.remove(word);
                }
            }
            String word=vector.get(vector.size()-1);
            if(word.equals(endWord)){
                if(result.size()==0){
                    result.add(vector);
                }
                else if(result.get(0).size()==vector.size()){
                    result.add(vector);
                }
                for(int i=0;i<word.length();i++){
                    for(char c='a';c<='z';c++){
                        char replac[]=word.toCharArray();
                        replac[i]=c;
                        String newword=new String(replac);
                        if(set.contains(newword)){
                            vector.add(newword);
                            ArrayList<String> temp=new ArrayList<>(vector);
                            queue.add(temp);
                            usedonlevel.add(newword);
                            vector.remove(vector.size()-1);
                        }
                    }
                }
            }
        }

return result;

    }
}
