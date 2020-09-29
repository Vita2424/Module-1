import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {

    static float x, y, i;

    public static void main(String args []) {
        System.out.println("Находим значение функции");
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение x -> ");
        x = s.nextFloat();
        System.out.print("Введите значение y -> ");
        y = s.nextFloat();

        i = (float) (sin(x) + cos(y) / cos(x) - sin(y) * tan(x * y));
        System.out.println("Ответ = " + i);
    }
}