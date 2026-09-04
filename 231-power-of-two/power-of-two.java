class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        // if it is asked it it power of so and so base , use base inplace of 2
        if(Math.pow(2,Math.floor(Math.log(n)/Math.log(2)))==n && n!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}