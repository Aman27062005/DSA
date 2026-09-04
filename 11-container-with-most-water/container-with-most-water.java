class Solution {
    public int maxArea(int[] height) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<height.length;i++)
        {
            list.add(height[i]);
        }
        return storeWater(list);
    }
    public int storeWater(ArrayList<Integer> list)
    {
        int lp=0;
        int rp=list.size()-1;
        int width=0;
        int maxarea=0,currarea=0;
        while(lp<rp)
        {
            width=rp-lp;
            currarea=Math.min(list.get(rp),list.get(lp))*width;
            maxarea=Math.max(maxarea,currarea);
            if(list.get(lp)<list.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
    return maxarea;
    }
}