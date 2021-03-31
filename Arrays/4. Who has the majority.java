

class Solution {
    // Function to find element with more appearances between two elements in an
    // array.
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int c1=0, c2=0;
     
        for( int i = 0; i <n;i++)
        {
            if(arr[i] ==x)
            c1++;
            if(arr[i] ==y)
            c2++;
        }
         
          if(c1>c2)
          return x;
          
          else if(c1<c2)
          return y;
           
          else if(c1==c2)
          return Math.min(x,y);
          
          return -1;
         
    }
}



Input:
N = 11
arr[] = {1,1,2,2,3,3,4,4,4,4,5}
x = 4, y = 5
Output: 4
Explanation: 
frequency of 4 is 4.
frequency of 5 is 1.