class Solution {
    public boolean isPowerOfFour(int n) 
    {
        if(Math.pow(4,Math.floor(Math.log(n)/Math.log(4)))==n && n!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}