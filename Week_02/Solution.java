class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> objectObjectHashMap = new java.util.HashMap<>();
        for (int i=0; i< nums.length; i++) {
            if (objectObjectHashMap.containsKey(target-nums[i])) {
                return new int[]{objectObjectHashMap.get(target-nums[i]), i};
            }
            objectObjectHashMap.put(nums[i], i);
        }
        return new int[0];
    }
}