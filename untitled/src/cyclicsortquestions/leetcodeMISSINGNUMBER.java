package cyclicsortquestions;

public class leetcodeMISSINGNUMBER {
    public  static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        System.out.println(missingnumber(arr));
    }
     static int missingnumber(int [] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct=nums[i];
            if (nums[i]<nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++) {
            if(nums[j]!=j) { return j; }
    }  return nums.length; }


    static void swap(int [] arr,int num1,int num2) {
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;}



}
