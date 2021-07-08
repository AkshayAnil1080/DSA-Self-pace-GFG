class Solution
{
    //Function to exchange first column of a matrix with its last column.
    static void exchangeColumns(int mat[][])
    {
        // code here
         int r = mat.length;
        int c  = mat[0].length;

        for( int i=0; i<r;i++)
        {
            int low=0 ; int high=c-1;


                int temp =mat[i][low];
                mat[i][low]=mat[i][high];
                mat[i][high] = temp;



        }
    }
}
