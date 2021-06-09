Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link:https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1/?track=DSASP-Deque&batchId=154



TC: O(n)
AS: O(k)

class Solution{
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
      ArrayList<Integer> al = new ArrayList<>();
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // will use to create max heap
      
      
      for( int i=0; i<k ;i++)
      pq.add(arr[i]);
      
      al.add(pq.peek());
      // remove the first element of arr form pq=> as want to compare for next k elements
      pq.remove(arr[0]);
      
      for( int i=k ; i<n;i++)
      {
          pq.add(arr[i]);   // add the current element
          al.add(pq.peek());  ///store the max 
          pq.remove(arr[i-k+1]);   // remove the 2nd element in 1st iteratiion i.e the first elemet of every window.
      }
      
      return al;
      
    }
}




Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6