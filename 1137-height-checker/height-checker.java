class Solution {
    public int heightChecker(int[] arr) 
    {
        int max=Integer.MIN_VALUE,c=0;
        int h2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            h2[i]=arr[i];
            if(arr[i]>max)
            {
                
                max=arr[i];
            }
        }
        int a[]=new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            while(a[i]!=0)
            {
            arr[j]=i;
            a[i]--;
            j++;
            }
        
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=h2[i])
            {
                c++;
            }
        }
        return c;
    }
}