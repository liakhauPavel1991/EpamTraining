package branching.task1;

import java.util.Scanner;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

public class Triangle {

    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите угол A :");
        a = sc.nextDouble();
        System.out.println("Введите угол B:");
        b = sc.nextDouble();

        if(a > 0 && b > 0) {
            if ( (a + b) >= 180) {
                System.out.println("Таого треугольника не существует, сумма углов больше 180");
            } else if (a == 90 || b == 90 || (a + b) == 90) {
                System.out.println("Треугольник прямоугольный.");
            } else {
                System.out.println("Треугольник не прямоугольный.");
            }
        } else {
            System.out.println("Введены не корректные значения");
        }

    }
}
