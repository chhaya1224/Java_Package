import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);

            if (map.containsKey(c)) {
                // Move start to the next of last occurrence
                start = Math.max(start, map.get(c) + 1);
            }

            map.put(c, end); // Update last index of char
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(s));
    }
}
