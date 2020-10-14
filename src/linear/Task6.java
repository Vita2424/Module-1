/**
 * Даны два угла труегольника(в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным.
 */
package linear;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите градус первого угла:");
        Scanner scanner = new Scanner(System.in);
        int corner1 = scanner.nextInt();

        System.out.println("Введите градус второго угла:");
        int corner2 = scanner.nextInt();
        int corner3 = 180 - (corner1 + corner2);
        int summa = corner1 + corner2 + corner3;

        if (summa <= 180 & summa < 0) { // Проверяем существет ли такой треугольник
            System.out.println("Такой треугольник существует!");
        } else {
            System.out.println("Такого треугольника НЕ существует!");
        }
        if (corner1 + corner2 == 90 || corner1 + corner3 == 90 || corner2 + corner3 == 90) {
            System.out.println("Труегольник является прямоугольным!");
          } else {
                System.out.println("Труегольник НЕ является прямоугольным!");


                System.out.println("Градус угла 1 = " + corner1 + " Градус угла 2 = " + corner2 + "Градус угла 3 = " + corner3);
            }
        }

    }