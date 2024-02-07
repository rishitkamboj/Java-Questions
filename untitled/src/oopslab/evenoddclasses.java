import java.util.*;
public class evenoddclasses {
    int b;
    public static void main(String[] args) {
        evenoddclasses num=new evenoddclasses();
        num.insert();
        System.out.println(""+num.sumCheck());

    }

    void insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        b=sc.nextInt();
    }
    boolean sumCheck(){
        int num=b;
        int sum=0;

        while(num>0){
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        return sum % 2 == 0;
    }
}
