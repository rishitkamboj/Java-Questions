//class Noded{
//    Node links[]=new Node[2];
//
//    boolean containsKey(int bit){
//        return links[bit]!=null;
//    }
//    Node get(int bit){
//        return links[bit];
//    }
//    void put(int bit,Node node){
//        links[bit]=node;
//    }
//}
//class Tries{
//    Node root;
//    Tries(){
//        root = new Node();
//    }
//
//    void insert(int num){
//        Node n=root;
//        for(int i=31;i>=0;i--){
//            int bit=(num>>i)&1;
//            if(!n.containsKey(bit)){
//                n.put(bit,new Node());
//            }
//            n=n.get(bit);
//        }
//    }
//    int getMax(int num){
//        Node n=root;
//        int max=0;
//        for(int i=31;i>=0;i--){
//            int bit=(num>>i)&1;
//            if(n.containsKey(1-bit)){
//                max=max|(1<<i);
//                n=n.get(1-bit);
//            }
//            else{
//                n=n.get(bit);
//            }
//        }
//        return max;
//    }
//
//}
//
//
//
//
//
//class Solutions {
//    public int findMaximumXOR(int[] nums) {
//        Tries trie=new Tries();
//        for(int i:nums){
//            trie.insert(i);
//        }
//        int max=0;
//        for(int i:nums){
//            max=Math.max(max,trie.getMax(i));
//        }
//        return max;
//
//    }
//}