
// TC: O(n)
// SC: O(1000000)
class Solution{
    //Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int L[], int R[], int n, int maxx){
        int arr[] = new int[1000000];
        for( int  i = 0; i<n ;i++)
        {
            arr[L[i]]++;
            arr[R[i]+1] --;
            
            
        }
        
        int max = arr[0] , res = 0;
        for( int i  = 1; i<1000000; i++)
        {
            arr[i] +=arr[i-1];
            if(max  <arr[i])
            {
                max =arr[i];
                res= i;
            }
        }
        return res;
        
    }
    
}