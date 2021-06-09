Profile :https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link : https://practice.geeksforgeeks.org/problems/insertion-in-deque/1/?track=DSASP-Deque&batchId=154#



TC: O(n)
AS:O(1)

class Solution
{
    //Function to insert all elements of the array in deque.
    public static ArrayDeque<Integer> deque_Init(int arr[], int n)
    {
        //Your code here
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for( int i =0; i <n;i++)
        {
            ad.addLast(arr[i]);
        }
        return ad;
    }
}


Input: 
5
1 2 3 4 5

Output: 
1 2 3 4 5

Explanation: 
After insert in the deque 
it will look like {1, 2, 3, 4, 5}.