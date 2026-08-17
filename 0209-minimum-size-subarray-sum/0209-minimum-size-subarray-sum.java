class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int left=0;
        int min_length=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=target){
                min_length = Math.min(right-left+1,min_length);
                sum-=nums[left];
                left++;
            }
        }
        if(min_length == Integer.MAX_VALUE){
            min_length=0;
        }
        return min_length;
    }
}