//package leetcodesques;
//
//import java.util.PriorityQueue;
//
//public class relativeranks506 {
//    public String[] findRelativeRanks(int[] score) {
//        PriorityQueue<Integer> heap=new PriorityQueue<>((a,b)->score[b]-score[a]);
//        for(int i:score){
//heap.offer(i);
//        }
//        String[] ans=new String[score.length];
//        int el=heap.remove();
//    }
//}
