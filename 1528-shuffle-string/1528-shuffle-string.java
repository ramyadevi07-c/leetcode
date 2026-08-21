class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer,Character> map = new TreeMap<>();
        char [] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            map.put(indices[i],arr[i]);
        }
        String str = "";
        int index=0;
        for(int i=0;i<s.length();i++){
            str+=map.get(index++);
        }
        return str;
    }
}