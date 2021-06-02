Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link:https://practice.geeksforgeeks.org/problems/merge-three-sorted-arrays-1587115620/1/?track=DSASP-Sorting&batchId=154#

Expected Time Complexity: O(N + M + P)
Expected Auxiliary Space: O(N + M + P) 
class Solution
{
    // A[], B[], C[]: input arrays
    //Function to merge three sorted lists into a single list.
    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[])
    {
        // add ypur code here
        int arr[] = merge(A,B);
        int ans[] = merge(arr,C);
        
        ArrayList<Integer> al = new ArrayList<>();
        for( int i =0 ; i<A.length+B.length+C.length ;i++)
        al.add(ans[i]);
        
        return al;
        
    }
   static int[] merge( int a[], int b[])
    {
        int n = a.length;
        int m =b.length;
        int k=0;
        int ans[] = new int[n+m];
        int i=0; int j =0; 
        while(i<n && j<m)
        {
            if(a[i] > b[j])
            {
                ans[k]=b[j];
                j++;k++;
            }
            else 
            {
                ans[k] =a[i];
                i++;k++;
            }
        }
        while(i<n)
        {ans[k]=a[i];
        i++; k++;
        }
        while(j<m)
        {
            ans[k]=b[j];
            j++;k++;
        }
        return ans;
    }
}

Input: 
N = 4, A[] = [1 2 3 4] 
M = 5, B[] = [1 2 3 4 5] 
P = 6, C[] = [1 2 3 4 5 6]
Output: 1 1 1 2 2 2 3 3 3 4 4 4 5 5 6
Explanation: Merging these three sorted 
arrays, we have: 
1 1 1 2 2 2 3 3 3 4 4 4 5 5 6.
