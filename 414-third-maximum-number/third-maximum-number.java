import java.util.Arrays;
import java.util.Collections;
class Solution 
{
    public int thirdMax(int[] nums) 
    {
        Arrays.sort(nums);
        int c=1,i;
        for(i=nums.length-2;i>=0;i--)
        {
            if(nums[i+1]!=nums[i])
            {
                c++;
            }
            if(c==3)
            {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}