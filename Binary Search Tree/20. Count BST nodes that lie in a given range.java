
https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1/?track=DSASP-BST&batchId=154#
https://practice.geeksforgeeks.org/viewSol.php?subId=ac517cffb6f3054f1254c9512e4c2b97&pid=700139&us

// TC :O(n) , SC: O(h)- max func call at a time
class Tree
{
    //Function to count number of nodes in BST that lie in the given range.

    int getCount(Node root,int l, int h)
    {
        //Your code here
       return fun(root,l,h);
    }

     int fun(Node root, int l , int h)
    {
        if(root==null) return 0;

        if(root.data <l)
        return fun(root.right,l,h);

        else if(root.data > h)
        return fun(root.left,l,h);

        else
        return 1+fun(root.left,l,h)+fun(root.right,l,h);


    }


}
