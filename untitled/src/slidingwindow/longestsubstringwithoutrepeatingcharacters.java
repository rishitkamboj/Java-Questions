package slidingwindow;

public class longestsubstringwithoutrepeatingcharacters {


    public int longest(String s){
        int l=0;
        int r=0;
        int max=0;
        int hash[]=new int[256];
        for(int i=0;i<hash.length;i++){
            hash[i]=-1;
        }

        while(r<s.length()){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            max=Math.max(max,r-l+1);
            hash[s.charAt(r)]=r;
            r++;
        }
        return max;
    }
}
