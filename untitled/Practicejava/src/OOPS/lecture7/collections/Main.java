package OOPS.lecture7.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
          List<Integer> vector=new Vector<>();
          List<Integer> list=new ArrayList<>();

          Map<Integer,Integer> map=new HashMap<>();
          HashSet<Integer> set=new HashSet<>();



          vector.add(45);
          vector.add(5);
          vector.add(56);


        System.out.println(vector);
    }
}
