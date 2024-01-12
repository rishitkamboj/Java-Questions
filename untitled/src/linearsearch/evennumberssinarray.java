package linearsearch;

public class evennumberssinarray {
    public static void main(String[] args) {
        int arr[]={12,111,12222};
        System.out.println(findnum(arr));

    }
    static int findNumberd(int [] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            int n=0; int no=0;
            while(n>0) {
                n=nums[i];
                no++;
                n=n/10;
                }
             if(no%2==0) {
                count++;
            }
        }
        return count;

}

static int findnum(int[] nums) {
        int count=0;
        for(int num: nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
}
//function to check even digits or not
     static boolean even(int num) {
         return digits(num) % 2 == 0;
     }

/// count numbers of digitis in a number
    static int digits(int num) {
        int count=0;
        while(num>0) {
            count++;
            num/=10;
        }
        return count;
    }
}
