package line.task5;

import java.util.Scanner;

/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc
 */

public class Time {
    public static void main(String[] args) {
        int hour, min, sec;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длительность прошедшего времени в секундах:");
        sec = sc.nextInt();

        hour = sec / 3600;
        min = sec / 60 - hour * 60;
        sec -= (hour * 3600 + min * 60);
        System.out.printf("%dч %dмин %dc", hour, min, sec);
    }
}