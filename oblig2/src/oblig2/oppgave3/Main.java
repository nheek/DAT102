package oblig2.oppgave3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
        // Insertion sort
		System.out.println("Insertion sort");
		testInsertionArray(32000);
		testInsertionArray(64000);
		testInsertionArray(128000);
		System.out.println("------------------------------");
        
    	// Selection sort
		System.out.println("Selection sort");
		testSelectionArray(32000);
		testSelectionArray(64000);
		testSelectionArray(128000);
		System.out.println("------------------------------");
        
        // Quick sort
        System.out.println("Quick sort");
		testQuickArray(32000);
		testQuickArray(64000);
		testQuickArray(128000);
        System.out.println("------------------------------");
        
        // Merge sort
        System.out.println("Merge sort");
		testMergeArray(32000);
		testMergeArray(64000);
		testMergeArray(128000);
        System.out.println("------------------------------");
	}
	
	public static int[] initArray(int amountOfEl) {
		int[] arr = new int[amountOfEl];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        
        return arr;
	}
	
	public static void testInsertionArray(int amountOfEl) {
	    long totalDuration = 0;

	    for (int x = 0; x < 10; x++) {
	        int[] arr = initArray(amountOfEl);
	        long startTime = System.nanoTime();
	        SortingAlgo.insertionSort(arr);
	        long endTime = System.nanoTime();
	        long duration = (endTime - startTime);
	        totalDuration += duration;
	    }

	    double averageDurationInNs = totalDuration / 10.0;
	    double averageDurationInMs = averageDurationInNs / Math.pow(10, 6);
	    System.out.println(averageDurationInMs + " milliseconds");
	}
	
	public static void testSelectionArray(int amountOfEl) {
		long totalDuration = 0;

	    for (int x = 0; x < 10; x++) {
	        int[] arr = initArray(amountOfEl);
	        long startTime = System.nanoTime();
	        SortingAlgo.selectionSort(arr);
	        long endTime = System.nanoTime();
	        long duration = (endTime - startTime);
	        totalDuration += duration;
	    }

	    double averageDurationInNs = totalDuration / 10.0;
	    double averageDurationInMs = averageDurationInNs / Math.pow(10, 6);
	    System.out.println(averageDurationInMs + " milliseconds");
	}
	
	public static void testQuickArray(int amountOfEl) {
		long totalDuration = 0;

	    for (int x = 0; x < 10; x++) {
	        int[] arr = initArray(amountOfEl);
	        long startTime = System.nanoTime();
	        SortingAlgo.quickSort(arr, 0, amountOfEl - 1);
	        long endTime = System.nanoTime();
	        long duration = (endTime - startTime);
	        totalDuration += duration;
	    }

	    double averageDurationInNs = totalDuration / 10.0;
	    double averageDurationInMs = averageDurationInNs / Math.pow(10, 6);
	    System.out.println(averageDurationInMs + " milliseconds");
	}
	
	public static void testMergeArray(int amountOfEl) {
		long totalDuration = 0;

	    for (int x = 0; x < 10; x++) {
	        int[] arr = initArray(amountOfEl);
	        long startTime = System.nanoTime();
	        SortingAlgo.mergeSort(arr, 0, amountOfEl - 1);
	        long endTime = System.nanoTime();
	        long duration = (endTime - startTime);
	        totalDuration += duration;
	    }

	    double averageDurationInNs = totalDuration / 10.0;
	    double averageDurationInMs = averageDurationInNs / Math.pow(10, 6);
	    System.out.println(averageDurationInMs + " milliseconds");
	}
	
	public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
