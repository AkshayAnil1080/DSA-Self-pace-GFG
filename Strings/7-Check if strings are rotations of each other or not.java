Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link:https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1/?track=DSASP-Strings&batchId=154

TC:  O(n)
ASC: O(1)
class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        if(s1.length()!=s2.length()) return false;
        return ((s1+s1).indexOf(s2)>=0);
    }
    
}

Input:
geeksforgeeks
forgeeksgeeks
Output: 
1
Explanation: s1 is geeksforgeeks, s2 is
forgeeksgeeks. Clearly, s2 is a rotated
version of s1 as s2 can be obtained by
left-rotating s1 by 5 units.
 