https://practice.geeksforgeeks.org/viewSol.php?subId=7c8115fe4560a9f558a897abf5923074&pid=701136&user=akshayanil
https://practice.geeksforgeeks.org/problems/pair-sum-in-bst/1/?track=DSASP-BST&batchId=154#

TC: O(ht of BST)
SC: O(n)

class GFG
{
    //Function to check if any pair exists in BST
    //whose sum is equal to given value.
    static boolean findPair(Node root, int X)
    {
        // Your code

          HashSet<Integer> set = new HashSet<>();

          if(fun(root,set,X))
          return true;

          else
          return false;

    }

    static boolean fun(Node root, HashSet<Integer> set, int sum)
    {

        if(root==null) return false;
        if(fun(root.left,set,sum)==true) return true;

        if(set.contains(sum-root.data)) return true;
        else
        set.add(root.data);

        return fun(root.right,set,sum);
    }

}

Input:
      8
    /   \
   5     9
  / \
 1   3
X = 4
Output: 1
Explanation: For the given input, there
exist a pair whose sum is, i.e, (3,1).
