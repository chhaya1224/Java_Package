package java_package;

import java.util.Arrays;

public class MoveZerosToBeginning {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int index = arr.length - 1; // Start from the end

        // Traverse from the end to the beginning
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                // Swap non-zero element to the current index
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index--; // Move the index left
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
