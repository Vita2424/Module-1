/*
Заданы размеры А,В прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич через отверстие.
 */
package linear;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Введите 2 размера для A,В: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите 3 размера для кирпича х,y,z: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        boolean t1 = ((a >= x) & (b >= y)) | ((a >= y) & (b >= x));
        boolean t2 = ((a >= x) & (b >= z)) | ((a >= z) & (b >= x));
        boolean t3 = (((a >= z) & (b >= y)) | ((a >= y) & (b >= z)));

        if (t1 | t2 | t3) {
            System.out.println("Кирпич влезет!");
        } else {
            System.out.println("Кирпич НЕ влезет!");
        }
    }
}