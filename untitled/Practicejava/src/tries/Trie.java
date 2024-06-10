package tries;

class Node{
    Node links[]=new Node[26];
    boolean flag=false;

    Node(){

    }

    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    void put(char ch,Node node){
        links[ch-'a']=node;
    }
    Node get(char ch){
        return links[ch-'a'];
    }

   void setEnd(){
        flag=true;
    }
    boolean isEnd(){
        return flag;
    }

}











public class Trie {
    private Node root;

    Trie(){
        root = new Node();
    }

  // O(N)
    void insert(String word){
        Node n=root;
        for(int i=0;i<word.length();i++){
            if(!n.containsKey(word.charAt(i))){
                 n.put(word.charAt(i),new Node());
            }
            //moves to the reference trie
            n=n.get(word.charAt(i));
        }
        n.setEnd();
    }

    boolean search(String word){
        Node n=root;
        for(int i=0;i<word.length();i++){
            if(!n.containsKey(word.charAt(i))){
                return false;
            }
            n=n.get(word.charAt(i));
        }
        if(n.isEnd()){
            return true;
        }
        return false;
    }

    boolean startsWith(String prefix){
        Node n=root;
        for(int i=0;i<prefix.length();i++){
            if(!n.containsKey(prefix.charAt(i))){
                return false;
            }
            n=n.get(prefix.charAt(i));
        }
        return true;
        }


}
