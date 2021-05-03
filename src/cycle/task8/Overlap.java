package cycle.task8;

import java.util.*;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Overlap {

    public static void main(String[] args) {
        int x, y, num;

        HashSet<Integer> setX = new HashSet<>();
        HashSet<Integer> setY = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи первое число:");
        x = (int) scanner.nextLong();
        System.out.println("Введи второе число:");
        y = (int) scanner.nextLong();

        while (x > 0) {
            num = x % 10;
            setX.add(num);
            x /= 10;
        }
        while (y > 0) {
            num = y % 10;
            setY.add(num);
            y /= 10;
        }
        System.out.println("Цифры, входящие в оба числа: ");
        for (int numX: setX) {
            if(setY.contains(numX)) {
                System.out.print(numX + ", ");
            }
        }

    }
}