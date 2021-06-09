Profile :https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link : https://practice.geeksforgeeks.org/problems/dequeue-traversal/1/?track=DSASP-Deque&batchId=154



TC: O(n)
AS:O(1)

//Function to rotate deque by k places in anti-clockwise direction.
public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deq, int n, int k)
{
    //Your code here
    for( int i =0 ; i<k ;i++)
    {
        deq.addLast(deq.removeFirst());
    }
}

//Function to rotate deque by k places in clockwise direction.
public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deq, int n, int k)
{
    //Your code here
    for( int i =0 ; i<k ;i++)
    {
        deq.addFirst(deq.removeLast());
    }
}


Input: 
6
1 2 3 4 5 6 
2 2 

Output: 
3 4 5 6 1 2 

Explanation: 
The dequeue is 1 2 3 4 5 6. 
The query type is 2 and k is 2. So, we 
need to left rotate dequeue by 2 times. 
In 1 left rotation we get 2 3 4 5 6 1. 
In another we get 3 4 5 6 1 2.