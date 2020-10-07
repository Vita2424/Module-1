package linear;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Т");
        int t = scanner.nextInt();

        int s = t % 60;
        int m = (t / 60) % 60;
        int h = (t / 3600) % 24;

        System.out.println(h + "Ч" + m + "М" + s + "С");
    }
}