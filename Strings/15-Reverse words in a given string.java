Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1/?track=DSASP-Strings&batchId=154

TC: O(n^2)
ASC : O(n)

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        int n =S.length();
        char str[] = S.toCharArray();
        revWords(str, n);
        
   
        String res = String.valueOf(str);
        return res;
        
    }
    
    void revWords(char str[] ,int n )
    {
        int i=0;
        for(int j=0; j<n; j++)
        {
            if(str[j]=='.')
            {
                revChar(str,i,j-1);
                i=j+1;
            }
        }
        revChar(str,i,n-1);
        revChar(str,0,n-1);
    }
    
    void revChar(char str[], int low, int high)
    {
        while(low<=high)
        {
            char t = str[low];
            str[low] =str[high];
            str[high] =t;
            
            low++;
            high--;
        }
    }
}


Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i