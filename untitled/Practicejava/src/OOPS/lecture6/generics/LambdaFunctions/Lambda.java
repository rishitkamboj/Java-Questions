package OOPS.lecture6.generics.LambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
//           ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(new int[]{1, 2, 3, 4});
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
//            arr.forEach((item) -> {
//                        System.out.println(item * 2);
//                    }
//         )  ;

            Consumer<Integer> fun=(item)-> System.out.println(item*2);
            arr.forEach(fun);

        }


    }}
