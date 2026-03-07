import java.util.HashSet;

public class Main {
    public static String longestSubstringWithoutRepeating(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLen = 0, start = 0, end = 0;
        int maxStart = 0; // To remember the starting index of the max substring

        while (end < s.length()) {
            char c = s.charAt(end);
            if (!set.contains(c)) {
                set.add(c);
                if (end - start + 1 > maxLen) {
                    maxLen = end - start + 1;
                    maxStart = start; // Update start index of max substring
                }
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }       return s.substring(maxStart, maxStart + maxLen);
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        String longestSub = longestSubstringWithoutRepeating(input);
        System.out.println("Input: " + input);
        System.out.println("Longest substring without repeating characters: " + longestSub);
        System.out.println("Length: " + longestSub.length());
    }
}
