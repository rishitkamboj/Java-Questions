package DAALAB.paperprep;


import java.util.Arrays;

class Job{
    int id;
    int profit;
    int deadline;

    public Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
public class JobSeq {
    public static void main(String[] args) {
        Job[] jobs={new Job(1,5,100)};

        Arrays.sort(jobs,(a,b)->b.profit - a.profit);
        int max=0;
        for(Job j:jobs){
            max=Math.max(max,j.deadline);
        }
        int profit=0;
        int deadline[]=new int[max+1];
        Arrays.fill(deadline,-1);

        for(int i=0;i<jobs.length;i++){
            for(int j=jobs[i].deadline;j>0;j--){
                if(deadline[j]==-1){
                    deadline[j]=jobs[i].id;
                    profit+=jobs[i].profit;
                    break;
                }
            }
        }
    }
}
