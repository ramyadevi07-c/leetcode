class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                int i1 = left + 1, j1 = right;
                boolean opt1valid = true;
                while (i1 < j1) {
                    if (s.charAt(i1) != s.charAt(j1)) { 
                        opt1valid = false; 
                        break; 
                    }
                    i1++; 
                    j1--;
                }
                int i2 = left, j2 = right - 1;
                boolean opt2valid = true;
                while (i2 < j2) {
                    if (s.charAt(i2) != s.charAt(j2)) { 
                        opt2valid = false; 
                        break; 
                    }
                    i2++; 
                    j2--;
                }
                return opt1valid || opt2valid;
            }
        }
        return true;
    }
}
