package com.gl.searching;

public class BinarySearch {
	
	public static int binarySearch_1(int arr[], int searchElement, int lowerIndex, int higherIndex) {
		
		while(lowerIndex<=higherIndex) {
			int mid=lowerIndex+(higherIndex-lowerIndex)/2;
			
			if(arr[mid]==searchElement) {
				return mid;
			}
			else if(arr[mid]>searchElement) {
				
			}
		}
	}

	public static void binarySearch_2(int arr[], int searchElement, int lowerIndex, int higherIndex) {

		if(lowerIndex>higherIndex) {
			System.out.println("search element cannot be found in an array");
			return;
		}

		int mid=lowerIndex+(higherIndex-lowerIndex)/2;

		if(arr[mid]==searchElement) {
			System.out.println(searchElement+" found at index "+mid);
		}
		else {
			if(searchElement>arr[mid]) {
				binarySearch_2(arr, searchElement, mid+1, higherIndex);
			}
			else {
				binarySearch_2(arr, searchElement, lowerIndex, mid);
			}
		}
	}
	
	/*
	 * avg & worst case - O(log n)
	 * best - O(1) - if element found at mid index
	 * 
	 * space - o(1) - constant space complexity
	 * 
	 */

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};

		int searchElement=5;

		binarySearch(arr, searchElement, 0, arr.length-1);

	}
	
	//---------------OR-----------------

	/*
	 * int binarySearch(int arr[], int l, int r, int x)
    {
        while (l <= r) {
            int mid = (l + r) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x) {
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1 
            } else if (arr[mid] > x) {
                r = mid - 1;

            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
              l = mid + 1;
            }  
        }

        // We reach here when element is not present
        //  in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();

        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
	 */

}
