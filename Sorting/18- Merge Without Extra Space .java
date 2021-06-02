Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link:https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1/?track=DSASP-Sorting&batchId=154#

Expected Time Complexity:  O((n+m) log(n+m))
Expected Auxilliary Space: O(1)

class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int i = n-1;
        int j=0;
        while(i>=0 && j<m)
        {
        if(arr1[i] <=arr2[j])
        break;
        
        else
        {
            long temp = arr1[i];
            arr1[i] =arr2[j];
            arr2[j] =temp;
            i--; j++;
        }
       
        }
         Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}


Input: 
n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]
Explanation:
After merging the two 
non-decreasing arrays, we get, 
0 1 2 3 5 6 7 8 9.