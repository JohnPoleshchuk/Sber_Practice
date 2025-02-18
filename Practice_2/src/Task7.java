import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите a : ");
        double a = scan.nextInt();

        System.out.println("Введите b : ");
        double b = scan.nextInt();

        System.out.println("Введите c : ");
        double c = scan.nextInt();

        double D = b*b - 4*a*c;
        if (D > 0) {
            double x1 = (-b + Math.sqrt(D))/(2*a);
            double x2 = (-b - Math.sqrt(D))/(2*a);
            System.out.println("X1 : " + x1 + " X2 : " + x2);
        }
        else if (D == 0){
            double x = -b/(2*a);
            System.out.println("X : " + x);
        }
        else {
            System.out.println("Нет вещественных корней");
        }
    }
}
