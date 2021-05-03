package cycle.task7;

import java.util.Scanner;

/*
 *  Для каждого натурального числа в промежутке от m до n вывести все
 *  делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
 */

public class Divisor {

    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение начальное значение:");
        m = scanner.nextInt();
        System.out.println("Введите значение конечное значение:");
        n = scanner.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }
    }
}