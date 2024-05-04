package Graphvacations;


import java.util.ArrayList;

public class islands200 {



        public int numIslands(char[][] grid) {
            int count=0;
            int n=grid.length;
            int m=grid[0].length;
            boolean[][] visited=new boolean[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(visited[i][j]==false && grid[i][j]=='1'){
                        count++;
                        recur(i,j,grid,visited);
                    }
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.remove(arr.size()-1);
                }
            }

            return count;

        }



    private void recur(int r,int c,char grid[][],boolean visited[][]){
        int n=grid.length;
        int m=grid[0].length;
        visited[r][c]=true;

        int []drow={1,-1,0,0};
        int []dcol={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nrow=r+drow[i];
            int ncol=c+dcol[i];

            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && !visited[nrow][ncol]){
                recur(nrow,ncol,grid,visited);
            }
        }


    }
}
