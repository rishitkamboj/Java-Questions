package slidingwindow;

import java.util.HashMap;

public class subarrayswithkdifferentinteger {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return help(nums, k) - help(nums, k - 1);
    }

    public int help(int[] nums, int k) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int l = 0;
        int r = 0;
        int count = 0;
        while (r < nums.length) {
            mpp.put(nums[r], mpp.getOrDefault(nums[r], 0) + 1);

            while (mpp.size() > k) {
                mpp.put(nums[l], mpp.get(nums[l]) - 1);
                if (mpp.get(nums[l]) == 0) {
                    mpp.remove(nums[l]);
                }
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}
