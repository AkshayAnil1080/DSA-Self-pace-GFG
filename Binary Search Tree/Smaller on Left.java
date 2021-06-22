https://practice.geeksforgeeks.org/viewSol.php?subId=bacfd0d0e0aad10f20f6d3e2561eca35&pid=703486&user=akshayanil
https://practice.geeksforgeeks.org/problems/smaller-on-left20360700/1#

TC: O(nlogn)
SC: O(n)
class Complete{


    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        int ans[] = new int[n];
        int index=0;
        ans[index++]=-1;

        TreeSet<Integer> set = new TreeSet<>();
        set.add(arr[0]);
        for(int i=1;i<n;i++)  // O(n)
        {
            if(set.lower(arr[i])!=null)   // O(logn)
            {
                ans[index++]=set.lower(arr[i]);

            }
            else
            {
                ans[index++]=-1;
            }
            set.add(arr[i]);
        }
        return ans;
    }
}


â€‹Input:
N = 5
arr[] = {2, 3, 4, 5, 1}
Output:
-1 2 3 4 -1
Explanation:
Greatest element on the left of 3 smaller
than itself is 2, for 4 it is 3 and for 5
it is 1. Since 2 is the first element and
no element on its left is present, so it's
greatest smaller element will be -1 and for
1 no element smaller than itself is present
on its left, so it's greatest smaller element
is -1.
