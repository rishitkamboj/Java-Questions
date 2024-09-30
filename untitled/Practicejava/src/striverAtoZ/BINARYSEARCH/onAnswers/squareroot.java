package striverAtoZ.BINARYSEARCH.onAnswers;

public class squareroot {

    public static void main(String[] args) {
        System.out.println(square(5));
    }

    public static int square(int n){
        int s=0;
        int e=n;
        int ans=-1;

        while(s<=e){
//            int mid=s+(e-s)/2;
            int mid=(s+e)/2;
            if(mid*mid==n){
                return mid;
            }

            if(mid*mid<n)
            {
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return ans;
    }
}
