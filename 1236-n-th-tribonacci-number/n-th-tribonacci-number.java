class Solution 
{
    public int tribonacci(int n) 
    {
        int[] arr = initialise(n);
        return ans(arr, n);
    }
    public int[] initialise(int n)
    {
        int arr[]=new int[n+1];
        for(int i=0;i<=arr.length-1;i++)
        {
            arr[i]=-1;
        }
        return arr;
    }
    public static int ans(int arr[],int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if(n==2)
        {
            return 1;
        }
        if(arr[n] != -1)
        {
            return arr[n];
        }
        arr[n]=ans(arr,n-1)+ans(arr,n-2)+ans(arr,n-3);
        return arr[n];
    }
}