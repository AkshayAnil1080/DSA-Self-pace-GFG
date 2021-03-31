class StrongestNeighbour{
    
    // Function to find maximum for every adjacent pairs in the array.
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        /*********************************
         * Your code here
         * Function should print max adjacents for all pairs
         * Use string buffer for fast output
         * ***********************************/
         for( int i = 1; i < sizeOfArray ;i++){
         
             System.out.print(Math.max(arr[i],arr[i-1])+" ");
             
             
         }
        
    }
}
Input:
n = 6
arr[] = {1,2,2,3,4,5}
Output: 2 2 3 4 5
Explanation: Maximum of arr[0] and arr[1]
is 2, that of arr[1] and arr[2] is 2, ...
and so on. For last two elements, maximum 
is 5
