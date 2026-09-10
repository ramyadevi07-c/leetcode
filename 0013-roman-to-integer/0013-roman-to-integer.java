class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum =0;
        int length = s.length();
        for(int i=0;i<length;i++){
            int val = map.get(s.charAt(i));
            if(i<length-1 && val<map.get(s.charAt(i+1))){
                sum -= val;
            }
            else{
                sum+=val;
            }
        }
        return sum;
    }
}