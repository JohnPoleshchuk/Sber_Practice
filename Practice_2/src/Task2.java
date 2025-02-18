import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество чисел: ");
        int n = scan.nextInt();

        System.out.println("Введите последовательность чисел(в диапозоне 1 - 500)");
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();

            if(k < 1 || k > 500) {
                System.out.println("Введено недопустимое число " + k + ". Допустимый диапазон значений: 1 - 500");
                break;
            }
            System.out.println(k);
        }
    }
}
