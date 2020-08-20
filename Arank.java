package com.asignment2;
//6
import java.util.*;

class Arank {

    static void changeArr(int[] input)
    {

        int newArray[]
                = Arrays
                .copyOfRange(input,
                        0,
                        input.length);


        Arrays.sort(newArray);
        int i;

        Map<Integer, Integer> ranks
                = new HashMap<>();

        int rank = 1;

        for (int index = 0;
             index < newArray.length;
             index++) {

            int element = newArray[index];

            if (ranks.get(element) == null) {

                ranks.put(element, rank);
                rank++;
            }
        }

        for (int index = 0;
             index < input.length;
             index++) {

            int element = input[index];
            input[index]
                    = ranks.get(input[index]);

        }
    }

  
    public static void main(String[] args)
    {
  
        int[] arr = { 234, 6, 90,13 };

       
        changeArr(arr);

        System.out.println(Arrays.toString(arr));
    }
}