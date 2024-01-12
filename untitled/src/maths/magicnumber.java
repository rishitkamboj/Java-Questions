package maths;

public class magicnumber {
    public static void main(String[] args) {
int n=5;
int ans=0;
int base=5;

// running for how many digits are in the binary representation
while(n>0) {
    int last=n&1;
    n=n>>1;

    ans+=last*base;
    base=base*5;
}
        System.out.println(ans);
    }

}
