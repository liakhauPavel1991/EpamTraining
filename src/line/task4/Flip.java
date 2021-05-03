package line.task4;

import java.util.Scanner;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Flip {

    public static void main(String[] args){
        double num, flipNum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите действительное число R вида nnn.ddd:");
        num = sc.nextDouble();

        flipNum = num*1000%1000 + (num*1000 - num*1000%1000)/1000_000;

        System.out.println("Полученное значение: " + flipNum);
    }
}