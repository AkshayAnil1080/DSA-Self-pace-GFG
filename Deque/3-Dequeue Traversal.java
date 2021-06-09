Profile :https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link : https://practice.geeksforgeeks.org/problems/dequeue-traversal/1/?track=DSASP-Deque&batchId=154



TC: O(n)
AS:O(1)

public static void printDeque(ArrayDeque<Integer> deq)
{
   //Your code here
   for( int x : deq)
   System.out.print(x+ " ");
   System.out.println();
}


Input: 
5
1 2 3 4 5

Output: 
1 2 3 4 5

Explanation: 
Dqe will look like 
{1, 2, 3, 4, 5}.