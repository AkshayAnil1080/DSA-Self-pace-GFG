Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/anagram-1587115620/1/?track=DSASP-Strings&batchId=154#
TC:  O(s1.length())
ASC: O(256)

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    static final int CHAR =256;
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        int n =a.length(); int m=b.length();
        if(n!=m) return false;
        int count[] = new int[CHAR];
        for( int i =0 ; i<n ;i++)
        {
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for( int i=0; i<256; i++)
        {
            if(count[i]!=0)
            return false;
        }
        return true;
        
    }
}


Input:
a = geeksforgeeks, b = forgeeksgeeks
Output: YES
Explanation: Both the string have same
characters with same frequency. So, 
both are anagrams.