package DSA_A2Z.SortingAlgorithm;

public class InsertionSort {
    public void sortAndPrint() {
        int arr[] = {1, 3, 2, 8, 9, 4, 7};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
