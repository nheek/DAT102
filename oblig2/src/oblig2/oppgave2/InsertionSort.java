package oblig2.oppgave2;

public class InsertionSort {

    // Original insertion sort algorithm
    public void insertionSortOriginal(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Modified insertion sort with optimization
    public void insertionSortModified(Comparable[] arr) {
        int n = arr.length;
        // Find the index of the smallest element
        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(arr[minIndex]) < 0) {
                minIndex = i;
            }
        }
        // Swap the smallest element to the beginning
        Comparable temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;

        // Perform insertion sort starting from index 1
        for (int i = 1; i < n; ++i) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    // b
    public static void insertionSortTwoElements(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i += 2) {
            Comparable smallest = arr[i - 1];
            Comparable largest = arr[i];
            
            if (largest.compareTo(smallest) < 0) {
                Comparable temp = smallest;
                smallest = largest;
                largest = temp;
            }
            
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(largest) > 0) {
                arr[j + 2] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = smallest;
            arr[j + 2] = largest;
        }
    }
}