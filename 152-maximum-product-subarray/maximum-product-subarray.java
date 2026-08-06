class Solution {
    public int maxProduct(int[] nums) {
       int prefix =1;
       int surfix =1;
       int result = 0;
       for(int i=0;i<nums.length;i++){
        if(prefix == 0){
            prefix = 1;
        }
        if(surfix ==0){
            surfix = 1;
        }
        if(nums.length == 1){
            return nums[0];
        }
        prefix = prefix*nums[i];
        surfix = surfix*nums[nums.length-i-1];
        result = Math.max(result,Math.max(prefix,surfix)); 
       }
        return result;
        
    }
}