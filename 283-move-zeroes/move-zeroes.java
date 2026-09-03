class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int s=0;
        int e=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[s]!=0)
            {
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                e++;
            }
            s++;
        }
        System.out.print(nums);
    }
}