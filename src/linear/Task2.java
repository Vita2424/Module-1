package linear;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a, b, c, i, x;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение a -> ");
        a = s.nextFloat();
        System.out.print("Введите значение b -> ");
        b = s.nextFloat();
        System.out.print("Введите значение c -> ");
        c = s.nextFloat();

        x = (Math.pow(b, 2) + 4 * a * c);
        i = (((b + ((Math.sqrt(x) / 2) * a)) - (Math.pow(a, 3) * c)) + Math.pow(b, -2));
        System.out.println("Ответ = " + i);
    }
}