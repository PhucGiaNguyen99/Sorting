public class MergeSort {
    public void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // fill the left and right array
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[p + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[q + 1 + j];
        }

        // maintain current index of sub arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either the end of either left array or right array, pick larger among elements
        // left and right and place them in the correct position at A[p...r]
        // for sorting in descending order use if (leftArr[i]>=rightArr[j])
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        // when we run out of elements in either left array or right array, pick up the remaining elements
        // and put in arr[p...r]
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Divide the array into 2 sub arrays, sort them and merge them
    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // recursive call to each sub arrays
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge the sorted sub arrays
            merge(arr, left, mid, right);
        }
    }
}
