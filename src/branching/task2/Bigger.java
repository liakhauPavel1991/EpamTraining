package branching.task2;

import java.util.Scanner;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Bigger {

    public static void main(String[] args){
        double a, b, c, d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значения для выражения: max{min(a, b), min(c, d)}");
        System.out.println("Введите a: ");
        a = scanner.nextDouble();
        System.out.println("Введите b: ");
        b = scanner.nextDouble();
        System.out.println("Введите c: ");
        c = scanner.nextDouble();
        System.out.println("Введите d: ");
        d = scanner.nextDouble();

        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)) );
    }

}