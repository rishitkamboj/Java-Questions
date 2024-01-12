package hello;

import java.util.Scanner;

public class ncrnpr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total objects i.e n: ");
        int n=sc.nextInt();
        System.out.println("Enter the r for selection for ncr and arrangement for npr");
        int r=sc.nextInt();
        long nfact=1;
        long rfact=1;
        int t=n-r;
        long nrfact=1;
        for(int i=1;i<=n;i++) {
            nfact*=i;
        }
        for(int i=1;i<=r;i++) {
            rfact*=i;

        }
        for(int i=1;i<=t;i++) {
            nrfact*=i;
        }
        double ncr=(double)(nfact)/(rfact*nrfact);
        double npr=(double)(nfact)/(nrfact);
        System.out.println(ncr);
        System.out.println(npr);
    }
}
