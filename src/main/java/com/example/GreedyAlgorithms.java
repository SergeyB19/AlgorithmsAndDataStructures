package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        /*int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberFromDigits(digits));*/
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));
    }

    /*  public static String maxNumberFromDigits(int[] digits) {
          return String.join("", Arrays.stream(digits).boxed()
                  .sorted(Collections.reverseOrder())
                  .map(String::valueOf)
                  .toArray(String[]::new));*/
      /*  Arrays.sort(digits);
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result += digits[i];
        }
        return result;*/
//    }
    public static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop = 0;
        while (currentStop < stations.length - 1) {
            int nextStop = currentStop;
            while (nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity)
                nextStop++;

            if (currentStop == nextStop)
                return -1;


            if (nextStop < stations.length - 1)
                result++;

            currentStop = nextStop;
        }
        return result;
    }
}
