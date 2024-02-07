package oopslab;
/* ACCOUNT CLASS HAVING ACCOOUNTNO, NAME,BANK NAME,BRANCH AND MEMBERS FUNCTIONS VOID INPUT(),VOID DISPLAY(), VOID WITHDRAW(), VOID DEPOSIT()*/
public class account    {
    int acc_no;
    String name;
    String bank_name;
    double balance;
    String branch;

    void input(int a,String n,String b,String br,double bal){
        acc_no=a;
        name=n;
        bank_name=b;
        branch=br;
        balance=bal;
    }
    void display(){
        System.out.println("Account no: "+acc_no+" Name: "+name+" Bank Name: "+bank_name+" Branch: "+branch+" Balance: "+balance);
    }

    void withdraw(int n){
        balance-=n;
        System.out.println("New balance after withdrawal of "+n+" amount = "+balance);
    }
    void deposit(int n){
        balance+=n;
        System.out.println("New balance after deposit of "+n+" amount = "+balance);
    }


    public static void main(String[] args) {
        account a1=new account();
        a1.input(123,"ABC","HDFC","Patia",15000.0);
        a1.display();
        a1.withdraw(50);
        a1.deposit(100);
    }

}
