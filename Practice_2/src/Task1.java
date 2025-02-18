import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World");

        System.out.println("Введите имя: ");
        String name = scan.next();

        System.out.println("Hello, " + name);
    }
}