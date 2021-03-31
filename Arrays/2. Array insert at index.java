// TC : O(n)
// AUX SC: O(1)
//User function Template for Java

//Complete this function, Geeks
class Solution
{
    // You need to insert the given element at the given index. 
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element)
    {
        //Your code here, Geeks
        
        for( int i=sizeOfArray-2 ; i>=index; i--)   // shifting each elemnet rightwards.
        {
            arr[i+1] = arr[i];
        }
        arr[index] = element;
    }


}


Input:
sizeOfArray = 6
arr[] = {1, 2, 3, 4, 5}
index = 5, element = 90
Output: 1 2 3 4 5 90
Explanation: 90 is inserted at index
5(0-based indexing). After inserting,
array elements are like
1, 2, 3, 4, 5, 90.