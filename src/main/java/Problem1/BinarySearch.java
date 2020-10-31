package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        return binaryHelper(data, target, 0, data.length - 1);
    }

    public static int binaryHelper(int[] array, int search, int start, int end) {
        int middle = (end + start) / 2;

        if(end < start) {
            return -1;
        }

        if (search == array[middle]) {
            return middle;
        } else if(search < array[middle]) {
            return binaryHelper(array, search, start, middle - 1);
        } else {
            return binaryHelper(array, search, middle + 1, end);
        }
    }
}
