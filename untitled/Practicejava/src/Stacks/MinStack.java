package Stacks;

import java.util.Stack;

class Pair{
    int first;
    int second;
    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}






public class MinStack {
    Stack<Pair> s;

    public MinStack() {
        s=new Stack<>();
    }

    public void push(int val) {
        if(s.isEmpty()){
            s.push(new Pair(val,val));
        }
        int m=s.peek().second;
        if(val<m){
            s.push(new Pair(val,val));
        }
        else{
            s.push(new Pair(val,m));
        }
    }

    public void pop() {
        if(s.isEmpty()){
            return;
        }
        s.pop();
    }

    public int top() {
        return s.peek().first;

    }

    public int getMin() {
        return s.peek().second;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
