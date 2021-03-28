package Arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {2,3,-8,7,-1,2,3};  // o/p -11 = 7-1+2+3
		 System.out.println(max(arr,arr.length));
		 System.out.println(m(arr,arr.length));
		 
	}
	
	// O(n^2) -  Naive
	static int max( int arr[]  , int n)
	{
		int res = arr[0];
		for ( int i =0 ; i<n; i++)
		{
			int curr =0  ;
			for( int j = i ; j<n; j++)
			{
				curr += arr[j];
				res = Math.max(res,curr);
			}
		}
		
		return res;
	}
	
	//O(n) - efficient
	static int  m(int arr[] , int n)
	{
		int res = 0, curr =0;
		
		for( int i = 0 ; i <n ;i++)
		{
			if(curr+arr[i] >0)
				curr  = curr +arr[i];
			else curr =0;
			
			res = Math.max(res,curr);
		}
			return res;
	}
	

}
