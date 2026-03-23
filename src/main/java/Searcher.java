public class Searcher {

    public static int recursiveBinary(int[] sorted, int key, int low, int high) {
        // Base case for key not found.
        if (high < low) {
            return -1;
        }

        int middle = low + ((high - low) / 2);

        // Base case for key found.
        if (key == sorted[middle]) {
            return middle;
        } else if (key < sorted[middle]) {
            return recursiveBinary(sorted, key, low, middle - 1);
        } else {
            return recursiveBinary(sorted, key, middle + 1, high);
        }
    }
}
