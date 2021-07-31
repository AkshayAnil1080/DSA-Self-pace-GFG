class Solution
{
    //Function to find a Mother Vertex in the Graph.
    int c;
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int res= Integer.MAX_VALUE;

        boolean vis[] = new boolean [V];
        for( int i=0; i<V; i++)
        {
            c=0;
            dfs(adj,i,vis);
            if(c==V)
            {
                res = Math.min(res,i);
            }
            Arrays.fill(vis, false);
        }
        if(res == Integer.MAX_VALUE)
        return -1;

        return res;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj , int s, boolean vis[])
    {
        vis[s]=true;
        c++;

        for(int x : adj.get(s))
        { if(vis[x]==false)
        dfs(adj,x,vis);
        }
    }
}


// idea dfs:  TC : V*(V+E)
//1. do dfs for all vertex
//2 maintain vis[] , count, for DFS of each vertex
  // After each iteration, check if(count==V) { Math.min(res, i); Arrays.fill(vis,false) }
  // After all iterations, return res;
