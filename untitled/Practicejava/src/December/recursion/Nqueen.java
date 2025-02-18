package December.recursion;

import java.util.*;
public class Nqueen {

    public static void main(String[] args) {
        List<List<String>> ans=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n for which u want the sol");
        int n=sc.nextInt();
        char board[][]=new char[n][n];
        for(char i[]:board){
            Arrays.fill(i,'.');
        }
        Solution1 sol1=new Solution1();
        sol1.solve(0,board,ans,n);
        System.out.println(ans);
    }
}



class Solution2{
    List<String> construct(char board[][]){
        List<String> ans=new ArrayList<>();
        for(char i[]:board){
            ans.add(new String(i));
        }
        return ans;
    }





    void solve(int col,char board[][],int left[],int upperDiagonal[],int lowerDiagonal[],List<List<String>> ans,int n){
        if(col==n){
            ans.add(construct(board));
        }
        for(int row=0;row<n;row++){
       if(left[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1+col-row]==0){
                board[row][col]='Q';
                left[row]=1;
                lowerDiagonal[row+col]=1;
                upperDiagonal[n-1+col-row]=1;
                solve(col+1,board,left,upperDiagonal,lowerDiagonal,ans,n);
                board[row][col]='.';
                left[row]=0;
                lowerDiagonal[row+col]=0;
                upperDiagonal[n-1+col-row]=0;
            }
        }
    }


}









class Solution1{

    void solve(int col,char board[][],List<List<String>> ans,int n){
        if(col==n){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                solve(col+1,board,ans,n);
                board[row][col]='.';
            }
        }
    }

    boolean isSafe(int row,int col,char board[][],int n){
        int drow=row;
        int dcol=col;

        // upper diagonal
        while(drow>=0 && dcol>=0){
            if(board[drow][dcol]=='Q'){
                return false;
            }
            drow--;
            dcol--;
        }
        // left row
        dcol=col;
        drow=row;
        while(dcol>=0){
            if(board[drow][dcol]=='Q'){
                return false;
            }
            dcol--;
        }
        dcol=col;
        drow=row;
        while(drow<n && dcol>=0){
            if(board[drow][dcol]=='Q'){
                return false;
            }
            drow++;
            dcol--;
        }
return true;
    }

    List<String> construct(char board[][]){
         List<String> ans=new ArrayList<>();
        for(char i[]:board){
            ans.add(new String(i));
        }
        return ans;
    }


}
