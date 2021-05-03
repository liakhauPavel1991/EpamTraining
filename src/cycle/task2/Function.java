package cycle.task2;

import java.util.Scanner;
/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 * y = x, x > 2; y = -x, x <=2
 */

public class Function {

    public static void main(String[] args) {
        double a, b, h;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения \"a\" :");
        a = scanner.nextDouble();
        System.out.println("Введите значения \"b\" :");
        b = scanner.nextDouble();
        System.out.println("Введите значения \"h\" :");
        h = scanner.nextDouble();

        while (a <= b) {
            if (a <= 2) {
                System.out.println((float) -a);
            } else {
                System.out.println((float) a);
            }
            a += h;
        }
    }
}