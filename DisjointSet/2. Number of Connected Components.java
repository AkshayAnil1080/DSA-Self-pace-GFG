https://practice.geeksforgeeks.org/problems/number-of-connected-components/1/?track=DSASP-DisjointSet&batchId=154#
// TC: O(n)
// SC :O(1) 
class Solution
{

    //Function to merge two nodes a and b.
    static void unionNodes( int x, int y, int arr[], int rank[], int n)
    {
        // add your code
       int x_rep = find(x,arr);
        int y_rep = find(y,arr);
        if(rank[x_rep] < rank[y_rep])
            arr[x_rep] = y_rep;
        if(rank[x_rep] > rank[y_rep])
            arr[y_rep] = x_rep;
        else
        {
            arr[x_rep] = y_rep;
            rank[y_rep]++;
        }

    }

    //Function to determine number of connected components.
    static int findNumberOfConnectedComponents( int n, int arr[], int rank1[])
    {
  // Idea : count distinct parent in parent[] -> total number of representative
  // 1. if(find(i,arr)==i))==i c++;  -> no space req
  // 2. put all parents in set and return size -> space req O(n)
      int c = 0;
      for( int i =1; i<=n;i++)
      {
          if(find(i,arr)==i)   // if x's parent is x itself - > unique parent
          c++;
      }
      return c;
    }

   static int find(int x, int parent[])
    {
        if(parent[x]==x)
        return x;
        return find(parent[x],parent);
    }
}
