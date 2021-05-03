package cycle.task1;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное
 * число. А программа суммирует все числа от 1 до введенного
 * пользователем числа.
 */

public class Sum {

    public static void main(String[] args) {
        int sum = 0;
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любое целое положительное число:");
        num = scanner.nextInt();
        for (int i = num; i > 0; i--) {
            sum += i;
        }

        System.out.print("Сумма всех чисел от 1 до " +num + ": " + sum);
    }

}
