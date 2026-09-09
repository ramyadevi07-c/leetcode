import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer>map = new HashMap<>();
       for(int num:nums){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }
        else{
            map.put(num,1);
        }
        if(map.get(num)==2){
            return true;
        }
       } 
       return false;
    }
}