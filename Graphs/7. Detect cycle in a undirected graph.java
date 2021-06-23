Medium
https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1/?track=DSASP-Graph&batchId=154
https://practice.geeksforgeeks.org/viewSol.php?subId=9a627edca56835578fd74ebc267aff46&pid=700219&user=akshayanil

class Solution
{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // Code here
        boolean vis[] = new boolean[V];

        for( int i=0;i<V;i++)   //handles disconnected graph.
        {
            if(vis[i]==false)
            {
                if(DFS(adj, vis, i ,-1)==true)
                return true;
            }
        }
        return false;
    }

    static boolean DFS(ArrayList<ArrayList<Integer>> adj , boolean[] vis, int s , int parent)
    {
        vis[s] =true;
        for( int x : adj.get(s))
        {
            if(vis[x]==false)
            {
                if(DFS(adj,vis,x,s) == true) return true;
            }
            else if(x !=parent)
            return true;  // cycle exists
        }
        return false;

    }
}
