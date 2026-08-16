class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charcounts = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            charcounts[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            charcounts[ransomNote.charAt(i) - 'a']--;
            if (charcounts[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
