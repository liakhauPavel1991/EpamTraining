package branching.task3;

import java.util.Scanner;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Points {

    public static void main(String[] args) {
        double xa, xb, xc, ya, yb, yc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату \"x\" точки А:");
        xa = scanner.nextDouble();
        System.out.println("Введите координату \"y\" точки А:");
        ya = scanner.nextDouble();
        System.out.println("Введите координату \"x\" точки B:");
        xb = scanner.nextDouble();
        System.out.println("Введите координату \"y\" точки B:");
        yb = scanner.nextDouble();
        System.out.println("Введите координату \"x\" точки C:");
        xc = scanner.nextDouble();
        System.out.println("Введите координату \"y\" точки C:");
        yc = scanner.nextDouble();

        if ( ((xa - xb) / (xb - xc)) == ((ya - yb) / (yb - yc)) ) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }


}
