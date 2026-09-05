class Solution {
    public boolean isPalindrome(String s)
    {
       s = s.replaceAll("[^a-zA-Z0-9]","");
       s=s.toLowerCase(); 
       int lp=0;
       int rp=s.length();
       for(int i=0;i<=s.length()-1;i++)
       {
        if(s.charAt(i)!=s.charAt(s.length()-1-i))
        {
            return false;
        }
       }
       return true;
    }
}