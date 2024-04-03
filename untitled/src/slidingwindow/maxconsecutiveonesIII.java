package slidingwindow;

public class maxconsecutiveonesIII {


    public static  int maxOnes(int arr[],int k){
        int l=0;
        int r=0;
        int max=0;
        int zero=0;
        while(r< arr.length){
            if(arr[r]==0){
                zero++;
            }
            if(zero>k){
                if(arr[l]==0){
                    zero--;
                }
                l++;}

            if(zero<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
            }
        return max;
        }
    }

