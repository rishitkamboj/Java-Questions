package strivercourse.arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class mergeoverlappingintervals {
    public static void main(String[] args) {

    }







         static List<List< Integer >> mergeOverlappingIntervals(int [][]arr){
            int n=arr.length;
            Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));
            List<List<Integer>>ans=new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                int start=arr[i][0];
                int end=arr[i][1];
                if(!ans.isEmpty() && end<=ans.get(ans.size() - 1).get(1)){
                    continue;
                }

                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j][0]<=end){
                        end=Math.max(end,arr[j][1]);
                    }
                    else{
                        break;
                    }
                }
                ans.add(Arrays.asList(start,end));

            }

            return ans;

        }



        //optimal approach
        static List<List< Integer >> mergeOverlappingIntervals1(int [][]arr){
            List<List< Integer >> ans=new ArrayList<>();
            Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));
            for (int i = 0; i <arr.length ; i++) {
                if(ans.isEmpty() || arr[i][0] > ans.get(ans.size()-1).get(1)){
                        ans.add(Arrays.asList(arr[i][0],arr[i][1]));
                }
                else{
                    ans.get(ans.size()-1).set(1,  Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
                }


            }



        return ans;
        }
}
