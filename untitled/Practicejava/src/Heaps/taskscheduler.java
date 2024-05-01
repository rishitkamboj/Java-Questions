package Heaps;
import java.util.Arrays;

public class taskscheduler {

    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char i:tasks){
            freq[i-'A']++;
        }
        Arrays.sort(freq);
        int max=freq[25];
        int idle=(max-1)*n;

        for(int i=24;i>=0;i--){
            idle-=Math.min(max-1,freq[i]);
        }
        if(idle<0){
            return tasks.length;
        }
        return tasks.length+idle;
    }
}
