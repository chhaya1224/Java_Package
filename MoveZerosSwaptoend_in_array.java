package java_package;

import java.util.Arrays;

public class MoveZerosSwaptoend_in_array {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int tem = arr[i];
                arr[i] = arr[index];
                arr[index] = tem;
               index++;
            }
        }

        // Correct printing
        System.out.println(Arrays.toString(arr));
    }
}
