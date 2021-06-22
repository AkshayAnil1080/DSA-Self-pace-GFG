Medium
https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1/?track=DSASP-Graph&batchId=154

2 ways :
1. DFS : detecting backedge
TC: O(V+E), SC: O(V+E) - since DFS
https://practice.geeksforgeeks.org/viewSol.php?subId=48f468970197dbbd9ac787c9f9cbc04b&pid=700218&user=akshayanil
class Solution
{
    //Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here

        boolean vis[]= new boolean[V];
        boolean recSt[] = new boolean[V];
        for( int i=0; i <V;i++)       // handles disconnected graph too
        {
            if(vis[i]==false)
            {
                if(DFS(adj,vis,recSt,i)==true)
                return true;
            }
        }
        return false;
    }
    boolean DFS(ArrayList<ArrayList<Integer>> adj , boolean[] vis, boolean[] recSt, int s)
    {
        vis[s]=true; recSt[s]=true;

        for( int v : adj.get(s))
        {
            if(vis[v]==false)
            {
                if(DFS(adj,vis,recSt,v)==true) return true;
            }
            else if(recSt[v]==true)   // backedge
            {
                return true;
            }
        }
        recSt[s]=false;

        return false;
    }
}
2. Topological Sort
Idea : if cycle existss - > not be able to make indegeree of all vertex=0 -> these elements never get addedd in queue -> so count++ never occurs for them => Count!=V
	cycle DNE -> count==V

https://practice.geeksforgeeks.org/viewSol.php?subId=52b4a0d511be23360b344252485b1419&pid=700218&user=akshayanil

class Solution
{
    //Function to detect cycle in a directed graph.

    //using topological sort
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // code here
        int count=0;
        //1,
        Queue<Integer> q = new LinkedList<>();
        int indegree[] = new int[V];
        for( int i=0; i<V;i++)
        {
            for(int x : adj.get(i))
            indegree[x]++;
        }
        //2.
        for( int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            q.add(i);
        }

        //3
        while(!q.isEmpty())
        {
            int u =q.poll();
            // ans[ind++]=u;

            for( int v:  adj.get(u))
            if(--indegree[v]==0)
            q.add(v);

            count++;
        }

        if(count!=V)
        return true;

        return false;

    }
}
