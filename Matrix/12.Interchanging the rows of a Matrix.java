class Solution
{
    //Function to interchange the rows of a matrix.
    static void interchangeRows(int mat[][])
    {
        // code here
        int r = mat.length;
        int c  = mat[0].length;

        for( int i=0; i<c;i++)
        {
            int low=0 ; int high=r-1;
            while(low<high)
            {
                int temp =mat[low][i];
                mat[low][i]=mat[high][i];
                mat[high][i] = temp;

                low++; high--;
            }
        }
    }
}
