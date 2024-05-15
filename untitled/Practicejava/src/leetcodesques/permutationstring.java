//package leetcodesques;
//
//public class permutationstring {
//    public static int findPermutationDifference(String s, String t) {
//
//            int diff=0;
//        for(int i=0;i<s.length();i++){
//                 char ch = s.charAt(i);
//                 int index=t.indexOf(ch);
//                 diff+=Math.abs(index-i);
//        }
//        return diff;
//}
//
//
//    public static int maximumEnergy(int[] energy, int k) {
//               int[] ans=new int[k];
//               for(int i=0;i<energy.length;i++){
//
//               }
//
//    }
//
//
//
//
//
//
//    public static int maximumEnergy2(int[] energy, int k) {
//        int max = Integer.MIN_VALUE;
//        int n = energy.length;
//
//        // Calculate the initial sum of energy for the first window of size k
//        int currentSum = 0;
//        for (int i = 0; i < k && i < n; i++) {
//            currentSum += energy[i];
//        }
//
//        // Update max with the initial sum
//        max = Math.max(max, currentSum);
//
//        // Slide the window and update the current sum and max
//        for (int i = k; i < n; i++) {
//            // Subtract the element going out of the window
//            currentSum -= energy[i - k];
//            // Add the element coming into the window
//            currentSum += energy[i];
//            // Update max
//            max = Math.max(max, currentSum);
//        }
//
//        return max;
//    }
//
//
//    public static void main(String[] args) {
//        System.out.println(maximumEnergy2(new int[]{5,2,-10,-5,1},3));
//    }}
