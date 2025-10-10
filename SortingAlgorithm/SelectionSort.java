package SortingAlgorithm;

import java.util.Scanner;

public class SelectionSort {
    //find the minimum of all the elements and swap it with the first element of the arraay 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            // Swap the elements
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
