package oopslab.exam;

public class complex {
    int real;
    int img;

    complex(){
        this.real=0;
        this.img=0;
    }
    complex(int r,int i){
        this.real=r;
        this.img=i;
    }

    void swap(){
        int temp=real;
        real=img;
        img=temp;
    }
    static complex sum(complex c1,complex c2){
        return new complex((c1.real+c2.real),(c1.img+c2.img));
    }

    public static void main(String[] args) {
        complex c1=new complex(1,2);
        complex c2=new complex(2,1);
        System.out.println("Before swap: "+c1.real+" + "+c1.img+"i");
        c1.swap();
        System.out.println("After swap: "+c1.real+" + "+c1.img+"i");
       complex c3= complex.sum(c1,c2);
        System.out.println("Sum = "+c3.real+" + "+c3.img+"i");

    }
}
