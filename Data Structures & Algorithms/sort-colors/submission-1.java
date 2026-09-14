class Solution {
    public void sortColors(int[] nums) {
        int zero=0, one=0, two=0, post=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
            {
                zero++;
            }
            else if(nums[i]==1)
            {
                one++;
            }
            else
            {
                two++;
            }
        }
        for(int i=0; i<zero; i++)
        {
            nums[post]=0;
            post++;
        }
        for(int i=0; i<one; i++)
        {
            nums[post]=1;
            post++;
        }
        for(int i=0; i<two; i++)
        {
            nums[post]=2;
            post++;
        }
    }
}
