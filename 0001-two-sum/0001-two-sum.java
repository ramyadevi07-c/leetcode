import java.util.*;
class Solution {
    public int[] twoSum(int[] original, int target) {
        for(int i=0;i<original.length;i++){
            for(int j=i+1;j<original.length;j++){
                if(original[i]+original[j]==target){
                    return new int[]{i,j};
                }
            }
       }
       return new int[]{};
    }
}