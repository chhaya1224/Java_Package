import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "hello world";

        // Convert string to char array
        char[] chars = str.toCharArray();

        // Create a HashMap to store frequency
        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : chars) {
            if (c != ' ') { // skip spaces (optional)
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the count of each character
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
