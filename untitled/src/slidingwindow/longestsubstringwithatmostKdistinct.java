package slidingwindow;

import java.util.HashMap;

public class longestsubstringwithatmostKdistinct
{


        public static int kDistinctChars(int k, String s) {

            HashMap<Character, Integer> mpp = new HashMap<>();

            int r = 0;
            int l = 0;
            int max = 0;

            while (r < s.length()) {
                mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);

                while (mpp.size() > k) {
                    mpp.put(s.charAt(l), mpp.get(s.charAt(l)) - 1);
                    if (mpp.get(s.charAt(l)) == 0) {
                        mpp.remove(s.charAt(l));
                    }
                    l++;
                }

                    max = Math.max(r - l + 1, max);

                r++;
            }
            return max;

        }
}
