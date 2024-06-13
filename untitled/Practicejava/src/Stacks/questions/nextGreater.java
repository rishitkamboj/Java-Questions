package Stacks.questions;

import java.util.Stack;

public class nextGreater {
    public int[] nextGreaterI(int num[]) {
        int n=num.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=n-1;i>=0;i--){
            int el=num[i];
            while(!st.isEmpty() &&  el>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(el);
        }
        return ans;
    }


    public int[] nextGreaterII(int num[]) {
        int n=num.length;
        int ans[]=new int[n];
        Stack<Integer> st=new Stack<Integer>();
        for(int i=2*n-1;i>=0;i--){
            int el=num[i%n];
            while(!st.isEmpty() &&  el>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n]=-1;
            }
            else{
                ans[i%n]=st.peek();
            }
            st.push(el);
        }
        return ans;
    }

}
