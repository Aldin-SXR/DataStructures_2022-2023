package week3;

public class App {

    public static void main(String[] args) {
        int[] elements = {3, -12, 6, 8, 23, 90, 56, -5, 4};

        // linear search for element 23
        int index = Search.linearSearch(elements, 23);
        System.out.println("Element found at: " + index);

        // linear search for element 42
        index = Search.linearSearch(elements, 42);
        System.out.println("Element found at: " + index);

        // The array has to be sorted
        int[] elements2 = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        // binary search for element 23
        index = Search.binarySearch(elements2, 23);
        System.out.println("Element found at: " + index);

        // binary search for element 24
        index = Search.binarySearch(elements2, 24);
        System.out.println("Element found at: " + index);
    }
}
