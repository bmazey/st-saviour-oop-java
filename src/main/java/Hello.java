import java.time.Duration;
import java.time.Instant;

public class Hello {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 6, 7, 9, 11, 13, 15, 19, 21};

        int key = 24;

        int position = Searcher.recursiveBinary(numbers, key, 0, numbers.length - 1);
        if (position != -1) {
            System.out.println("Key " + key + " found at position " + position);
        } else {
            System.out.println("Key " + key + " not found!");
        }

        // // Record start of method call.
        // Instant start = Instant.now();

        // // Try with 45 ...
        // for (int i = 0; i < 20; i++) {
        //     System.out.print(recursiveFibonacci(i) + " ");
        // }

        // System.out.println("");

        // // Record end of method call.
        // Instant end = Instant.now();

        // // Compute duration of execution ...
        // Duration elapsed = Duration.between(start, end);

        // System.out.println("Time to execute recursive fibonacci: " + elapsed.getSeconds() + " seconds!");

        // // Now call dynamic implementation.
        // start = Instant.now();

        // // Try with 45 ...
        // for (int i = 0; i < 100; i++) {
        //     System.out.print(dynamicFibonacci(i) + " ");
        // }

        // System.out.println("");

        // // Record end of method call.
        // end = Instant.now();

        // // Compute duration of execution ...
        // elapsed = Duration.between(start, end);

        // System.out.println("Time to execute dynamic fibonacci: " + elapsed.getSeconds() + " seconds!");
    }

    public static int recursiveFibonacci(int x) {
        if (x <= 1) {
            return x;
        }

        return recursiveFibonacci(x - 1) + recursiveFibonacci(x - 2);
    }

    public static int dynamicFibonacci(int x) {
        // Handle the base cases
        if (x == 0 || x == 1) {
            return x;
        }

        int[] numbers = new int[x + 1];
        numbers[0] = 0;
        numbers[1] = 1;
        
        for(int i = 2; i <= x; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        // Return the final number in the array.
        return numbers[numbers.length - 1];
    }
}