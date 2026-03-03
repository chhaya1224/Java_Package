package java_package;

public class MissingNumberXOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int xor = 0;
        // XOR numbers from 1 to n

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        // XOR array elements
        for (int num : arr) {
            xor ^= num;
        }

        System.out.println("Missing number: " + xor);



	}

}
