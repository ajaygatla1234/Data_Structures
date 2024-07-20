public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target element is found
            }
        }
        return -1; // Return -1 if the target element is not found
    }

    //Time Complexity  : O(n)
    //Space Complexity : O(1)

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 9, 4 };
        int target = 8;
        int result = linearSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
