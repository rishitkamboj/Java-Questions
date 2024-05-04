package Graphvacations;

import java.util.LinkedList;
import java.util.Queue;
class Paired{
    int sr;
    int sc;
    int color;
    Paired(int a,int b,int c){
        this.sr=a;
        this.sc=b;
        this.color=c;
    }
}

public class floodfill733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ans[][]=image;
        int oldColor=image[sr][sc];
       BFS(image,ans, sr, sc, color,oldColor);
       return image;
    }
    private static void BFS(int [][]image,int[][]ans,int row,int col,int newColor,int color){
        int n=image.length;
        int m=image[0].length;
       ans[row][col] = newColor;
        Queue<Paired> q = new LinkedList<>();
        q.add(new Paired(row,col,newColor));
        int drow[]={-1,0,1,0};
        int dcol[]={0,-1,0,1};
        while(!q.isEmpty()){
            Paired pair = q.poll();
            int r= pair.sr;
            int c= pair.sc;
            int colo=pair.color;
            for(int i=0;i<4;i++){
                int nrow=r+drow[i];
                int ncol=c+dcol[i];

                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==color && ans[nrow][ncol]!=newColor){
                    ans[nrow][ncol]=newColor;
                    q.add(new Paired(nrow,ncol,newColor));
                }

            }


        }

    }

}
