class Solution {
    public int[][] generateMatrix(int n) 
    {
        
        int sc=0;
        int sr=0;
        int ec=n-1;
        int er=n-1;
        int matrix[][] = new int[n][n];
        int k=1;
        while(sr<=er && sc<=ec)
        {
            
            for(int j=sc;j<=ec;j++)
            {
                matrix[sr][j]=k;
                k++;
            }
            for(int i=sr+1;i<=er;i++)
            {
                matrix[i][ec]=k;
                k++;
            }
            for(int j=ec-1;j>=sc;j--)
            {
                if(sr==er)
                {
                    break;
                }
                matrix[er][j]=k;
                k++;
            }
            for(int i=er-1;i>=sr+1;i--)
            {
                if(sc==ec)
                {
                    break;
                }
                matrix[i][sc]=k;
                k++;
            }
            sc++;
            sr++;
            ec--;
            er--;
        }
        return matrix;




    }
}   
