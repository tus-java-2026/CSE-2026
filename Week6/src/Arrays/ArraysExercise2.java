package Arrays;

import java.util.Arrays;

public class ArraysExercise2 {

    public static void main(String[] args) {
        statistics();
    }

    private static void statistics() {

        // Initialize the arrays
        int[] arr1 = {9, 3, 44, 17, 15};
        int[] arr2 = {8, -6, 89, 17, 12, 6};

        // Statistics for Array 1
        System.out.println("Array 1");
        average(arr1);
        median(arr1);
        range(arr1);

        System.out.println();

        // Statistics for Array 2
        System.out.println("Array 2");
        average(arr2);
        median(arr2);
        range(arr2);
    }

    // Calculate the average
    private static void average(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.println("The average is " + avg);
    }

    // Calculate the median
    private static void median(int[] arr) {

        // Make a copy so the original array is not changed
        int[] temp = arr.clone();

        Arrays.sort(temp);

        double median;

        if (temp.length % 2 == 0) {

            median = (temp[temp.length / 2 - 1] + temp[temp.length / 2]) / 2.0;

        } else {

            median = temp[temp.length / 2];
        }

        System.out.println("Median value is " + median);
    }

    // Calculate the range
    private static void range(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Range = " + (max - min));
    }
}

