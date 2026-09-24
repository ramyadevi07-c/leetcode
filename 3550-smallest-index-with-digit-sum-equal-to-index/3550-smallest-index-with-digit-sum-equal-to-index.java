class Solution {
    public int smallestIndex(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if (nums[i]<=9){
                if(i==nums[i]){
                    min = Math.min(i,min);
                }
            }
            else if(nums[i]>9){
                int n=nums[i];
                int sum=0;
                while(n!=0){
                    sum+=n%10;
                    n/=10;
                }
                if(sum==i){
                    min = Math.min(min,i);
                }
            }
            
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        else{return min;}
    }
}