Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1/?track=DSASP-Strings&batchId=154#

TC: O(n) - finding indexOf
ASC: O(1)

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String s1, String s2)
    {
        // Your code here
        int n =s1.length();
        // if(n<2) return false;
         if(s1.length()!=s2.length()) return false;
         if(n>2 && s1.equals(s2)) return false;   // fdsalkjhfh  fdsalkjhfh

        //  System.out.println((s1+s1).indexOf(s2));
         
         int ans =(s1+s1).indexOf(s2);
         if(ans!=-1)   // b a ans=-1 / 1-2 =-1
         {
             if (ans==2 || ans==n-2 || ans==0)// b b 
             return true;       
         }
        return false;
    }
    
}

Input:
a = amazon
b = azonam
Output: 1
Explanation: amazon can be rotated anti
clockwise by two places, which will make
it as azonam.