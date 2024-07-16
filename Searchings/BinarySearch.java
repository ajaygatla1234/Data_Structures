public class BinarySearch {

    // Iterative Binary Search
    public static int binarySearch_1(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid; // Return the index if the target element is found
            } else if (arr[mid] < target) {
                low = mid + 1; // Update low pointer
            } else {
                high = mid - 1; // Update high pointer
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    // Recursive Binary Search
    public static void binarySearch_2(int[] arr, int searchElement, int lowerIndex, int higherIndex) {
        if (lowerIndex > higherIndex) {
            System.out.println("Element not found in the array.");
            return;
        }

        int mid = lowerIndex + (higherIndex - lowerIndex) / 2;

        if (arr[mid] == searchElement) {
            System.out.println(searchElement + " found at index " + mid);
        } else {
            if (searchElement > arr[mid]) {
                binarySearch_2(arr, searchElement, mid + 1, higherIndex);
            } else {
                binarySearch_2(arr, searchElement, lowerIndex, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int target = 7;

        // Using iterative binary search
        int result = binarySearch_1(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Using recursive binary search
        binarySearch_2(arr, target, 0, arr.length - 1);
    }
}
