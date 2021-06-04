Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/naive-pattern-search-1587115620/1/?track=DSASP-Strings&batchId=154

TC:  O((n+m-1)*m)
ASC: O(1)

class Solution
{
    //Function to check if the given pattern exists in the given string or not.
    static boolean search(String pat, String txt)
    {
            // Your code here
            int m=pat.length();
            
            int n=txt.length();
            int j=0;
            for( int i=0 ; i<n-m+1;i++)
            {
                for( j=0;j<m;j++)
                {
                    if(pat.charAt(j)!=txt.charAt(i+j))
                    {
                       break;
                    }
                }
                if(j==m)
                    return true;
            }
            return false;
    }
    
}

Input:
S = aabaacaadaabaaabaa
P = aaba
Output: Yes
Explanation: Given pattern aaba is found
in the string at index 0.