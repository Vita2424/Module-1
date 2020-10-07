package linear;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double r;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число -> ");
        r = s.nextDouble();

        double x1 = r / 1;
        double x2 = r % 1;
//        ((int) x / 1000.0) + ((x - (int) x) * 1000)
        System.out.println(x1 + " " + x2);
        System.out.println("Строка в обратном порядке: " + r);
    }
}