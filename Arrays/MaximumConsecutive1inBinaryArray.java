package Arrays;

public class MaximumConsecutive1inBinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,1,1,0,1,0};
		int b[] = {0,0,0,0};
		int c[] = {1,1,1,1};
		int d[] = {1,0,1,1,1,1,0,1,1};
		
		boolean e[] = {true,false,true,true,true,true,false,true,true}; // same as d[]
		System.out.println(f(e));
		
		System.out.println(fun(a , a.length));
		System.out.println(fun(b , b.length));
		System.out.println(fun(c , c.length));
		System.out.println(fun(d , d.length));
		
	}
	
	//O(n^2) - Naive -
	static int f( boolean arr[])
	{
		int res = 0 ;
		int n = arr.length;
		for(  int i = 0 ; i<n ;i++)
		{
			int curr = 0;
			for( int j =i ; j<n;j++)
			{
				if(arr[j]==true) curr++;
				else break;
			}
			res = Math.max(curr, res);
		}
		return res;
	}
	//O(n)
	static int fun( int a[] , int n)
	{
		int c = 0;
		int ans = 0;
		for( int i = 0 ;i<n ;i++)
		{
			if(a[i]  == 1)
				{
				c++;
				
				}

			else
			{	
				c=0;
			}
			
			ans = Math.max(ans,c);
		}
		
		return ans;
	}

}
