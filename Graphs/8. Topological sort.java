Medium
https://practice.geeksforgeeks.org/problems/topological-sort/1/?track=DSASP-Graph&batchId=154#
https://practice.geeksforgeeks.org/viewSol.php?subId=6b4d01226cff89c6f52a756390cb626f&pid=700255&user=akshayanil


BFS based sol :
class Solution
{
    //Function to return list containing vertices in Topological order.
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int ans[]= new int[V];
        int ind=0;
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
            ans[ind++]=u;

            for( int v:  adj.get(u))
            if(--indegree[v]==0)
            q.add(v);
        }
        return ans;
    }
}
