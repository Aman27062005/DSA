class Solution 
{
    public int mySqrt(int x) 
    {
    int i = 1;
    // i*i<=x
    while (i <= x/i) 
    {
        i++;
    }

    return i - 1;
    }
}