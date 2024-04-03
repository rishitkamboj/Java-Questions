package slidingwindow;

import java.util.HashMap;

public class fruitsintobaskets {







    public int fruitsintobaskets(int arr[],int k){
        int l=0;
        int r=0;
        int maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        while(r<arr.length){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.size()>k){ //while can be used here too
                map.put(arr[l], map.get(arr[l])-1);
                if(map.get(arr[l])==0){
                    map.remove(arr[l]);
                }
                l++;}

            if(map.size()<=k){
                maxlen=Math.max(maxlen,(r-l+1));
            }
            r++;
            }
        return maxlen;
        }
    }



