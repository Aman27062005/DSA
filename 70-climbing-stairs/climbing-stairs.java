class Solution {
    public int climbStairs(int n) 
    {
        int ways[]=new int[n+1];
        Arrays.fill(ways,-1);
        return co(n,ways);

    }
    public int co(int n, int ways[])
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        if(ways[n]!=-1)
        {
            return ways[n];
        }
        ways[n]=co(n-1,ways)+co(n-2,ways);
        return ways[n];
    }
}