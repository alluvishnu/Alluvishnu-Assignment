package com.jsp.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an ArrayList with the initial values
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(originalList);

        // Convert the shuffled ArrayList back to an array
        Integer[] shuffledArray = originalList.toArray(new Integer[0]);

        // Print the shuffled array
        for (int number : shuffledArray) {
            System.out.print(number + " ");
        }
    }
}

