package oopslab.exam;

public class factor {
    int a;

    factor(){
        this.a=0;
    }
    factor(int a){
        this.a=a;
    }

    public int factor(){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
}
