package tries.questions;

class Node{
    Node links[]=new Node[26];
    boolean flag;

    Node(){

    }

    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    void put(char ch,Node n){
        links[ch-'a']=n;
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

class Trie{
    Node root;

    Trie(){
        root = new Node();
    }
    void insert(String word){
        Node n=root;

        for(int i=0;i<word.length();i++){
            if(!n.containsKey(word.charAt(i))){
                n.put(word.charAt(i),new Node());
            }
            n=n.get(word.charAt(i));
        }
        n.setEnd();
    }

   boolean checkPrefix(String s){
        Node n=root;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(n.containsKey(s.charAt(i))){
                n=n.get(s.charAt(i));
                if(!n.isEnd()){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
   }

}







public class completeString {

    public static String completeString(int n, String[] a) {
       Trie trie=new Trie();
       for(String s:a){
           trie.insert(s);
       }
       String longest="";

       for(String s:a){
           if(trie.checkPrefix(s)){
               if(s.length()>longest.length()){
                   longest=s;
               }

           else if(s.length()==longest.length() && s.compareTo(longest)<0){
longest=s;
           }}
       }




   if(longest==""){
       return "None";
   }
   return longest;
    }
}
