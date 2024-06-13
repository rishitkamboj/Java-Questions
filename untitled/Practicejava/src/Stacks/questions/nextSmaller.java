package Stacks.questions;

import java.util.Stack;

public class nextSmaller {
    public int[] nextSmallers(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<Integer>();
        int ans[]=new int[n];

        for(int i=0;i<n;i++){
            int el=arr[i];

            while(!st.isEmpty() && el>st.peek()){
                ans[st.pop()]=el;
            }
            st.push(el);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}
