package Arrays;

public class queries {

        private static final int MOD = (int)(1e9+7);
        public static int maximumSumSubsequence(int[] nums, int[][] queries) {
//          long totalSum = 0;
//         int n=nums.length;

//         for (int[] query : queries) {
//             int pos = query[0];
//             int newValue = query[1];

//             nums[pos] = newValue;

//             long maxSum = calculateMaxSum(n-1,nums);
//             totalSum = (totalSum + maxSum) % MOD;
//         }
//         return (int)totalSum;

            long total=0;
            int n=nums.length;
            for(int []query:queries){
                int pos=query[0];
                int newVal=query[1];

                nums[pos]=newVal;
                long max=solve(n,nums,0);
                total=(max+total)%MOD;

            }
            return (int)total;

        }
        static long solve(int n, int[] arr, int max) {

            long prev = arr[0];
            long prev2 = 0;

            for (int i = 1; i < n; i++) {

                long pick = arr[i];

                if (i > 1){
                    if(pick<prev2) {
                        pick += prev2;
                    }
                }


                long nonPick = prev;

                long cur_i = Math.max(pick, nonPick);
                prev2 = prev;
                prev = cur_i;
            }

            return Math.max(prev,max);
        }

    public static void main(String[] args) {
        int nums[]={3,5,9};
        int [][]queries={{1,-2},{0,-3}};
        System.out.println( maximumSumSubsequence(nums,queries));
    }
}
