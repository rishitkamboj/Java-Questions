package slidingwindow;

public class longestsubstringwithkchanges
{

    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int hash[]=new int[26];
        int max=0;
        int freq=0;

        while(r<s.length()){
            hash[s.charAt(r)-'A']++;
            freq=Math.max(freq, hash[s.charAt(r)-'A']);
            while((r-l+1)-freq>k){
                hash[s.charAt(l)-'A']--;
                l++;
            }
            if((r-l+1)-freq<=k){
                max=Math.max(max,(r-l+1));
            }
            r++;
        }
        return max;
    }
}
