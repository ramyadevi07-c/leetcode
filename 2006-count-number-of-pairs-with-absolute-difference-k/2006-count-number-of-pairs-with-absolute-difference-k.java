import java.util.*;
class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        int pairs = 0;
        for (int num : nums) {
            if (counts.containsKey(num - k)) {
                pairs += counts.get(num - k);
            }
            if (counts.containsKey(num + k)) {
                pairs += counts.get(num + k);
            }
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return pairs;
    }
}
