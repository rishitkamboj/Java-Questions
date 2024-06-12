package Stacks;

import javax.crypto.spec.PSource;

public class myQueue {
    int front=-1;
    int rear=-1;
    int arr[];
   private static final  int MAXSIZE=10;
    myQueue(){
        arr=new int[MAXSIZE];
    }
    public void enqueue(int x){
        if(rear==arr.length-1){
            System.out.println("Queue is full");
        }
        if(front==-1){
            front=rear=0;
            arr[rear]=x;
            return;
        }
        arr[++rear]=x;
    }
    public int dequeue(){
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        int x=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }


        return x;
    }
    public void display(){
        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }}
