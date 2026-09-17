import java.util.Arrays;

class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] answer = new int[n];
        int pos = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) pos = i;
            answer[i] = i - pos;
        }
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) pos = i;
            answer[i] = Math.min(answer[i], Math.abs(i - pos));
        }
        return answer;
    }
}
