package LeetCode_questions;

public class Assigncookies455 {


    public static void main(String[] args) {
        System.out.println(doorStatus(4));
    }




        public static String doorStatus(int n) {
            // Write your code here.
            boolean door[]=new boolean[n+1];
            for(int j=1;j<=n;j++){
                for(int i=1;i<=n;i++){
                    if(i%j==0){
                        door[i]=!door[i];}
                }}
            StringBuilder s=new StringBuilder();
            for(int i=1;i<=n;i++){
                s.append(door[i]?'1':'0');
            }

            return s.toString();
        }




}


