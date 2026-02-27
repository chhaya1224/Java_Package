import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenNumbersFromInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
    }
}
