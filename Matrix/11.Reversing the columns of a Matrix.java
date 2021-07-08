
class Solution
{
    //Function to reverse the columns of a matrix.
    static void reverseCol(int mat[][])
    {
        // code here
        int r = mat.length;
        int c  = mat[0].length;

        for( int i=0; i<r;i++)
        {
            int low=0 ; int high=c-1;
            while(low<high)
            {
                int temp =mat[i][low];
                mat[i][low]=mat[i][high];
                mat[i][high] = temp;

                low++; high--;
            }
        }
    }
}
