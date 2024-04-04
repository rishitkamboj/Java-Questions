package slidingwindow;

public class minimumsubstring {
    public String minWindow(String s, String t) {
        int l=0;
        int r=0;
        int count=0;
        int minLen=Integer.MAX_VALUE;
        int sIndex=-1;

        int hash[]=new int[256];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }
        while(r<s.length()){
            if(hash[s.charAt(r)]>0){
                count++;
            }
            hash[s.charAt(r)]--;

            while(count==t.length()){
                if((r-l+1)<minLen){
                    minLen=(r-l+1);
                    sIndex=l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            r++;
        }
        return sIndex==-1?"":s.substring(sIndex,sIndex+minLen);
    }
}
