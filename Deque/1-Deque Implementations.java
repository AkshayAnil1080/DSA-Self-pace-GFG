Profile :https://auth.geeksforgeeks.org/user/akshayanil/practice/
Link : https://practice.geeksforgeeks.org/problems/deque-implementations/1/?track=DSASP-Deque&batchId=154
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //Taking input using class Scanner
	    Scanner sc=new Scanner(System.in);
	    
	    //Taking count of testcases
	    int t=sc.nextInt();
	    
	    while(t-->0)
	    {
	        //Creating a new ArrayDeque
	        ArrayDeque<Integer> dq = new ArrayDeque<>();
	        
	        //Taking the total number of queries
	        int queries=sc.nextInt();
	        
	        while(queries-->0)
	        {
	            
	            //taking input the String and removing spaces from front and rear
	            String s=sc.next().trim();
	            
	          
	            //if query is push back
	            if(s.equals("pb"))
	            {
	                int x=Integer.parseInt(sc.nextLine().trim());
	                
        	   
        	        push_back_pb(dq, x);
        	        System.out.println(dq.peekLast());
    	        }
    	    
        	    // if query is to push front
        	    else if(s.equals("pf"))
        	    {
        	        int x=Integer.parseInt(sc.nextLine().trim());
        	    
        	        push_front_pf(dq, x);
        	        System.out.println(dq.peekFirst());
        	    }
    	    
    	        // if query is to pop back
        	    else if(s.equals("pp_b"))
        	    {
        	        pop_back_ppb(dq);
        	        System.out.println(dq.size());
        	    }
        	    
        	    // if query is to return front
        	    else
        	    {
        	         int x = front_dq(dq);
        	        System.out.println(x);
        	    }
	           
	        }
	    }
		
	}
	
	
 // } Driver Code Ends
//User function Template for Java

/* Function to push element to front
    * dq : dqueue in which element is to be pushed
    * x : element to be pushed
    */
    public static void push_back_pb(ArrayDeque<Integer> dq, int x){
        
        //Your code here
        dq.addLast(x);
        
        
    }
    
    /* Function to pop element from back
    * dq : dqueue From which element is to be popped
    */
    public static void pop_back_ppb(ArrayDeque<Integer> dq){
        
      //Your code here
      if(dq.isEmpty())
      return ;
      
       dq.pollLast();
        
    }
    
    /* Function to return element from front
    * dq : dqueue from which element is to be returned
    */
    public static int front_dq(ArrayDeque<Integer> dq){
        
      //Your code here
      if(dq.isEmpty())
      return -1;
      
      return dq.getFirst();
        
    }
    
    /* Function to push element to front
    * dq : dqueue in which element is to be pushed
    * x : element to be pushed
    */
    public static void push_front_pf(ArrayDeque<Integer> dq, int x){
        
      //Your code here
      dq.addFirst(x);
        
    }

// 


}  // } Driver Code Ends