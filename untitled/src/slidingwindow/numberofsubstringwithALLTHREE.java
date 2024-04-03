package slidingwindow;

public class numberofsubstringwithALLTHREE {
    public int numberOfSubstrings(String s) {
        int hash[] = new int[3];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = -1;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] = i;
            if (hash[0] != -1 && hash[1] != -1 && hash[2] != -1) {
                int minIndex = Math.min(hash[0], Math.min(hash[1], hash[2]));
                count += minIndex + 1;
            }

        }
        return count;
    }
}
