package org.example;
import java.util.ArrayList;
import java.util.Random;
public class ArrayBubbleSort {
    public void arr_fill(ArrayList<Integer> arr, int n){
        Random rand = new Random();
        for (int i = 0; i < n; i++){
            int num = rand.nextInt(-1000, 1000);
            arr.add(num);
        }
    }
    public void arr_show(ArrayList<Integer> arr){
        int n = arr.size();
        for (int i = 0; i < n; i++){
            System.out.println("#" + i + " = " + arr.get(i));
        }
        System.out.println("-------");
    }

    public void bubble_sort(ArrayList<Integer> arr){
        int n = arr.size();
        boolean swap;
        for (int i = 0; i < n - 1; i++){
            swap = false;
            for (int j = 0; j < n - 1 - i; j++){
                if (arr.get(j) > arr.get (j + 1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}
