Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/distinct-pattern-search-1587115620/1/?track=DSASP-Strings&batchId=154

TC:  O(n+m)
ASC: O(1)

class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
        // Your code here
        int n = txt.length();
        int m = pat.length();
        int j=0;
        for( int i=0;i<n-m+1;)
        {
            for( j=0 ;j<m;j++)
            {
                if(pat.charAt(j)!=txt.charAt(i+j))
                break;
            }
            if(j==m) return true;
            else if(j==0) i++;
            else i=i+j;
        }
        return false;
    }
}

Input:
S = abceabcdabceabcd
P = abcd   // is distinct
Output: Yes
Explanation: Given pattern abcd is
present at index 4.