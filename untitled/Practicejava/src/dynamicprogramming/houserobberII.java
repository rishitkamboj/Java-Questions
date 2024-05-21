package dynamicprogramming;

public class houserobberII {


    public static int rob(int[] nums,int N) {
        if(N==0){
            return nums[0];
        }
        if(N<0) {
        return 0;
        }
        int pick=nums[N]+rob(nums,N-2);
        int not=0+rob(nums,N-1);

        return Math.max(pick,not);
    }
}
