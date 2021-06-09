Profile :https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link : https://practice.geeksforgeeks.org/viewSol.php?subId=e6b19af2e7300c5fa8227730a41dfb17&pid=701660&user=akshayanil

TC: O(n)
AS:O(1)

//Function to erase the element from specified position X in deque.
public static void eraseAt(ArrayDeque<Integer> deq , int x)
{
    //Your code here
    int count =0;
    
    for(int i=x+1; i<deq.size(); i++)
    {
        deq.addFirst(deq.removeLast());
        count++;
    }
    deq.removeLast();
     for(int i=0; i<count; i++)
    {
        deq.addLast(deq.removeFirst());
    }
}

//Function to erase the elements in range start (inclusive), end (exclusive).
public static void eraseInRange(ArrayDeque<Integer> deq , int start, int end)
{
    //Your code here
    int count =0;
     for(int i=end; i<deq.size(); i++)
    {
        deq.addFirst(deq.removeLast());
        count++;
    }
    for(int i=start ; i<end;i++)
    deq.removeLast();
    
    for(int i=0; i<count; i++)
    deq.addLast(deq.removeFirst());
    
}

//Function to erase all the elements in the deque.
public static void eraseAll(ArrayDeque<Integer> deq )
{
    //Your code here
    deq.clear();
}


Input:
5
1 2 4 5 6
1 2

Output: 
1 2 5 6 

Explanation: 
Here the query type is 1 
and the position is 2. So we remove 
element at position 2. The element at 
position 2 is 1 2 4 5 6. So, we remove 
4 and get 1 2 5 6.