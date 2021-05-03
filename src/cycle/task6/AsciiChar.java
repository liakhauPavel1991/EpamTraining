package cycle.task6;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class AsciiChar {

    public static void main(String[] args) {

        for (int i = 33; i < 300; i++) {

            System.out.println( (char) (i) + " - " + i);

        }
    }
}