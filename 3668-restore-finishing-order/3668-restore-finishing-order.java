class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int [] arr = new int[friends.length];
        int index=0;
        for(int num : order){
            for(int frnd : friends){
                if(num==frnd){
                    arr[index++]=num;
                }
            }
        }
        return arr;
    }
}