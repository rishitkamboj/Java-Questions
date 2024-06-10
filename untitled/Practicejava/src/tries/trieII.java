package tries;


class Node2{
    Node2 links[]=new Node2[26];
    int cEnd=0;
    int cPref=0;

    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }

    Node2 get(char ch){
        return links[ch-'a'];
    }
    void put(char ch,Node2 node)
    {
        links[ch-'a']=node;
    }
    void increaseEnd(){
        cEnd++;
    }
    void increasePref(){
        cPref++;
    }
    void deleteEnd(){
        cEnd--;
    }
    void deletePref(){
        cPref--;
    }
    int getEnd(){
        return cEnd;
    }
    int getPref(){
        return cPref;
    }

}




public class trieII {
    Node2 root;

    trieII(){
        root=new Node2();
    }
    void insert(String s){
        Node2 n=root;
        for(int i=0;i<s.length();i++){
            if(!n.containsKey(s.charAt(i)))
            {
                n.put(s.charAt(i),new Node2());
            }
            n=n.get(s.charAt(i));
            n.increasePref();
        }
       n.increaseEnd();
    }

    int countWordsEqualTo(String s){
        Node2 n=root;
        for(int i=0;i<s.length();i++){
            if(n.containsKey(s.charAt(i))){
                n=n.get(s.charAt(i));
            }
            else{
                return 0;
            }
        }
        return n.getEnd();
    }


    int countWordsStartingWith(String s){
        Node2 n=root;
        for(int i=0;i<s.length();i++){
            if(n.containsKey(s.charAt(i))){
                n=n.get(s.charAt(i));
            }
            else{
                return 0;
            }
        }
        return n.getPref();
    }

    void erase(String s){
        Node2 n=root;
        for(int i=0;i<s.length();i++){
            if(n.containsKey(s.charAt(i))){
                n=n.get(s.charAt(i));
                n.deletePref();
            }
            else{
                return;
            }
        }
        n.deleteEnd();
    }
}
