package OOPS.lecture3.polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c ){
        return a+b+c;
    }
    int sum(){
        return -1;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(2,(int)3.33232);
        obj.sum(1,2,3);


    }
}
