package Arrays;
import java.util.*;
public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> bl = new ArrayList<>();
		int arr[] = {16,17,4,3,5,2} ;  // Output: 17 5 2
		
		bl = leaders(arr, arr.length);
		for( int items : bl)
			System.out.print(items+ " ");
	}
	
//	TC : O(n)
//	Aux Space: O(1)
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        
        int universal_leader = arr[n-1];
        for( int i = n-1 ; i>=0 ; i--)
        {
            if(universal_leader <= arr[i])
            {
                universal_leader = arr[i];
                al.add(universal_leader);
            }
        }
        
        Collections.reverse(al);
        return al;
    }
}
