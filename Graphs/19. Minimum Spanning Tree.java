
https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1/?track=DSASP-Graph&batchId=154
https://practice.geeksforgeeks.org/viewSol.php?subId=e0584fd3e0b733dd900fa3639fb04e9a&pid=700343&user=akshayanil
TC: O(V(V+E))
SC :O(2V)

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj)
    {
        // Add your code here

        int res=0;
        int key[] = new int[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0]=0;

        boolean mset[] =  new boolean [V];

        for(int count =0; count<V;count++)
        {
            int u =-1;
            //deciding vertex
            for(int i=0; i<V;i++)
            {
                if(!mset[i] && (u==-1 || key[i] < key[u]))
                u=i;
            }
            mset[u]=true;
            res += key[u];

            // go trough adj of u
            for(ArrayList<Integer> al : adj.get(u))
            {

                    if(!mset[al.get(0)] && al.get(0)!=0 && al.get(1)<key[al.get(0)] )
                    key[al.get(0)] = al.get(1);

            }

        }
        return res;
    }
}
