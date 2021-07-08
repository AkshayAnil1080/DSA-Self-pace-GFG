class Solution 
{
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int mat[][], int n, int m, int x)
	{
	    // code here
	   // O(r+c): ptr at(righttop / left bottom) while(j>=0 && i<R) { if ele smaller move left, of greater move right)/
        int i=0;  int j =m-1;
        while(i<n && j>=0)
        {
            if(mat[i][j]==x)
            return true;

            else if(mat[i][j]>x)
            j--;
            else i++;
        }
        return false;
	}
}
