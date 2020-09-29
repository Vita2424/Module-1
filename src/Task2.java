import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Task2 {

    static float a, b, c, i ,x;

    public static void main(String args []) {
        System.out.println("Находим значение функции");
        Scanner s = new Scanner(System.in);
        System.out.print("Введите значение a -> ");
        a = s.nextFloat();
        System.out.print("Введите значение b -> ");
        b = s.nextFloat();
        System.out.print("Введите значение c -> ");
        c = s.nextFloat();

        i = (float) (((b + ((Math.sqrt(x) / 2) * a)) - (Math.pow(a, 3) * c)) + Math.pow(b,-2));
        x = (float) (Math.pow(b,2) + 4 * a * c);
        System.out.println(new StringBuilder().append("Ответ = ").append(i).toString());
    }
}