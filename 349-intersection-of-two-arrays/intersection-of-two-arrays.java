class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet();
        for(int num:nums1){
            set.add(num);
        }
        Set<Integer> result = new HashSet();
        for(int num:nums2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        int[] ans = new int[result.size()];
        int index = 0;
        for(int each:result){
            ans[index++] = each;
        }
        return ans;
    }
}