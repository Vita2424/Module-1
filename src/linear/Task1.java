package linear;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double a, b, c, i;
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение a -> ");
        a = s.nextFloat();
        System.out.print("Введите значение b -> ");
        b = s.nextFloat();
        System.out.print("Введите значение c -> ");
        c = s.nextFloat();

        i = ((a - 3) * b) / 2 + c;
        System.out.println("Ответ = " + i);
    }
}