Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link:https://practice.geeksforgeeks.org/problems/pattern-search-kmp/1/?track=DSASP-Strings&batchId=154#

TC : O(n)	// n=txt.length()
ASC : O(m)	// m=pat.length()
class match
{
    //Function to fill lps[] for given patttern pat[0..M-1]. 
    void computeLPSArray(String pat, int M, int lps[]) // o(n)
    { 
	    // Your code here
	    lps[0] = 0;
	    int i=1;
	    int len=0;
	    while(i<M)
	    {
	        if(pat.charAt(i)==pat.charAt(len))
	        {
	            len++; lps[i]=len; i++;
	        }
	        else
	        {
	            if(len==0) {lps[i]=0; i++;}
	            else {len =lps[len-1];}
	        }
	    }
	
    }
    
    //Function to check if the pattern exists in the string or not.
    boolean KMPSearch(String pat, String txt) //O(n+2n) ~ O(n)
    {
        // Your code here
        int n=txt.length();int m =pat.length();
        int lps[]=new int[m];
        computeLPSArray(pat,m,lps);
        int i= 0; int j=0;
        while(i<n)
        {
            //1. if curr_char match
            if(pat.charAt(j)==txt.charAt(i)) { i++;j++;}
            
            //2. whole window match
            if(j==m) { return true;}
            
            //3. if curr_char do not match
            else if(i<n && pat.charAt(j)!=txt.charAt(i))
            {
                if(j==0) i++;  // first char itself do not match, ,move forwar in txt
                else { j=lps[j-1]; } // after some match mismatch occurs.
            }
        }
        return false;
    }
}
