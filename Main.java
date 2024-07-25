import java.util.*;

class Selection {
    public void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            // swapping
            int temp = arr[minimum];
            arr[minimum] = arr[i];
            arr[i] = temp;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        System.out.println("Enter unsorted array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Selection selection = new Selection();
        selection.selectionSort(arr, n);
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
