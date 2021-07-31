Question : https://practice.geeksforgeeks.org/problems/length-of-largest-region-of-1s-1587115620/1/?track=DSASP-Graph&batchId=154
class Solution
{
    int c;//Function to find unit area of the largest region of 1s.
    public int findMaxArea(int[][] grid)
    {
        // Code here
        int m=grid.length;
        int n = grid[0].length;
        int min = Integer.MIN_VALUE;
        for(int i =0;i<m; i++)
        {
            for( int j=0; j<n ;j++)
            {
                if(grid[i][j]==1)
                {
                    c=0;
                    dfs(grid, i,j,m,n);
                }
                min= Math.max(min,c);
            }
        }
        return min;

    }
    void dfs(int[][] grid ,int i, int j, int m , int n)
    {
        if(i<0 || i>=m || j<0 || j>=n)
        return;

        if(grid[i][j]==1)
        {
            grid[i][j]=0;
            c++;
            dfs(grid, i,j+1,m,n);
            dfs(grid, i,j-1,m,n);
            dfs(grid, i+1,j,m,n);
            dfs(grid, i-1,j,m,n);
            dfs(grid, i-1,j+1,m,n);
            dfs(grid, i+1,j+1,m,n);
            dfs(grid, i-1,j-1,m,n);
            dfs(grid, i+1,j-1,m,n);
        }
    }

}

// Idea: using dfs in all eight dir as soon as we get 1 in grid
// 1. nested loop for findning 1- intialize count=0; call dfs , after completion of dfs update res=Math.max(res,c);
// 2. in dfs - include safe condition , if value is 1, mark it 0, increment count , recur in all 8 dir
