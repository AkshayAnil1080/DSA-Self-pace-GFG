
https://practice.geeksforgeeks.org/problems/union-find/1/?track=DSASP-DisjointSet&batchId=154#
// TC: O(n)
// SC: O(n) - to store rank and parent
class Solution
{
    //Function to merge two nodes a and b.
    public void union_(int x, int y, int parent[], int rank[])
    {
        // add your code here
        int x_rep = find(x,parent);
        int y_rep = find(y,parent);
    if(rank[x_rep] < rank[y_rep])
    parent[x_rep] = y_rep;
   if(rank[x_rep] > rank[y_rep])
    parent[y_rep] = x_rep;
    else
    {
        parent[x_rep] = y_rep;
        rank[y_rep]++;
    }
    }

    //Function to check whether 2 nodes are connected or not.
    public boolean isConnected(int x, int y, int parent[], int rank[])
    {
        // add your code here
        if(find(x,parent) == find(y,parent) )
        return  true;
        return false;
    }
    int find(int x, int parent[])
    {
        if(parent[x]==x)
        return x;
        return find(parent[x],parent);
    }

}
