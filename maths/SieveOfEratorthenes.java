package maths;

public class SieveOfEratorthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		if(n>=3)
		{
			System.out.print("2 "+ "3 ");
		}
		
		for( int i = 5 ; i<=n ; i=i+6)
		{
			System.out.print(i + " " + (i+2) + " ");
		
		}
			
		
	}

}

//TC :  logn