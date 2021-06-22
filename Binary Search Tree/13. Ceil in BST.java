https://practice.geeksforgeeks.org/viewSol.php?subId=f71791e3807fe774158a3cab8ef48577&pid=701135&user=akshayanil
https://practice.geeksforgeeks.org/problems/implementing-ceil-in-bst/1/?track=DSASP-BST&batchId=154

TC : O(ht of BST)
SC: O(1)
class Tree
{
    //Function to return the ceil of given number in BST.
    int findCeil(Node root, int key)
    {
        if (root == null)
            return -1;
        // Code here
          int res=-1;
        if(root==null) return -1;
        while(root!=null)
        {
        if(root.data>key)
        {
             res=root.data;
            root=root.left;
        }
        else if(root.data < key)
        {

            root=root.right;
        }
        else return root.data;
        }

        return res;

    }
}


Input:
      5
    /   \
   1     7
    \
     2
      \
       3
X = 3
Output: 3
Explanation: We find 3 in BST, so ceil
of 3 is 3
