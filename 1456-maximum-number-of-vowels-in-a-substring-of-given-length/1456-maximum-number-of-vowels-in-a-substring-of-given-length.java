class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int max = 0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(vowel(s.charAt(i))){
                count++;
            }
            if(vowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    public boolean vowel(char ch){
        return ch=='a'||ch=='e'||ch=='o'||ch=='i'|ch=='u';
    }
}

