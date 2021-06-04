Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/binary-string-1587115620/1/?track=DSASP-Strings&batchId=154#


TC : O(n)
ASC: O(1)

class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code herent
        int res=0;
        int index=-1;
        for(int i=a-1 ;i>=0 ;i--)
        {
            if(str.charAt(i)=='1')
            {
                index++;
                res +=index;
            }
        }
        return res;
        
    }
}

Input:
N = 4
S = 1111
Output: 6
Explanation: There are 6 substrings from
the given string. They are 11, 11, 11,
111, 111, 1111.