class Solution {
    public int mySqrt(int x) {
        long low=1, high=x;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(mid*mid==x)
            {
                return (int) mid;
            }
            else if(x>mid*mid)
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        return (int) high;
    }
}