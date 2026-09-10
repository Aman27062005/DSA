class Solution {
    public int addDigits(int num) 
    {
        if(num<10)
        {
            return num;
        }
        int r=0;
        int sum=0;
        while(num>0)
        {
            r=num%10;
            sum+=r;
            num/=10;
        }
        return addDigits(sum);
    }
}