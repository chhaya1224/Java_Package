import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {
    public static void main(String[] args) {
        // Step 1: Define array A
        Integer[] A = {5, 3, 8, 1, 7};

        // Step 2: Replace one element in A
        // Let's replace the element at index 2 (3rd element) with 10
        A[2] = 10;

        // Step 3: Copy all elements from A to B
        Integer[] B = Arrays.copyOf(A, A.length);

        // Step 4: Sort B in descending order
        Arrays.sort(B, Collections.reverseOrder());

        // Step 5: Print B
        System.out.println("Array B in descending order: " + Arrays.toString(B));
    }
}
