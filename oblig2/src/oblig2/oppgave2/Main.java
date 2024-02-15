package oblig2.oppgave2;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
        // Example usage and testing
        // Integer[] arr = {5, 2, 4, 6, 1, 3};
        // Create an array with 1000 elements
//        Integer[] arr = new Integer[60000];
        Integer[] arr = new Integer[30000];
        
        // Fill the array with random integers
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000); // Generate random integers between 0 and 999
        }
        
        // Test original insertion sort
        long startTime = System.nanoTime();
        insertionSort.insertionSortOriginal(arr);
        long endTime = System.nanoTime();
        long durationOriginal = (endTime - startTime);
        double durationOriginalInSec = durationOriginal / Math.pow(10, 9);
        /* System.out.println("Sorted array using original insertion sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        */
        System.out.println("\nTime taken (Original): " + durationOriginal + " nanoseconds / " 
        					+ durationOriginalInSec + " seconds");
        /* Vi har observert at jo flere elementer det er i arrayen,
         * jo mer tid treng den, men at det går i en kurve og
         * ikke parrallelt straight
         */
        
        // Test modified insertion sort
        Integer[] arr2 = {5, 2, 4, 6, 1, 3}; // Reset array
        startTime = System.nanoTime();
        insertionSort.insertionSortModified(arr2);
        endTime = System.nanoTime();
        long durationModified = (endTime - startTime);

        System.out.println("\nSorted array using modified insertion sort:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println("\nTime taken (Modified): " + durationModified + " nanoseconds");
    }
}
