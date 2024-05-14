package Graphvacations.shortestpath;

public class flyodmarshall {
    public void shortest_distance(int[][] matrix) {
                   int n=matrix.length;
                   for(int i=0;i<n;i++){
                       for(int j=0;j<n;j++){
                           if(matrix[i][j]==(-1)){
                               matrix[i][j]=(int)(1e9);
                           }
                       }}

                   for(int k=0;k<n;k++){
                       for(int j=0;j<n;j++){
                           for(int l=0;l<n;l++){
                               matrix[j][l]=Math.min(matrix[j][l], matrix[j][k]+matrix[k][l]);
                           }
                       }
                   }





                       for(int i=0;i<n;i++){
                           for(int j=0;j<n;j++){
                               if(matrix[i][j]==(int)(1e9)){
                                   matrix[i][j]=-1;
                               }
                           }  }

                   }

    }
}