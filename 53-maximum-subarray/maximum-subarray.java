import java.util.*;
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            cs+=nums[i];
            if(cs<0)
            {
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        if(ms==0)
        {
            int s=Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]>s)
                {
                    s=nums[j];
                }
            }
            return s;
        }
        else
        {
            return ms;
        }
    }
}