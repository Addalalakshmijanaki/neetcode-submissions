class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int fast,slow=0;
        for( fast=1;fast<nums.length;fast++){
            if(nums[slow]==nums[fast]){
                continue;
            }
            else if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
}