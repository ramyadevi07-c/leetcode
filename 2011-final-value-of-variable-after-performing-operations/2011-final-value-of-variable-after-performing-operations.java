class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val=0;
        for(String op :operations){
            if(op.equals("--X")){
                --val;
            }
            if(op.equals("X--")){
                val--;
            }
            if(op.equals("++X")){
                ++val;
            }
            if(op.equals("X++")){
                val++;
            }
        }
        return val;
    }
}