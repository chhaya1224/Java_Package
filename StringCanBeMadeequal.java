
///  
You are given two strings s1 and s2, both of length 4, consisting of lowercase English letters.

Example 1:

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: We can do the following operations on s1:
- Choose the indices i = 0, j = 2. The resulting string is s1 = "cbad".
- Choose the indices i = 1, j = 3. The resulting string is s1 = "cdab" = s2.
Example 2:
Input: s1 = "abcd", s2 = "dacb"
Output: false
Explanation: It is not possible to make the two strings equal.

=================================================================================
class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char even1[]={s1.charAt(0),s1.charAt(2)};
        char odd1[]={s1.charAt(1),s1.charAt(3)};
        char even2[]={s2.charAt(0),s2.charAt(2)};
        char odd2[]={s2.charAt(1),s2.charAt(3)};
        Arrays.sort(even1);
        Arrays.sort(odd1);
        Arrays.sort(even2);
        Arrays.sort(odd2);
        return Arrays.equals(even1,even2) && Arrays.equals(odd1,odd2);



    }
}
