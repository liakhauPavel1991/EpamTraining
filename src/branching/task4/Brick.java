package branching.task4;

import java.util.Scanner;

/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Brick {

    public static void main(String[] args){
        double a, b, x, y, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер А прямоугольного отверстия");
        a = scanner.nextDouble();
        System.out.println("Введите размер В прямоугольного отверстия");
        b = scanner.nextDouble();
        System.out.println("Введите размер х кирпича.");
        x = scanner.nextDouble();
        System.out.println("Введите размер у кирпича.");
        y = scanner.nextDouble();
        System.out.println("Введите размер z кирпича.");
        z = scanner.nextDouble();

        if ((a >= x && b >= y) || (a >= x && b >= z) || (a >= z && b >= y)) {
            System.out.println("Кирпич пройдет через отверстие.");
        } else {
            System.out.println("Кирпич не пройдет через отверстие.");
        }
    }

}