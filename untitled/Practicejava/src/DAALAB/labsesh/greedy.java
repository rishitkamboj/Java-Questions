package DAALAB.labsesh;

import java.util.Arrays;
import java.util.Collections;


class Item{
    int wt;
    int val;
    double ratio;

    Item(int wt,int val){
        this.wt=wt;
        this.val=val;
        this.ratio=(double)val/wt;
    }
}
class Job{
    int id;
    int profit;
    int deadline;

    Job(int id, int profit, int deadline){
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}


public class greedy {


    int jobseq(int profit[],int deadline[]){
        int n=profit.length;
        Job jobs[]=new Job[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(deadline[i],max);
            jobs[i]=new Job(i,profit[i],deadline[i]);
        }
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int slots[]=new int[max+1];
        int pro=0;
        for(int i=0;i<n;i++){
            for(int j=jobs[i].deadline;j>0;j--){
                if(slots[j]==-1){
                    slots[j]=jobs[i].id;
                    pro+=jobs[i].profit;
                    break;
                }
            }
        }
        return pro;
    }


    int fractionalKnap(int W,int weight[],int val[]){
        int n=weight.length;
        Item items[]=new Item[n];
        for(int i=0;i<n;i++){
            items[i]=new Item(weight[i],val[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        int profit=0;

        for(int i=0;i<n;i++){
            if(items[i].wt<=W){
                W-=items[i].wt;
                profit+=items[i].val;
            }
            else {
                profit+= (int) (items[i].ratio * W);
                break;
            }
        }
return profit;


    }
}
