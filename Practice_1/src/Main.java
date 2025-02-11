import java.util.Random;

public class Main {
        private static int partition(int a[], int low, int high) {
            int pivot = a[high];
            int i = (low-1);
            for (int j=low; j<high; j++) {
                if (a[j] <= pivot)
                {
                    i++;

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            int temp = a[i+1];
            a[i+1] = a[high];
            a[high] = temp;

            return i+1;
        }


        public static void qSort(int a[], int l, int h) {
            if (l < h) {
                int pi = partition(a, l, h);

                qSort(a, l, pi-1);
                qSort(a, pi+1, h);
            }
        }

        public static void main(String args[]) {
            Random rand = new Random();

            int N = rand.nextInt(300);
            int arr[] = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = rand.nextInt(9000);
            }

            int n = arr.length;

            qSort(arr, 0, n-1);

            for (int i=0; i<n; ++i) {
                System.out.println(arr[i]);
            }
        }
}