package org.example;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] array = {5,2,1,8,7,6};
        selectionsort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void selectionsort(int[] array) {
        for (int i = 0 ; i < array.length ; ++i){
            int minIndex = i;
            for (int j = i + 1; j <array.length ; ++j){
                if (array[j] < array[minIndex]){
                    minIndex =  j;
                }
            }
            if (i != minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}