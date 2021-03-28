package Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,0,1,2,5};
		int n = arr.length;
		System.out.println(rainWater(arr,n));
		System.out.println(rainWat(arr,n));

		
		
	}
//	O(n^2)
	static int rainWater(int a[] ,  int n)
	{
		int ans = 0 ;
		
		for( int i =1 ; i<n-1; i++)
		{
			
			int lmax = a[i];   // max in left of i
			for(int j=0 ; j<i ;j++)
				lmax = Math.max(lmax, a[j]);
			
			// max in right of i
			int rmax = a[i];
			for(int j=i+1 ; j<n ;j++)
				rmax = Math.max(rmax, a[j]);
			
			ans += Math.min(lmax, rmax) - a[i];
			
			
		}
		return ans;
	}
//	O(n) - store lmax in lmax[] - O(n)
//		 	store rmax in rmax[] = O(n)
//		 	use these values for each i directly -O(n) - > O(n+n+n) = O(n)
	static int rainWat(int a[] ,  int n)
	{
		int ans = 0 ;
		int lmax[] =  new int[n];
		int rmax[] =  new int[n];
		
		lmax[0] = a[0];
		for(int i = 1 ; i<n; i++ )
			lmax[i] =  Math.max(lmax[i-1], a[i]);
		
		rmax[n-1] = a[n-1];
				for( int i=n-2 ; i>=0 ;i--)
				{
					rmax[i] = Math.max(rmax[i+1], a[i]);
				}
				
		for( int i = 0 ; i<n; i++)
			ans += ( Math.min(lmax[i], rmax[i]) - a[i] );
		
			
		return ans;
	}
	
}
