package striverAtoZ.BINARYSEARCH.onAnswers;

public class nthroot {
    public static void main(String[] args) {
        System.out.println(nth(4,27));
    }



    public static int check(int mid,int n,int m){
        int val=1;
        for(int i=1;i<=n;i++){
            val=val*mid;
            if(val>m){
                return 2;
            }
        }
        if(val==m){
            return 1;
        }
        return 0;
    }
    public static int nth(int n,int m){
        int s=1;
        int e=m;
        int ans=-1;
        while(s<=e){
            int mid=(e+s)/2;
            int c=check(mid,n,m);
            if(c==1){
                return mid;
            }
            if(c==0){
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
