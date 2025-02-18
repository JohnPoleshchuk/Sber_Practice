import java.lang.Math;

public class Task6 {
    private static final int NUM_ELEMENTS = 100;
    private static final int MAX_NUM = 1000;

    public static void main(String[] args) {
        int[] arr = new int[NUM_ELEMENTS];
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arr[i] = (int)(Math.random()*MAX_NUM);
        }

        int maxIndex = 0;
        int summ = 0;
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            summ += arr[i];
        }

        int medianValue = (int)(summ/NUM_ELEMENTS);

        System.out.println("Максимальное значение = " + arr[maxIndex] +
                           " находиться  в элементе под индексом " + maxIndex);

        System.out.println("Среднее значение = " + medianValue);
    }
}
