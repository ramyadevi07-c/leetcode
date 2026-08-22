class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet <Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int min = nums[0];
        int max = nums[nums.length-1];
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}