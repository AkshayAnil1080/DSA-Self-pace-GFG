Profile: https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link: https://practice.geeksforgeeks.org/problems/counting-sort/1/?track=DSASP-Sorting&batchId=154#

Time Complexity: O(n+s) where n is the number of elements in input array and k is the range of input. 
Auxiliary Space: O(n+k)

class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String a)
    {
        // code here
        int n = a.length();
       
        char arr[] = a.toCharArray();
        
        String s="";
        int al[] =  new int[256];
        
        //.1 couting the frequency of each character
        for(int i= 0 ;i <n ;++i)
		{
		    al[arr[i]]++;
		}
		//2 prefix sum 
		for( int i =1; i<=255 ;++i)
		{
		    al[i] +=al[i-1];
		} 
	// 3  couting sort final step
	char ans[] = new char[n];
	for( int i=n-1; i>=0; i--)
	{
	    ans[ al[arr[i]] -1]  = arr[i];
	    --al[arr[i]];
	}
	
	
	String res = String.valueOf(ans);
	
		return res;
    }
}



Input:
N = 5
S = "edsab"
Output:
abdes
Explanation: 
In lexicographical order, string will be 
abdes.