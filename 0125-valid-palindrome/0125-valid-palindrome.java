class Solution {
    public boolean isPalindrome(String s) {
        String news = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left =0;
        int right = news.length()-1;
        while(left<right){
            if(news.charAt(left)==news.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}