package linear;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа для min(a,b):");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите 2 числа для min(c,d):");
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        final int min = Math.min(a, b);
        final int min2 = Math.min(c, d);

        int otvet = Math.max(min, min2);
        System.out.println("Решение max{min(a,b),min(c,d)}= " + otvet);
    }
}