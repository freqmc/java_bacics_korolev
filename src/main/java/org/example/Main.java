package org.example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figs = new Figure();
        System.out.println("введите количество фигур");
        int n = scanner.nextInt();
        ArrayList<Figure> shapes = new ArrayList<>();

        Random rand = new Random();
        for (int i = 0; i < n; i++){
            int fig_choice = rand.nextInt(2);
            double num = rand.nextDouble(0, 10);
            if (fig_choice == 0){
                shapes.add(new Circle(num, num, num));
            } else {
                shapes.add(new Rectangle(num, num));
            }
        }
        figs.shape_stat(shapes);
    }
}
