// idea to use BFS,
//1. push all indexes of rotten tomatoes in Queue and then push a delimiter
// delimiter - to maintain the unit time  and number of phases required to convert all fresh to rotten
//2. now pop until del is reached and for each index check all four (right,up,left,dowm) points safe and equls to 1.
// if yes marked it rotten one and push to Queue
//3. while popping each item maintain flag and ans and increment ans++ just once in each phase.
//4. when deli reached pop the deli and check if q is not empty push deli again for next phase.
//5. At last when  q is empty return(if still any 1 remaining in grid) -1: ans;


class Pair
{
    int x; int y ;
    Pair(int x, int y)
    {
        this.x=x; this.y=y;
    }
}

class Solution
{
    //Function to find minimum time required to rot all oranges.

     boolean isSafe(int i , int j, int m,int n)
   {
       if(i<0 || i>=m || j<0 || j>=n)
       return false;
       return true;
   }

   boolean checkFor1(int grid[][])
   {
        int m =grid.length; int n =grid[0].length;
       for( int i =0;  i<m ; i++)
         {
             for( int j=0; j<n ;j++)
             {
                 if(grid[i][j]==1)
                        return true;
             }
         }
        return false;
   }
    static boolean isDelim(Pair temp)
    {
        return (temp.x == -1 && temp.y == -1);
    }


    public int orangesRotting(int[][] grid)
    {
        // Code here
        int m =grid.length; int n =grid[0].length; int ans=0;
        //1.
     Queue<Pair> q = new LinkedList<>();
     for( int i =0;  i<m ; i++)
         {
             for( int j=0; j<n ;j++)
             {
                 if(grid[i][j]==2)
                 q.add(new Pair(i,j));
             }
         }
      q.add(new Pair(-1,-1)); // deli , any integers which cannot be index of array

     while(!q.isEmpty())
     {
         boolean flag = false;
         //2.
         while(!isDelim(q.peek()))
         {
             Pair curr = q.remove();
             if(isSafe(curr.x+1, curr.y,m,n) && grid[curr.x+1][curr.y]==1)
             {
                 if(flag==false)  //3.
                 { flag = true; ans++;}
                grid[curr.x+1][curr.y]=2;

                q.add(new Pair(curr.x+1, curr.y));
             }

             if(isSafe(curr.x-1, curr.y,m,n) && grid[curr.x-1][curr.y]==1)
             {
                 if(flag==false)
                 { flag = true; ans++;}
                grid[curr.x-1][curr.y]=2;

                q.add(new Pair(curr.x-1, curr.y));
             }

             if(isSafe(curr.x, curr.y+1,m,n) && grid[curr.x][curr.y+1]==1)
             {
                 if(flag==false)
                 { flag = true; ans++;}
                grid[curr.x][curr.y+1]=2;
                
                q.add(new Pair(curr.x, curr.y+1));
             }

            if(isSafe(curr.x, curr.y-1,m,n) && grid[curr.x][curr.y-1]==1)
             {
                 if(flag==false)
                 { flag = true; ans++;}
                grid[curr.x][curr.y-1]=2;

                q.add(new Pair(curr.x, curr.y-1));
             }

         }
         //4
         q.remove(); // removing deli

         if(!q.isEmpty()) q.add(new Pair(-1,-1));
     }
     //5.
     return (checkFor1(grid))? -1: ans;
    }
}
