package line.task6;

import java.util.Scanner;

/*
 * Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */

public class Area {
    public static void main(String[] args) {
        double x, y;
        boolean isInArea;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите X:");
        x = sc.nextDouble();
        System.out.println("Введите Y:");
        y = sc.nextDouble();

        isInArea = ((-2 <= x && x <= 2) && (4 >= y &&  y >= 0)) || ((-4 <= x && x <= 4) && (-3 <= y && y <= 0));
        System.out.println(isInArea);
    }
}
