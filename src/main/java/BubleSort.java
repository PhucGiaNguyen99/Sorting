public class BubleSort {
    void BubleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.println("j: " + j);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        BubleSort ob = new BubleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ob.BubleSort(arr);

    }

}
