class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            boolean ans = true;
            int left =0;
            int right=words[i].length()-1;
            while(left<right){
                if(words[i].charAt(left)==words[i].charAt(right)){
                    left++;
                    right--;
                }
                else{
                    ans=false;
                    break;
                }
            }
            if(ans==true){
               return words[i];
            }
        }
        return "";
    }
}