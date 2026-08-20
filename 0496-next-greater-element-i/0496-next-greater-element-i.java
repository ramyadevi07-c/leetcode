class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int n1 : nums2) {
            while(!stack.isEmpty() && stack.peek() < n1) {
                map.put(stack.pop(), n1);
            }
            stack.push(n1);
        }
        int[] arr = new int[nums1.length];
        for (int i=0;i<nums1.length;i++) {
            if (map.containsKey(nums1[i])) {
                arr[i]= map.get(nums1[i]);
            }
            else{
                arr[i] = -1;
            }
        }
        return arr;
    }
}