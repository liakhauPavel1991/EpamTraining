package branching.task5;

import java.util.Scanner;

/*
 * Вычислить значение функции:
 * x^2 - 3x + 9, если x <= 3;
 * 1 / (x^2 + 6), если x > 3.
 */

public class Function {

    public static void main(String[] args) {
        double x, z;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение \"x\":");
        x = scanner.nextDouble();
        if (x <= 3) {
            z = x * x - 3 * x + 9;
        } else {
            z = 1 / (x * x + 6);
        }

        System.out.println("Значение функции: " + z);
    }

}