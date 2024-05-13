package LeetCode_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class hire857 {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n=wage.length;
        double minCost=Double.MAX_VALUE;

        for(int caption=0;caption<n;caption++){
            double captionratio=(double)(wage[caption]/quality[caption]);
            ArrayList<Double> expected=new ArrayList<>();
            for(int worker=0;worker<n;worker++){
                double offer=quality[worker]*captionratio;
                if(offer>=wage[worker]){
                    expected.add(offer);
                }
            }
            if(expected.size()<k){
                continue;
            }
           
        }

    }
}
