package strivercourse.arrays;

public class longestsubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,3,3};
        int k=6;

    //LONGEST SUBARRAY WITH GIVEN SUM( WHEN THE SUBARRAY HAS POSITIVE NUMS)
/* simple way of generating sub arrays O(N^3)
 length=0;
        for(int i=0;i<arr.length;i++){
               for(int j=i;j<arr.length;j++){

this will be used to find subarrays
// to find summation run another loops
int sum=0;
                   for(int k=i;k<=j:k++){
                    sum+=arr[k];
                    if(sum== requiredsum){
                    length=Math.max(length,j-1+1);                    }
                   }

                 }} */

    /* simple way of generating sub arrays O(n^2)
 length=0;
        for(int i=0;i<arr.length;i++){
               int sum=0;
               for(int j=i;j<arr.length;j++){

this will be used to find subarrays
// to find summation run another loops

     sum+=arr[j];
if(s==k){length=Math.max(length,j-i+1);
                 }} */


    //BETTER SOLUTION HASHINGGGGGGGGGG

//    HashMap<Long, Integer> preSumMap = new HashMap<>();
//    long sum=0;
//    int maxLen=0;
//        for (int i = 0; i < arr.length ; i++) {
//           sum+=arr[i];
//           if(sum==k){
//               maxLen=Math.max(maxLen,i+1);
//           }
//           long rem=(sum-k);
//           if(preSumMap.containsKey(rem)){
//               int len=i-preSumMap.get(rem);
//               maxLen=Math.max(maxLen,len);
//           }
//           if(!preSumMap.containsKey(sum)){
//               preSumMap.put(sum,i);
//           }
//        }
//THIS IS CORRECT (this is the optimal sol for arrays having
        // positives,negatives and zeroes)

        // OPTIMAL SOLUTION
        //2 pointer approach and a greedy approachhhh
        // This is the optimal solution for zero and positives
/* the outher while loop is right pointer running till n
inside it is not always not running for n
 */




        int i=0,j=0;
        long sum=arr[0];
        int maxLen=0;
        while(i<arr.length){
            while(i<=j && sum>k){
                sum-=arr[j];
                j++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,i-j+1);
            }
                i++;
                if(sum<=k)  { sum+=arr[i];}
            if(sum>k){

            }


        }






}
}

    
















