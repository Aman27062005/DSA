class Solution {
    public int lengthOfLastWord(String str) 
    {
        int c=0;
        str=str.trim();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                break;
            }
            c++;

        }
    
        return c;
        }    
    }