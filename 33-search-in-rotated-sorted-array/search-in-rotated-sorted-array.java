class Solution 
{
    public int search(int[] nums, int tar)
    {
         return binarysearch(nums,tar,0,nums.length-1);
    }
    public int binarysearch(int[] arr, int tar,int si,int ei) 
    {
        if(si>ei)
        {
            return -1;
        }
        int mid =si+(ei-si)/2;
        if(arr[mid]==tar)
        {
            return mid;
        }
        if(arr[si]<=arr[mid])
        {
            if(arr[si]<=tar && tar<=arr[mid])
            {
                return binarysearch(arr,tar,si,mid-1);
            }
            else
            {
                return binarysearch(arr,tar,mid+1,ei);
            }
        }
        else
        {
            if(arr[mid]<=tar && tar<=arr[ei])
            {
                return binarysearch(arr,tar,mid+1,ei);
            }
            else
            {
                return binarysearch(arr,tar,si,mid-1);
            }
        }
    }
}