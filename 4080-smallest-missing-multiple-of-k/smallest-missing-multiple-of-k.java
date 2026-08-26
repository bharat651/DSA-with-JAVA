class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int multiple = k;
        while(set.contains(multiple)){
            multiple += k;
        }
        return multiple;
        
    }
}