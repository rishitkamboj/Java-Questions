package leetcodesques;

import java.util.HashSet;

public class intersectionofarray349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> un = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();

        for (int i : nums1) {
            un.add(i);
        }
        for (int i : nums2) {
            if (un.contains(i)) {
                inter.add(i);
            }
        }
        int ans[] = new int[inter.size()];
        int i = 0;
        for (Integer num : inter) {
            ans[i++] = num;
        }

        return ans;

    }
}