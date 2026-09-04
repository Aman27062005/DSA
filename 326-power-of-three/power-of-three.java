class Solution {
    public boolean isPowerOfThree(int n) 
    {
        if(Math.pow(3,Math.floor(Math.log(n)/Math.log(3)+1e-10))==n && n!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}