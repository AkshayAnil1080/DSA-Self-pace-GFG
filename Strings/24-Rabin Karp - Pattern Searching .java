Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/rabin-karp-pattern-searching/1/?track=DSASP-Strings&batchId=154#

TC:  O(n+m) for avg cases  O((n-m+1)*m) - worst case
ASC: O(1)

class match
{
    static int d= 256;
    //Function to check if the pattern is present in string or not.
    static boolean search(String pat, String txt, int q)
    {
        // Your code here
        int n = txt.length(); int m =pat.length();
        int i=0; int j=0; int h=1;
        for(i=0; i<m-1;i++)
        {
            h= (h*d)%q;
        }
        
        int p=0; int t=0;
        for( i=0;i<m;i++)
        {
            p= (p*d +pat.charAt(i) )%q;
            t= (t*d + txt.charAt(i))%q;
        }
        
        for(i =0; i<=n-m;i++)
        {
            if(p==t)
              { boolean flag = true;
                for(j=0;j<m;j++)
                {    if(txt.charAt(i+j)!=pat.charAt(j)) { flag= false; break; }
                }
                if(flag==true) 
                return true;
              }
                
            if(i<n-m)
            {
                t = ( d*(t-txt.charAt(i)*h) + txt.charAt(i+m) ) %q;
                if(t<0) t=t+q;
            }
        }
        return false;
    }
}

Input:
S = aabaacaadaabaaba
P = aaba
Output: Yes
Explanation: You can find the patter at
starting at index 12.