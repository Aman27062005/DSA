class Solution {
    public boolean isPalindrome(int x) 
    {
        int r=0;
        int rev=0;
        int n=x;
        if(n<0)
        {
            return false;
        }
        while(x!=0)
        {
            r=x%10;
            rev=rev*10+r;
            x=x/10;
        }
        if(n==rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}