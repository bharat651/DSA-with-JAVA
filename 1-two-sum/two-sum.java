class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> index = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int complite= target - nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == complite){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}