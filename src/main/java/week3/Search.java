package week3;

public class Search {

    public static int linearSearch(int[] elements, int key) {
        for (int i = 0; i < elements.length; i++) {
            if (key == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] elements, int key) {
        int low = 0;
        int high = elements.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key > elements[mid]) {
                low = mid + 1;
            } else if (key < elements[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
