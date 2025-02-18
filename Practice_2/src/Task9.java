import java.util.Scanner;

public class Task9 {
    private static final int NUMBER_ALPHABET_SYMBOLS = 26;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rand = (int)(Math.random()*NUMBER_ALPHABET_SYMBOLS);

        int n = 'A' + rand;

        int targetPosition = 0;
        while (targetPosition != n) {
            String inputLetter = scan.next().toUpperCase();

            targetPosition = inputLetter.charAt(0);


            if(Math.abs(targetPosition - n) < 26) {
                if (n == targetPosition) {
                    System.out.println("Верно!");
                } else if ((n < targetPosition) & (n >= 65)) {
                    System.out.println("Ищи букву, которая перед ней в алфавите!");
                } else if ((n > targetPosition) & (n <= 90)) {
                    System.out.println("Ищи букву, которая после неё в алфавите!");
                }
            } else {
                System.out.println("Введене недопустимый символ!");
            }
        }
    }
}
