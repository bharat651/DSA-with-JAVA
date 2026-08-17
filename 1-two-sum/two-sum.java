class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sortedArray = nums.clone();
        Map<Integer,Integer> m = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;
        for(int i=0;i<nums.length;i++){
            int findValue = target - nums[i];
            if(m.containsKey(findValue)){
                startIndex = m.get(findValue);
                endIndex = i;
            }
            else{
                m.put(nums[i],i);
            }
        }
        return new int[]{startIndex,endIndex};
    }
}