package maths;

public class trailingaZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100; 
		int ans = 0; 
		int res = 0 ;
		while(n >=5)
			
		{
			ans = n/5;
			res= res +ans;
			n = n /5;
		}
		System.out.println(res);
	}

}
