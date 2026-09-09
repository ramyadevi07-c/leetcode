class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        String [] str = s.trim().split("\\s+");
        if(pattern.length()!= str.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            String word = str[i];
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
            if(!map.get(ch).equals(word)){
                return false;
            }
            }
            else{
                if(map.containsValue(word)){
                    return false;
                }
                map.put(ch,word);
            }

        }
        return true;
    }
}