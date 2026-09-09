package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayBubbleSort ABS = new ArrayBubbleSort();
        ArrayList<Integer> arr = new ArrayList<>();
        int n = scanner.nextInt();
        ABS.arr_fill(arr, n);
        ABS.arr_show(arr);
        ABS.bubble_sort(arr);
        ABS.arr_show(arr);
    }
}
