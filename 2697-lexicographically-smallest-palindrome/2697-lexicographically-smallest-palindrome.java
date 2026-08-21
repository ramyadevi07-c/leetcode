class Solution {
    public String makeSmallestPalindrome(String s) {
        char [] str = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(right >left){
            if(str[right]==str[left]){
                left++;
                right--;
            }
            else{
                if(str[right]<str[left]){
                    str[left]=str[right];
                    left++;
                    right--;
                }
                else{
                    str[right]=str[left];
                    left++;
                    right--;
                }
            }
        }
        String res = "";
        for(char ch : str){
            res +=ch;
        }
        return res;
    }
}