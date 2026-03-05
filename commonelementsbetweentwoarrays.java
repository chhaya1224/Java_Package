package Amazon;

import java.util.HashSet;
import java.util.Set;

public class CommonInTwoArray {

    // Function to find common elements between two arrays
    static void findCommon(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        for (int num : a) {
            setA.add(num); // add all elements of first array to the set
        }

        System.out.print("Common elements: ");
        for (int num : b) {
            if (setA.contains(num)) { // check if element of b is in setA
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 6, 3, 4, 5};
        int[] b = {2, 4, 3, 1, 0};

        findCommon(a, b);
    }
}
