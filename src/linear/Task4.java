package linear;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число -> ");
        x = s.nextDouble();

        double y = ((int) x / 1000.0) + ((x - (int) x) * 1000);
        System.out.printf("Строка в обратном порядке: %.3f ",y);
    }
}