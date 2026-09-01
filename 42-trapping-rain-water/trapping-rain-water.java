class Solution {
    public int trap(int[] height)
    {
        int l[]=new int[height.length];
        int r[]=new int[height.length];
        l[0]=height[0];
        r[height.length-1]=height[height.length-1];
        int wt=0,s=0;
        for(int i=1;i<height.length;i++)
        {
            l[i]=Math.max(height[i],l[i-1]);
        }
        for(int j=height.length-2;j>=0;j--)
        {
            r[j]=Math.max(height[j],r[j+1]);
        }
        for(int k=0;k<height.length;k++)
        {
            wt=Math.min(l[k],r[k]);
            s+=(wt-height[k]);
        }
        return s;
    }
}