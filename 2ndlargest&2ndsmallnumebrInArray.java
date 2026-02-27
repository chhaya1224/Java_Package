package java_package;

public class dessort {

    public static void main(String[] args) {
        int array[] = {9, 2, 3, 5, 62, 2, 3, 5, 9};

        // Sort array in descending order
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array (desc): ");
        for(int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Largest and 2nd Largest
        System.out.println("Largest element: " + array[0]);
        System.out.println("2nd largest element: " + array[1]);

        // Smallest and 2nd Smallest
        System.out.println("Smallest element: " + array[array.length - 1]);
        System.out.println("2nd smallest element: " + array[array.length - 2]);
    }
}
