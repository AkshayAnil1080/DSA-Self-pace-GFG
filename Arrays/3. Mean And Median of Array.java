https://practice.geeksforgeeks.org/problems/mean-and-median-1587115620/1/?track=DSASP-Arrays&batchId=154

class Solution
{
  //Function to find median of the array elements.  
  public int median(int A[],int N)
    {
    
       Arrays.sort(A);
       
       if(N%2!=0)
       return A[N/2];
       
       else
       {
           int num  = N/2;
          return  (A[num]+A[num-1])/2;
          
       }
       //Your code here
       //If median is fraction then conver it to integer and return
    }
    //Function to find median of the array elements.
    public int mean(int A[],int N)
    {
       //Your code here
        int sum  = 0 ;
    
       for( int i = 0; i <N; i++)
       sum +=A[i];
       
       return sum/N;
    }

}


N = 5
a[] = {1, 2, 19, 28, 5}
Output: 11 5
Explanation: For array of 5 elements,
mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
Median is 5 (middle element after 
sorting)