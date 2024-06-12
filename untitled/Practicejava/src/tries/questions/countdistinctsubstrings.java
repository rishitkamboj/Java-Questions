package tries.questions;


class Nodes{
    Nodes[] links=new Nodes[26];
//    boolean flag=false;

    boolean containsKey(char ch){
        return links[ch-'a']!=null;
    }
    void put(char ch,Nodes n){
        links[ch-'a']=n;
    }
    Nodes get(char ch){
        return links[ch-'a'];
    }

}





public class countdistinctsubstrings {

    public static int countDistinctSubstrings(String s)
    {
                 int count=0;
                 Nodes root=new Nodes();
                 for(int i=0;i<s.length();i++){
                     Nodes n=root;
                     for(int j=i;j<s.length();j++){
                         if(!n.containsKey(s.charAt(j))){
                             count++;
                             n.put(s.charAt(j),new Nodes());
                         }
                         n=n.get(s.charAt(j));
                     }
                 }
                 return count;
    }
}
