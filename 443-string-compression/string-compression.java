class Solution
 {
    public int compress(char[] chars) 
    {
        StringBuilder ss=new StringBuilder("");
        for(int i=0;i<chars.length;i++)
        {
            ss.append(chars[i]);
        }
        String str=ss.toString();

        StringBuilder sc=new StringBuilder("");
        int c=1;
        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i-1)==str.charAt(i))
            {
                c++;
            }
            else
            {
                if(c==1)
                {
                    sc.append(str.charAt(i-1));
                    c=1;
                }
                else
                {
                    sc.append(str.charAt(i-1));
                    sc.append(c);
                    c=1;
                }
            }
        }
        sc.append(str.charAt(str.length() - 1));
        if(c > 1)
        {
            sc.append(c);
        }

        for(int i = 0; i < sc.length(); i++) 
        { 
            chars[i] = sc.charAt(i);
        }
        return sc.length();
    }
}