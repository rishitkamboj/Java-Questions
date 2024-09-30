package DAALAB.Lab7;

import java.util.*;
class Job {
    int id, profit, deadline;
    Job(int x, int z, int y){
       this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
public class JobSequencing {

    public static void main(String[] args) {
        Job[] jobs = {new Job(1,200,5),new Job(2,180,3),new Job(3,190,3),new Job(4,300,2),new Job(5,120,4),new Job(6,100,2)};
        int arr[]=JobScheduling(jobs, jobs.length);
        System.out.println("Maximum profit is "+arr[1]);
    }






  static  int[] JobScheduling(Job arr[], int n)
    {
        int max=0;
        int profit=0;
        int count=0;
        Arrays.sort(arr,(a,b)->b.profit-a.profit);

        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i].deadline);
        }
        int hash[]=new int[max+1];
        Arrays.fill(hash,-1);

        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(hash[j]==-1){
                    profit+=arr[i].profit;
                    hash[j]=arr[i].id;
                    count++;
                    break;
                }
            }
        }

        return new int[]{count,profit};
    }
}

