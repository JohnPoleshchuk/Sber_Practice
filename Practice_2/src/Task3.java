public class Task3 {
    public static void main(String [] args) {
        for(int i = 0; i < 6; i++) {
            System.out.println();

            int j = 10;
            if (i%2 != 0) {
                j--;
                System.out.print(" ");
            }
            while(j != 1) {
                System.out.print("* ");
                j--;
            }
        }
    }
}
