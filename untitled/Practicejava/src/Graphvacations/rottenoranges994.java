//package Graphvacations;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//class Pair{
//    int row;
//    int col;
//    int tm;
//    Pair(int r,int c,int t){
//        this.row=r;
//        this.col=c;
//        this.tm=t;
//    }
//}
//
//
//public class rottenoranges994 {
//    public int orangesRotting(int[][] grid) {
//int n = grid.length;
//int m = grid[0].length;
//int visisted[][]=new int[n][m];
//Queue<Pair> q=new LinkedList<>();
//int cFresh=0;
//
//for(int i=0;i<n;i++){
//    for (int j=0;j<m;j++){
//        if(grid[i][j]==2){
//            visisted[i][j]=2;
//            q.offer(new Pair(i,j,0));
//
//        }
//        else{
//            visisted[i][j]=0;
//        }
//        if(grid[i][j]==1){ cFresh++;}
//    }
//}
//int time=0;
// int drow[]=new int[]{-1,0,1,0};
//int dcol[]=new int[]{0,1,0,-1};
//int count=0;
//while(!q.isEmpty()){
//
//    int r=q.peek().row;
//    int c=q.peek().col;
//    int t=q.peek().tm;
//    q.remove();
//    time=Math.max(t,time);
//
//    for(int i=0;i<4;i++){
//        int nrow=r+drow[i];
//        int ncol=c+dcol[i];
//        if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visisted[nrow][ncol]==0 && grid[nrow][ncol]==1){
//            q.add(new Pair(nrow,ncol,time+1));
//            visisted[nrow][ncol]=2;
//            count++;
//        }
//    }}
//
//    if(cFresh!=count){
//        return -1;
//    }
//return time;
//}
//    }
//
