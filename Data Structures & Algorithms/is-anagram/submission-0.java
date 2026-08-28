class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()){
            HashMap<Character, Integer> seen1 = new HashMap<>();
            HashMap<Character, Integer> seen2 = new HashMap<>();
            for (char c: s.toCharArray()) {
                if (seen1.containsKey(c)){
                    seen1.put(c, seen1.get(c) + 1);
                }
                else {
                    seen1.put(c, 1);
                }
            }
            for (char c: t.toCharArray()) {
                if (seen2.containsKey(c)){
                    seen2.put(c, seen2.get(c) + 1);
                }
                else {
                    seen2.put(c, 1);
                }
            }
            return (seen1.equals(seen2));
        }
        return false;
    }
}
