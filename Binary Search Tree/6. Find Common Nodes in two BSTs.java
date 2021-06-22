
https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1/?track=DSASP-BST&batchId=154#
https://practice.geeksforgeeks.org/viewSol.php?subId=84ed802b9f580330607c12721de9e196&pid=700500&user=akshayanil

TC:O(N1+N2)
SC:O(n1+h1+h2)

class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al =new ArrayList<Integer>();
        
        inorder(root1,set);
        in(root2,set,al);

        return al;

    }
    static void inorder(Node root1, HashSet<Integer> set)
    {
        if(root1==null) return;

        inorder(root1.left, set);
        set.add(root1.data);
        inorder(root1.right,set);
    }

    static void in(Node root2,HashSet<Integer> set, ArrayList<Integer> al )
    {
        if(root2==null) return;

        in(root2.left,set,al);
        if(set.contains(root2.data)) al.add(root2.data);
        in(root2.right,set,al);
    }
}
