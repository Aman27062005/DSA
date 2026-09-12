class Solution {
    public int singleNumber(int[] nums) 
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums.length==1)
            {
                return nums[0];
            }
            if(i==0 || i==nums.length-1)
            {
                if(i==0 && nums[i]!=nums[i+1])
                {
                    return nums[i];
                }
                else if(i==nums.length-1 && nums[i]!=nums[i-1])
                {
                    return nums[i];
                }
            }
            else
            {
                if(nums[i-1]==nums[i] || nums[i+1]==nums[i])
                {
                    continue;
                }
                else
                {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}