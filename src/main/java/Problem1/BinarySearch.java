package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        return binaryHelper(data, target, 0, data.length - 1);
    }

    private static int binaryHelper(int[] data, int target, int start, int end) {
        int middle = (end + start) / 2;

        if(end < start) {
            return -1;
        }

        if (target == data[middle]) {
            return middle;
        } else if(target < data[middle]) {
            return binaryHelper(data, target, start, middle - 1);
        } else {
            return binaryHelper(data, target, middle + 1, end);
        }
    }
}
