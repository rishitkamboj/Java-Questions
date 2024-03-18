package leetcodesques;
import java.util.Arrays;

public class balloons452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(x,y)->Integer.compare(x[1],y[1]));
        int arrows=1;
        int prev=0;

        for(int i=1;i<points.length;i++){

            if(points[i][0]>points[prev][1]){
                arrows++;
                prev=i;
            }
        }
        return arrows;
    }}

