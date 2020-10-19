/*
Даны три точки А(x1,y1), B(x2,y2), C(x3,y3). Определить, будут ли они расположены на одной прямой.
 */
package linear;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Введите 2 точки для A(x1,y1):");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Введите 2 точки для B(x2,y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Введите 2 точки для C(x3,y3):");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if (((y3 - y2) | y3 - y1) == ((x3 - x2) | (x3 - x1))) {
            System.out.println("Они расположены на одной прямой");
        } else {
            System.out.println("Они расположены НЕ на одной прямой");
        }

    }
}
