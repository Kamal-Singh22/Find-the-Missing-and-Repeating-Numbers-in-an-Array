import java.util.Arrays;

public class MissingAndRepeating {

    public static void findMissingAndRepeating(int[] arr) {
        int n = arr.length;
        int[] count = new int[n + 1];

        // Step 1: Count the frequency of each number
        for (int num : arr) {
            count[num]++;
        }

        int missing = -1, repeating = -1;

        // Step 2: Identify the missing and repeating numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeating = i;
            }
        }

        // Output the results
        System.out.println("Missing: " + missing + ", Repeating: " + repeating);
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 6, 2, 1, 1};
        System.out.println("Array: " + Arrays.toString(arr1));
        findMissingAndRepeating(arr1);

        int[] arr2 = {3, 1, 2, 3};
        System.out.println("\nArray: " + Arrays.toString(arr2));
        findMissingAndRepeating(arr2);
    }
}
