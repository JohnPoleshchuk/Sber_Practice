import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите натуральное целое число: ");
        int n = scan.nextInt();

        int d = 2;
        while((d * d <= n) & (n%d != 0)) {
            d++;
        }

        if(n%d == 0) {
            System.out.println("Нет");
        }
        else {
            System.out.println("Да");
        }
    }
}
