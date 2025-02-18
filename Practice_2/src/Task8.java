public class Task8 {
    private static final int NUM_ELEMENTS = 30;
    private static final int MAX_NUM = 1000;

    private static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swaped;

        for (i = 0; i < n - 1; i++) {
            swaped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaped = true;
                }
            }
            if (swaped = false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[NUM_ELEMENTS];

        System.out.print("Unsorted array: ");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            arr[i] = (int)(Math.random()*MAX_NUM);

            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr, NUM_ELEMENTS);

        System.out.println();
        System.out.print("Bubble sorted array: ");
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
