import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();

        for (int x : nums) {
            h.put(x, h.getOrDefault(x, 0) + 1);
        }

        for (int count : h.values()) {
            if (count >= 2) return true;
        }

        return false;
    }
}
