package Knap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Knapsack {
     private int n; // number of weights
   private int[] weight=new int[n];
    // this array will have the weight values
     private int[] value=new int[n];
    // this will store the values every specific weight will have
    private final int MAX_WEIGHT; // this will ensure that the weight does not cross the maximum weight of Knapsack
    public Knapsack(int n, int[] weight, int[] value,int MAX) {
        this.n = n;
        this.weight = weight;
        this.value = value;
        this.MAX_WEIGHT=MAX;
    }

//    private static final double CROSS_OVER_RATE = 0.7;
//    private static final double MUTATION_RATE = 0.1;


    Random r=new Random();

   // use to do selection of different weights ( 0 for not taking 1 for taking)

    public int[] random_pop(int length){
        int arr[]=new int[length];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=r.nextInt(2);
        }

        return arr;
    }

    public ArrayList<int[]> randomPopulation(int populationSize){
        ArrayList<int []> population=new ArrayList<>();
        for (int i = 0; i <populationSize ; i++) {
            population.add(random_pop(n));
        }
        return population;
    }


public HashMap<int[],Integer> calculatePopulation_Fitness(ArrayList<int[]> population){
        HashMap<int[],Integer> ans=new HashMap<>();

    for (int[] ints : population) {
        ans.put(ints, fitnesscoff(ints));
    }
    return ans;
}


    public int fitnesscoff(int arr[]){
        int w=0,v=0;
        for (int i = 0; i <arr.length ; i++) {
           w+=arr[i]*weight[i];
           v+=arr[i]*value[i];
        }
        if(w>MAX_WEIGHT){
          return 0;
        }
        return v;
    }


    public int[] fitnessArray(ArrayList<int[]> list){
        int arr[]=new int[list.size()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=fitnesscoff(list.get(i));
        }
        return arr;
    }


    //this is being used for random selection of two chromosomes
    public ArrayList<int[]> selection(ArrayList<int []> list){
         ArrayList<int []> ans=new ArrayList<>();

         ans.add(list.get(r.nextInt(list.size())));
        ans.add(list.get(r.nextInt(list.size())));

        return ans;
    }



    // cross-over







}
