package oopslab.threads;

public class t extends Thread{
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {


        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
    }
}

class A implements Runnable{
    public void run(){
        System.out.println("hehehhehe");
    }
}
