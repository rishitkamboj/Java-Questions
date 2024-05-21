package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        HashSet<List<Integer>> sub = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> s = new ArrayList<>();
            for(int j=0; j<nums.length; j++){
                s.add(nums[j]);
            }
            sub.add(s);
        }



        return sub.stream().toList();
    }
}
