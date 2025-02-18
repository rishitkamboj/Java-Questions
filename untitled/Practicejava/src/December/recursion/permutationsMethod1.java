package December.recursion;

import java.util.ArrayList;
import java.util.List;

public class permutationsMethod1 {






    public static void permutations(int arr[], List<Integer> list,boolean flag[],List<List<Integer>> ans){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!flag[i]){
                flag[i]=true;
                list.add(arr[i]);
                permutations(arr,list,flag,ans);
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }

    }
}
