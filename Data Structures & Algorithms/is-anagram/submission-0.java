public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!charCount.containsKey(c)) {
                return false;
            }
            int count = charCount.get(c) - 1;
            if (count < 0) {
                return false;
            }
            charCount.put(c, count);
        }

        return true;
    }
}