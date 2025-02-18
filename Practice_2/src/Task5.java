import java.util.Scanner;
import java.math.BigInteger;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите n: ");
        int n = scan.nextInt();

        if ((n >= 2) & (n <= 100)) {
            BigInteger prevNumber = new BigInteger("0");
            BigInteger currNumber = new BigInteger("1");
            for (int i = 0; i < n; i++) {
                System.out.print(currNumber + " ");

                BigInteger temp = currNumber;
                currNumber = prevNumber.add(currNumber);
                prevNumber = temp;
            }
        }
    }
}
